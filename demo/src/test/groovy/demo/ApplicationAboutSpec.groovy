package demo

import demo.pages.ApplicationAboutPage
import demo.pages.ApplicationPage
import geb.spock.GebReportingSpec
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.testcontainers.containers.BrowserWebDriverContainer
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.Network
import spock.lang.Shared

class ApplicationAboutSpec extends GebReportingSpec {
    @Shared
    Network network = Network.newNetwork();

    @Shared
    GenericContainer app = new GenericContainer("madmas/mydemoimage:latest")
            .withNetwork(network)
            .withNetworkAliases("app")

    @Shared
    BrowserWebDriverContainer firefox = new BrowserWebDriverContainer()
            .withCapabilities(new FirefoxOptions())
            .withNetwork(network)

    def setupSpec() {
        app.start()

        firefox.start()

        println firefox.vncAddress
        browser.driver = firefox.webDriver
        baseUrl = "http://app/index.html"
    }

    def "buzzwords are listed on about page"() {
        when: "navigating to the application"
        to ApplicationPage

        and: "clicking the menu to switch to the about page"
        waitFor { topMenu }
        topMenu.aboutButton.click()

        then: "the about page is shown"
        at ApplicationAboutPage

        then: "and the buzzwords are loaded from the server"
        waitFor { buzzwordListItems }
        buzzwordListItems.size() == 3
    }
}

package demo

import demo.pages.ApplicationAboutPage
import demo.pages.ApplicationContactPage
import demo.pages.ApplicationPage
import geb.spock.GebReportingSpec
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.testcontainers.containers.BrowserWebDriverContainer
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.Network
import spock.lang.Shared
import spock.lang.Stepwise

@Stepwise
class ApplicationContactSpec extends GebReportingSpec {
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

    def "contact details are listed on contact page"() {
        when: "navigating to the application"
        to ApplicationPage

        and: "clicking the menu to switch to the about page"
        topMenu.contactButton.click()

        then: "the contact page is shown"
        at ApplicationContactPage

        then: "and the contact details are listed"
        contactList.size() == 2
    }

    def "back to about and verify"() {
        when:
        topMenu.aboutButton.click()

        then:
        at ApplicationAboutPage

        then: "check then criterias again"
        buzzwordListItems.size() == 3
    }
}

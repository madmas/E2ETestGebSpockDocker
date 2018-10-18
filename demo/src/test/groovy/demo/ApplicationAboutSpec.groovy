package demo

import demo.pages.ApplicationAboutPage
import demo.pages.ApplicationPage
import geb.spock.GebReportingSpec
import org.openqa.selenium.remote.DesiredCapabilities
import org.testcontainers.containers.BrowserWebDriverContainer
import spock.lang.Shared

class ApplicationAboutSpec extends GebReportingSpec {

    @Shared
    BrowserWebDriverContainer firefox = new BrowserWebDriverContainer().withDesiredCapabilities(DesiredCapabilities.firefox())

    def setupSpec() {
        firefox.start()
        println firefox.vncAddress
        browser.driver = firefox.webDriver
        baseUrl = "http://docker.for.mac.localhost:5050/index.html"

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

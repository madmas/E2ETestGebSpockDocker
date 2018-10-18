package demo

import demo.pages.ApplicationAboutPage
import demo.pages.ApplicationPage
import geb.spock.GebReportingSpec

class ApplicationAboutSpec extends GebReportingSpec {

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

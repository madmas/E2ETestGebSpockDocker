package demo

import demo.pages.ApplicationAboutPage
import demo.pages.ApplicationContactPage
import demo.pages.ApplicationPage
import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class ApplicationContactSpec extends GebReportingSpec {

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

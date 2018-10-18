package demo.pages

import demo.modules.MenuModule
import geb.Page

class ApplicationAboutPage extends Page {

    static at = { $('h2#subtitle').text() == "About this Application" }

    static content = {
        topMenu { $(".header .nav", 0).module(MenuModule) }
        buzzwordListItems { $("#remoteItems li") }
    }
}

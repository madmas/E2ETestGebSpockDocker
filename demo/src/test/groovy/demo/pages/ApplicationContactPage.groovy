package demo.pages

import demo.modules.MenuModule
import geb.Page

class ApplicationContactPage extends Page {

    static at = { $('h2#subtitle').text() == "Contact for this Application" }

    static content = {
        topMenu { $(".header .nav", 0).module(MenuModule) }
        contactList { $("#contacts li") }
    }
}

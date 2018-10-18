package demo.pages

import demo.modules.MenuModule
import geb.Page

class ApplicationPage extends Page {
    static url = "index.html"

    static at = { title == "E2E Testing: Docker+Geb: Demo Application" }

    static content = {
        topMenu { $(".header .nav", 0).module(MenuModule) }
    }
}

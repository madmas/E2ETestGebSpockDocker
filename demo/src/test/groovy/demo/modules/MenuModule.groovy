package demo.modules

import geb.Module

class MenuModule extends Module {

    static content = {
        homeButton { $('li#home') }
        aboutButton { $('li#about') }
        contactButton { $('li#contact') }
    }
}

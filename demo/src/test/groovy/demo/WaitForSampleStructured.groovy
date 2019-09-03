package demo

import geb.Browser
import geb.Module
import geb.Page

class Homepage extends Page {
    static url = "https://www.mynethome.de/animation.html"

    static at = { title == "Animation For Waitfor Example" }
    static content = {
        actionText { $("div#app h3").text() }
        fadeButton { $("div#app button") }
        modalBox(required: false) { $("div.modal").module(ModalBoxModule) }
    }

    void openModal() {
        fadeButton.click()
        waitFor { !modalBox.hasClass("fade-enter-active") }
    }

}

class ModalBoxModule extends Module {
    static content = {
        title { $("div.modal h2").text() }
        button { $("div.modal button") }
    }

    void close() {
        button.click()
    }
}


Browser.drive {
    Page p = to Homepage

    assert "Show us the modal!" == actionText
    p.openModal()

    assert p.modalBox.displayed && !p.modalBox.hasClass("fade-enter-active")
    assert "Here I am!" == p.modalBox.title

    p.modalBox.close()
    waitFor { !p.modalBox.hasClass("fade-leave-active") }

    assert modalBox.displayed == false
}



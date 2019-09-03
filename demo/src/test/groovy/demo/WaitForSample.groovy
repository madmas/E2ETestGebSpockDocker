package demo

import geb.Browser

Browser.drive {
    go "https://www.mynethome.de/animation.html"

    assert title == "Animation For Waitfor Example"

    assert "Show us the modal!" == $("div#app h3").text()

    $("div#app button").click()
    waitFor { !$("div.modal").hasClass("fade-enter-active") }


    assert $("div.modal").displayed && !$("div.modal").hasClass("fade-enter-active")
    assert "Here I am!" == $("div.modal h2").text()

    $("div.modal button").click()
    waitFor { !$("div.modal").hasClass("fade-leave-active") }

    assert $("div.modal").displayed == false
}



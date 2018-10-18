package demo

import geb.Browser

Browser.drive {
    go "https://mynethome.de/animation.html"

    assert title == "Animation For Waitfor Example"

    $("div#app button").click()
    waitFor { !$("div.modal").hasClass("fade-enter-active") }

    $("div.modal button").click()
    waitFor { !$("div.modal").hasClass("fade-leave-active") }

}



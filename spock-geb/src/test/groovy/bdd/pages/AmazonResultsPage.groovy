package bdd.pages

import geb.Page

class AmazonResultsPage extends Page {

    // TODO: Figure out how to get the title check to be dynamic
    static at = { title.startsWith == "Amazon.com: Game of Thrones" }

    static content = {

        results { $("div", id: "atfResults") }
        topResult { $() }
    }
}

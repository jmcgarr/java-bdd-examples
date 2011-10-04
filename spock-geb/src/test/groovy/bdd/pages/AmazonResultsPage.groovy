package bdd.pages

import geb.Page

class AmazonResultsPage extends Page {

    // TODO: Figure out how to get the title check to be dynamic
    static at = { title == "Amazon.com: Game of Thrones" }

    static content = {

        results { $("div", id: "atfResults") }
        topResultTitle { $("div#result_0 div.data div.title a").text() }
    }
}

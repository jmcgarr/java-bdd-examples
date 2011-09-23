package bdd.pages

import bdd.pages.SearchForm.DEPARTMENTS

class HomePage {

    def url = "www.amazon.com"
    def searchForm = new SearchForm(url: url)

    void open(){

    }

    void searchForBook (String title) {
        searchForm.search(DEPARTMENTS.BOOKS, title)
    }
}

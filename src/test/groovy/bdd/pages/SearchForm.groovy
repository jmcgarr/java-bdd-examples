package bdd.pages

class SearchForm {

    public enum DEPARTMENTS {
        ALL("search-alias=aps"),
        BOOKS("search-alias=stripbooks")
    }

    def url
    def method = "GET"
    def action = "/s/ref=nb_sb_noss"
    def searchField = "twotabsearchtextbox"
    def searchDropDown = "searchDropdownBox"

    void search(String title) {
        search(DEPARTMENTS.ALL, title)
    }

    void search(String department, String title) {

    }
}

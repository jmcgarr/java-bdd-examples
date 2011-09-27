package bdd.spock

import geb.spock.GebReportingSpec
import bdd.pages.*

class SearchForBookByTitleSpec extends GebReportingSpec {

    def "Loads the Amazon Homepage"() {
        when: "I navigate to Amazon.com"
        to AmazonHomePage

        then: "the homepage is displayed"
        at AmazonHomePage
    }

    def "HomePage loads the Search Form"() {
        when: "I navigate to Amazon.com"
        to AmazonHomePage

        then: "the homepage is displayed"
        at AmazonHomePage

        and: "the search form is available"
        searchForm
    }

    def "Search for Book by Full Title"() {

        given: "I'm on the homepage"
        to AmazonHomePage

        expect:
        at AmazonHomePage

        //when: "I search for 'Game of Thrones'"
        //search.keywords.value('Game of Thrones')
        //searchButton.click()

        //then: "a list of books is displayed"
        //at AmazonResultsPage

        //and: "the 'Game of Thrones' is displayed first"
    }
}

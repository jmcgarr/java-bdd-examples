package bdd.spock

import geb.spock.GebReportingSpec
import groovy.bdd.pages.*

class SearchForBookByTitleSpec extends GebReportingSpec {

    def "Search for Book by Full Title"() {

        given: "I'm on the homepage"


        when: "I search for 'Game of Thrones'"


        then: "a list of books is displayed"


        and: "the 'Game of Thrones' is displayed first"
    }
}

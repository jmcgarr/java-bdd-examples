import bdd.pages.AmazonHomePage

using "geb"

scenario "Loads the Amazon Homepage", {

    when "I navigate to Amazon.com", {
        to AmazonHomePage
    }

    then "the homepage is displayed", {
        at AmazonHomePage
    }

}
package bdd.pages

import geb.Page

class AmazonHomePage extends Page {

    static url = "http://www.amazon.com"
    static at = { title == "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more" }

     static content = {
         search { $("form", name: "site-search") }
         keywords { $("input", name: "field-keywords") }
         //searchBy { $("select", name: "url") }
         //search { $("input", ) }
     }
}

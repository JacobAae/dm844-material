package dk.dm844.bsg

import grails.validation.Validateable
import groovy.transform.ToString

class ShipSearchController {

    ShipSearchService shipSearchService

	static defaultAction = "searchForShip"

    def index() {
        render("This is the default action")
    }

    def lessDemo() {

    }

    def search1() {
        String shipname = params.shipname
        Integer minCrew = params.int('minCrew')
        Integer maxCrew = params.int('maxCrew')

        render("Shipname: $shipname - crew: $minCrew - $maxCrew")
    }

    def search2(String shipname, Integer minCrew, Integer maxCrew) {
        render("Shipname: $shipname - crew: $minCrew - $maxCrew")
    }

    def search3(SearchCommand command) {
        render("Shipname: $command.shipname - crew: $command.minCrew - $command.maxCrew")
    }

    def search4() {
        SearchCommand command = new SearchCommand()
        bindData(command , params )
        render("Shipname: $command.shipname - crew: $command.minCrew - $command.maxCrew")
    }


	def searchForShip() {
		[searchInputCommand: new SearchCommand()]
	}

    def search(SearchInputCommand command) {
        List<Ship> ships = shipSearchService.searchForShips(command)
	    if(command.hasErrors()) {
		    render( view: 'searchForShip', model: [searchInputCommand: command])
		    return
	    }
        [ships: ships]
    }

    def showLogging() {
        log.trace("I'm a TRACE log")
        log.debug("I'm a DEBUG log")
        log.info("I'm a INFO log")
        log.warn("I'm a WARN log")
        log.error("I'm a ERROR log")
        render("Logging demo")
    }


    def statistics() {
        [numberOfShips: 42, averagePopulation: 1337] // <1>
    }

	def showShip() {
		[ship: new Ship(name: 'Battlestar Galactica', crewsize: 2450)]
	}

	def show() {
		render( view: 'showShip', model: [ship: new Ship(name: 'Battlestar Galactica', crewsize: 2450)])
	}

    def addQuote(String quote) {

	    render "OK"
    }

	def chuckNorris() {



		[]
	}

}

class SearchCommand {
    String shipname
    Integer minCrew
    Integer maxCrew
}

@ToString(includeNames=true)
class SearchInputCommand {
    String shipname
    Integer minCrew
    Integer maxCrew

    static constraints = {
        shipname blank: false
        minCrew min: 0, validator: { val, obj -> val < obj.maxCrew }
        maxCrew min: 1, validator: { val, obj -> val > obj.minCrew }

    }
}
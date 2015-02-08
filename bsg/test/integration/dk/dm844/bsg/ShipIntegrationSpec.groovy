package dk.dm844.bsg

import grails.test.spock.IntegrationSpec

class ShipIntegrationSpec extends IntegrationSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "Test saving and retrieving a Ship"() {
	    given:
	    Ship ship = fullyPopulatedShip

	    expect:
	    ship.validate()

	    when:
	    ship.save()

	    then:
	    Ship.get(ship.id).name == 'Battlestar Galactica'
    }

	void "Test the findBy functionality"() {
		setup:
		createShipsInTheDatabase()

		when:
		Ship ship = Ship.findByName('Cloud 9')

		then:
		ship
		ship.crewsize == 6542
	}

	void "Test the findAllBy functionality"() {
		setup:
		createShipsInTheDatabase()

		when:
		List<Ship> ships = Ship.findAllByShiptype( Shiptype.MILITARY )

		then:
		ships
		ships.size() == 2
		ships*.name.containsAll(['Battlestar Galactica', 'Battlestar Pegasus'])
	}

	void "Test the findAllBy functionality with multiple criterias"() {
		setup:
		createShipsInTheDatabase()

		when:
		List<Ship> ships = Ship.findAllByShiptypeAndNameIlike( Shiptype.MILITARY , '%star%')

		then:
		ships
		ships.size() == 2
		ships*.name.containsAll(['Battlestar Galactica', 'Battlestar Pegasus'])
	}

	Ship getFullyPopulatedShip() {
		new Ship(
				name: "Battlestar Galactica",
				crewsize: 1337,
				productionDate: new Date(),
				description: "Military headquarter",
				shiptype: Shiptype.MILITARY
		)
	}

	private createShipsInTheDatabase() {
		[
		        ['Battlestar Galactica', 1337, Shiptype.MILITARY],
		        ['Battlestar Pegasus', 2143, Shiptype.MILITARY],
		        ['Colonial One', 142, Shiptype.ADMINISTRATION],
		        ['Astral Queen', 564, Shiptype.ACCOMODATION],
		        ['Cloud 9', 6542, Shiptype.ACCOMODATION]

		].each {
			new Ship(name: it[0], crewsize: it[1], shiptype: it[2], description: 'N/A', productionDate: new Date()).save(failOnError: true)
		}
	}

}

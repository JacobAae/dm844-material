package dk.dm844.bsg

import spock.lang.Specification
import grails.buildtestdata.mixin.Build

@Build(Ship)
class ShipUnitSpec extends Specification {

	void "Show build method"() {
		setup:
		Ship.build(name: 'Demetrius')

		when:
		Ship ship = Ship.findByName('Demetrius')

		then:
		ship
		ship.shiptype
		ship.crewsize == 8
	}

	void "Test DataConfig for name"() {
		setup:
		10.times {
			Ship.build()
		}

		when:
		def names = Ship.list()*.name
		println names

		then:
		names.every { it ==~ /Ship \d+/ }
		names.unique().size() == 10
	}

}
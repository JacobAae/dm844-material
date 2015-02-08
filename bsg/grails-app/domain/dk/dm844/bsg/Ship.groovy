package dk.dm844.bsg

import groovy.transform.ToString

@ToString(includeNames = true)
class Ship {

	String name
	Shiptype shiptype
	Integer crewsize
	Date productionDate
	String description

    static constraints = {
	    name unique: true, blank: false
	    crewsize min: 8
	    description nullable: true, blank: true
    }
}

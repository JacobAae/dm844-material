package dk.dm844.groovyintro

import groovy.dk.dm844.groovyintro.Battlestar

class GroovyTruth {

	void groovyTruth() {

		//tag::truth1[]
		assert true
		assert !false
		//end::truth1[]

		//tag::truth2[]
		assert ["Groovy"]
		assert ![]
		//end::truth2[]

		//tag::truth3[]
		assert "Non empty string"
		assert !""
		//end::truth3[]

		//tag::truth4[]
		def n = 0
		assert 12
		assert !n
		//end::truth4[]

		//tag::truth5[]
		def a = new Object()
		def b

		assert a
		assert !b
		assert !null
		//end::truth5[]

		//tag::truth6[]
		assert new Raptor(name: 'Still functioning')
		assert !new Raptor(name: 'Lost in battle', wentMissing: new Date(1997-1900, 4,6) )
		//end::truth6[]

	}

	Battlestar constructorDemoA() {

		//tag::constructor1[]
		def battlestar = new Battlestar()
		battlestar.name = "Galactica"
		battlestar.crewsize = 1782
		battlestar.produced = new Date(1975-1900, 4,6)
		//end::constructor1[]

		battlestar
	}
	Battlestar constructorDemoB() {

		//tag::constructor2[]
		def battlestar = new Battlestar( name: "Galactica", crewsize: 1782, produced: new Date(1975-1900, 4,6) )
		//end::constructor2[]

		battlestar
	}


}

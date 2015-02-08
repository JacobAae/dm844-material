package dk.dm844.groovyintro

import spock.lang.Specification

class SpockDemo extends Specification {

	void "Minimal Example of a spock test"() {
		expect:
		21 * 2 == 42
	}
}
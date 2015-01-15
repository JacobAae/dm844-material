package dk.dm844.groovyintro

//tag::raptor[]
class Raptor {

	String name
	Date wentMissing

	boolean asBoolean() {
		wentMissing == null
	}
}
//end::raptor[]

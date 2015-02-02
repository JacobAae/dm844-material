package dk.dm844.groovyintro

import spock.lang.Specification


/**
 * Created by jacob on 28-01-15.
 */
class MetaprogrammingExamplesSpec extends Specification {

	void "Test expando example"() {
		given:
		MetaprogrammingExamples mpe = new MetaprogrammingExamples()

		when:
		mpe.demoExpando()

		then:
		noExceptionThrown()
	}


	void "Test expando with arguments example"() {
		given:
		MetaprogrammingExamples mpe = new MetaprogrammingExamples()

		when:
		mpe.demoExpandoWithArguments()

		then:
		noExceptionThrown()
	}

	void "Test method missing example"() {
		given:
		MetaprogrammingExamples mpe = new MetaprogrammingExamples()

		when:
		mpe.quorumMemberMissingMethod()

		then:
		noExceptionThrown()
	}

	void "Test get and set dynamic properties"() {
		given:
		MetaprogrammingExamples mpe = new MetaprogrammingExamples()

		when:
		mpe.quorumMemberSetAndGetProperty()

		then:
		noExceptionThrown()
	}

	void "Test simple metaclass example"() {
		given:
		MetaprogrammingExamples mpe = new MetaprogrammingExamples()

		when:
		mpe.stringMetaclassExampleSimple()

		then:
		noExceptionThrown()
	}


	void "Test metaclass example"() {
		given:
		MetaprogrammingExamples mpe = new MetaprogrammingExamples()

		when:
		mpe.stringMetaclassExample()

		then:
		noExceptionThrown()
	}




}
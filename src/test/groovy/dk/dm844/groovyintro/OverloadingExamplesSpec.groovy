package dk.dm844.groovyintro

import spock.lang.Specification

class OverloadingExamplesSpec extends Specification {


	void "Check knownOverloading"() {
		setup:
		OverloadingExamples examples = new OverloadingExamples()

		when:
		examples.knownOverloading()

		then:
		noExceptionThrown()
	}

	void "Check showMoneyOverloadingExample"() {
		setup:
		OverloadingExamples examples = new OverloadingExamples()

		when:
		examples.showMoneyOverloadingExample()

		then:
		noExceptionThrown()
	}

}
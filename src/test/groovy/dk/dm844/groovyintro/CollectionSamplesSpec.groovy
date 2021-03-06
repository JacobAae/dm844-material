package dk.dm844.groovyintro

import spock.lang.Specification


class CollectionSamplesSpec extends Specification {

    void "Check both lists are the same"() {
        when:
        JavaCollectionSamples javaCollectionSamples = new JavaCollectionSamples()
        GroovyCollectionSamples groovyCollectionSamples = new GroovyCollectionSamples()

        then:
        javaCollectionSamples.listExample() == groovyCollectionSamples.listExample()
    }

    void "Test maps are correct"() {
        setup:
        GroovyCollectionSamples groovyCollectionSamples = new GroovyCollectionSamples()

        when:
        groovyCollectionSamples.mapExample()

        then:
        noExceptionThrown()
    }

	void "Test range are correct"() {
		setup:
		GroovyCollectionSamples groovyCollectionSamples = new GroovyCollectionSamples()

		when:
		groovyCollectionSamples.rangeExample()

		then:
		noExceptionThrown()
	}

	void "Test sets are correct"() {
		setup:
		GroovyCollectionSamples groovyCollectionSamples = new GroovyCollectionSamples()

		when:
		groovyCollectionSamples.setExample()

		then:
		noExceptionThrown()
	}


	void "Test as Map"() {
		setup:
		GroovyCollectionSamples groovyCollectionSamples = new GroovyCollectionSamples()

		when:
		groovyCollectionSamples.asExample()

		then:
		noExceptionThrown()
	}




}
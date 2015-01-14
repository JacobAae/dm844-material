package groovy.dk.dm844.grovyintro

import dk.dm844.groovyintro.JavaCollectionSamples
import groovy.dk.dm844.groovyintro.GroovyCollectionSamples
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

}
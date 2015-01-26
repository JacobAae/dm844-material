package groovy.dk.dm844.grovyintro

import groovy.dk.dm844.groovyintro.LoopExamples
import spock.lang.Specification

class LoopExamplesSpec extends Specification {

    void "Check getPilots"() {
        given:
        LoopExamples loopExamples = new LoopExamples()

        expect:
        loopExamples.pilots.size() == 4
    }

    void "Check demoForLoop"() {
        given:
        LoopExamples loopExamples = new LoopExamples()

        when:
        loopExamples.demoForLoop()

        then:
        noExceptionThrown()
    }

    void "Check demoTimesLoop"() {
        given:
        LoopExamples loopExamples = new LoopExamples()

        when:
        loopExamples.demoTimesLoop()

        then:
        noExceptionThrown()
    }

    void "Check demoEachWithIndexLoop"() {
        given:
        LoopExamples loopExamples = new LoopExamples()

        when:
        loopExamples.demoEachWithIndexLoop()

        then:
        noExceptionThrown()
    }

    void "Check demoEachLoop"() {
        given:
        LoopExamples loopExamples = new LoopExamples()

        when:
        loopExamples.demoEachLoop()

        then:
        noExceptionThrown()
    }
}

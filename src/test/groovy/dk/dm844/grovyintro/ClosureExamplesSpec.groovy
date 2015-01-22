package groovy.dk.dm844.grovyintro

import groovy.dk.dm844.groovyintro.ClosureExamples
import spock.lang.Specification


/**
 * Created by jacob on 1/21/15.
 */
class ClosureExamplesSpec extends Specification {


    void "Check closureIntro1"() {
        setup:
        ClosureExamples closureExamples = new ClosureExamples()

        when:
        closureExamples.closureIntro1()

        then:
        noExceptionThrown()
    }

    void "Check closureIntro2"() {
        setup:
        ClosureExamples closureExamples = new ClosureExamples()

        when:
        closureExamples.closureIntro2()

        then:
        noExceptionThrown()
    }

    void "Check closureIntro3"() {
        setup:
        ClosureExamples closureExamples = new ClosureExamples()

        when:
        closureExamples.closureIntro3()

        then:
        noExceptionThrown()
    }

    void "Check closureIntro4"() {
        setup:
        ClosureExamples closureExamples = new ClosureExamples()

        when:
        closureExamples.closureIntro4()

        then:
        noExceptionThrown()
    }

    void "Check closureIntro5"() {
        setup:
        ClosureExamples closureExamples = new ClosureExamples()

        when:
        closureExamples.closureIntro5()

        then:
        noExceptionThrown()
    }

    void "Check closureIntro6"() {
        setup:
        ClosureExamples closureExamples = new ClosureExamples()

        when:
        closureExamples.closureIntro5()

        then:
        noExceptionThrown()
    }


}
package dk.dm844.groovyintro

import dk.dm844.groovyintro.TooGroovy
import groovy.dk.dm844.groovyintro.StringExamples
import spock.lang.Specification


/**
 * Created by jacob on 1/26/15.
 */
class TooGroovySpec extends Specification {

    void "Test smallPrimes"() {
        given:
        TooGroovy tooGroovy = new TooGroovy()

        expect:
        tooGroovy.smallPrimes == [2, 3, 5, 7, 11, 13, 17, 19] as int[]
    }

    void "Test smallPrimes from groovy"() {
        given:
        StringExamples stringExamples = new StringExamples()

        expect:
        stringExamples.smallPrimes == [2, 3, 5, 7, 11, 13, 17, 19] as int[]
    }

    void "Test illegal variable names"() {
        given:
        TooGroovy tooGroovy = new TooGroovy()

        expect:
        tooGroovy.illegalKeywords == "Illegal Groovy variables"
    }

}
package groovy.dk.dm844.grovyintro

import groovy.dk.dm844.groovyintro.StringExamples
import spock.lang.Specification


class StringExamplesSpec extends Specification {

    void "Check multiline strings"() {
        setup:
        StringExamples stringExamples = new StringExamples()

        when:
        def result = stringExamples.stringExampleMultipleLines

        then:
        noExceptionThrown()
        result == """
It is a lot easier to have long
strings - copy pasted etc. with multi-line
Groovy Strings
"""
    }


    void "Check Gstrings"() {
        setup:
        StringExamples stringExamples = new StringExamples()

        when:
        def result = stringExamples.gstringExample

        then:
        noExceptionThrown()
        result == 'Hello Starbuck'
    }
}
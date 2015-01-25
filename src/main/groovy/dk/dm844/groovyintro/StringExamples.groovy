package groovy.dk.dm844.groovyintro

class StringExamples {


    String getStringExampleMultipleLines() {

        // tag::multiline-string[]
        String multipleLines = """
It is a lot easier to have long
strings - copy pasted etc. with multi-line
Groovy Strings
"""
        // end::multiline-string[]

        return multipleLines
    }

    String getGstringExample() {
        // tag::gstring[]
        String name = 'Starbuck'
        String helloString = "Hello ${name}"
        assert helloString == 'Hello Starbuck'
        // end::gstring[]

        return helloString
    }

}

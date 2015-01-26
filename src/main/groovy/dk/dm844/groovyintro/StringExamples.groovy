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

    int[] getSmallPrimes() {
        // tag::small-primes[]
        int[] smallPrimes = [ 2, 3, 5, 7, 11, 13, 17, 19 ] as int[]
        // end::small-primes[]

        return smallPrimes
    }

}

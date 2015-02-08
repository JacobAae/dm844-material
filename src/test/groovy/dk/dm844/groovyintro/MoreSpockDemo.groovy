package dk.dm844.groovyintro

import spock.lang.Specification
import spock.lang.Unroll

class MoreSpockDemo extends Specification {

	// tag::where-clause[]
	@Unroll("Test that #a + #b gives #result")
	void "Test overloading of plus"() {
		expect:
		a + b == result

		where:
		a           | b             || result
		13          | 29            || 42
		'So say '   | 'we all!'     || 'So say we all!'
	}
	// end::where-clause[]


}
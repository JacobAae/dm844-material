package dk.dm844.grovyintro

import dk.dm844.groovyintro.GroovyTruth
import spock.lang.Specification


/**
 * Created by jacob on 15-01-15.
 */
class GroovyTruthSpec extends Specification {


	void "Test Groovy Truth samplesare correct"() {
		setup:
		GroovyTruth groovyTruth = new GroovyTruth()

		when:
		groovyTruth.groovyTruth()

		then:
		noExceptionThrown()
	}

	void "Constructor demo"() {
		setup:
		GroovyTruth groovyTruth = new GroovyTruth()

		expect:
		groovyTruth.constructorDemoA() == groovyTruth.constructorDemoB()
	}
}
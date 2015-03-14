package dk.dm844.bsg

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonSpec extends Specification {

    def setup() {
        mockForConstraintsTests(Person)
    }

    @Unroll("Test title constraint #comment")
	void "Test title constraint violations"() {
        when:
        Person person = new Person(name: 'Valid', title: title)
        person.validate()

        println person.errors.allErrors

        then:
        !person.validate()

        where:
        title           | comment
        "1b"            | "Size is too small"
        "AAss"          | "Ups valid"
        "A1b2werdse"    | "Too long"

	}
}

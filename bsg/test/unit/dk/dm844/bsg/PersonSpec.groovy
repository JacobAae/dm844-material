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

    void "Test valid names"() {
        when:
        Ship ship = new Ship()
        Person person = new Person(name: name, title: "Mr.", persontype: Persontype.CIVILIAN, homeShip: ship)
        person.validate()

        then:
        person.validate()

        where:
        name << ["William Adama", 'Cally Henderson Tyrol' , "Kara 'Starbuck' Trace" ]
    }

    @Unroll("Test name constraint #comment")
	void "Test title constraint violations"() {
        when:
        Ship ship = new Ship()
        Person person = new Person(name: name, title: "Mr.", persontype: Persontype.CIVILIAN, homeShip: ship)
        person.validate()

        println person.errors.allErrors
        person.errors.allErrors.each {
            println "Code: ${it.code}"
        }


        then:
        !person.validate()

        where:
        name                | comment
        "Helo"              | "No lastname"
        "Willian adama"     | "Not capitalized lastname"
        "wiliam Adama"      | "Not capitalized firstname"
	}
}

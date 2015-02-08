package dk.dm844.groovyintro

import groovy.dk.dm844.groovyintro.SpecialOperators
import spock.lang.Specification


/**
 * Created by jacob on 1/21/15.
 */
class SpecialOperatorsSpec extends Specification {


    void "Check nullsafe dereference"() {
        setup:
        SpecialOperators specialOperators = new SpecialOperators()

        when:
        specialOperators.showNullSafeAccess()

        then:
        noExceptionThrown()
    }

    void "Check Elvis"() {
        setup:
        SpecialOperators specialOperators = new SpecialOperators()

        when:
        specialOperators.showElvisOperator()

        then:
        noExceptionThrown()
    }

    void "Check Spread-dot"() {
        setup:
        SpecialOperators specialOperators = new SpecialOperators()

        when:
        specialOperators.showSpreadDotOperator()

        then:
        noExceptionThrown()
    }

    void "Check Spaceship"() {
        setup:
        SpecialOperators specialOperators = new SpecialOperators()

        when:
        specialOperators.showSpaceshipOperator()

        then:
        noExceptionThrown()
    }

}
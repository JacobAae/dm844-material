package dk.dm844.bsg

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ShipSearchController)
class ShipSearchControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

//    @Unroll
    void "Manual databinding"() {
        setup:
        params.shipname = shipname
        params.minCrew = min
        params.maxCrew = max

        when:
        controller.search1()

        then:
        response.text  == result

        where:
        shipname                    | min           | max      || result
        "Battlestar Galactica"      | 0             | 100      || "Shipname: Battlestar Galactica - crew: 0 - 100"
        "Unknown"                   | null          | -100     || "Shipname: Unknown - crew: null - -100"
        null                        | null          | null     || "Shipname: null - crew: null - null"
        ''                          | ''            | ''       || "Shipname:  - crew: null - null"
        ''                          | 'NaN'         | 'Bad'    || "Shipname:  - crew: null - null"
    }

    @Unroll
    void "Test databinding with parameters"() {
        setup:
        params.shipname = shipname
        params.minCrew = min
        params.maxCrew = max

        when:
        controller.search2()

        then:
        response.text  == result

        where:
        shipname                    | min           | max      || result
        "Battlestar Galactica"      | 0             | 100      || "Shipname: Battlestar Galactica - crew: 0 - 100"
        "Unknown"                   | null          | -100     || "Shipname: Unknown - crew: null - -100"
        null                        | null          | null     || "Shipname: null - crew: null - null"
        ''                          | ''            | ''       || "Shipname:  - crew: null - null"
        ''                          | 'NaN'         | 'Bad'    || "Shipname:  - crew: null - null"
    }

    @Unroll
    void "Test databinding with command object"() {
        setup:
        params.shipname = shipname
        params.minCrew = min
        params.maxCrew = max

        when:
        controller.search3()

        then:
        response.text  == result

        where:
        shipname                    | min           | max      || result
        "Battlestar Galactica"      | 0             | 100      || "Shipname: Battlestar Galactica - crew: 0 - 100"
        "Unknown"                   | null          | -100     || "Shipname: Unknown - crew: null - -100"
        null                        | null          | null     || "Shipname: null - crew: null - null"
        ''                          | ''            | ''       || "Shipname: null - crew: null - null"  // <1>
        ''                          | 'NaN'         | 'Bad'    || "Shipname: null - crew: null - null"  // <2>
    }



}

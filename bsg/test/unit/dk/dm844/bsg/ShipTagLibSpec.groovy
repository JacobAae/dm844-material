package dk.dm844.bsg

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(ShipTagLib)
class ShipTagLibSpec extends Specification {

    void "Test rallying cry!"() {
        expect:
        tagLib.rallyingCry() == '<h1>So Say We All!!!</h1>'
    }

    void "Test isMilitary"() {
        expect:
        tagLib.isMilitary(ship: ship , bodyClosure )  == result

        where:
        ship                                    | bodyClosure       || result
        new Ship(shiptype: Shiptype.FREIGHT)    | { -> 'XXXXX'}     || ''
        new Ship(shiptype: Shiptype.MILITARY)   | { -> 'XXXXX'}     || 'XXXXX'
    }


    void "Test randomQuote"() {
        setup:
        tagLib.quoteService = Mock(QuoteService)

        when:
        String output = tagLib.randomQuote()

        then:
        1 * tagLib.quoteService.randomQuote >> { "William Adama: So say We All!" }
        output == "<h2> William Adama: So say We All! </h2>"
    }
}

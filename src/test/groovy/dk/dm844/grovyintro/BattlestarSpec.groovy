package groovy.dk.dm844.grovyintro

import groovy.dk.dm844.groovyintro.Battlestar
import spock.lang.Specification

class BattlestarSpec extends Specification {

    void "Test constructor for battlestar"() {
        when:
        Battlestar battlestar = new Battlestar(name: 'Galactica', crewsize: 1866, produced: new Date() )

        then:
        battlestar.name == 'Galactica'
        battlestar.getName() == 'Galactica'


    }

}
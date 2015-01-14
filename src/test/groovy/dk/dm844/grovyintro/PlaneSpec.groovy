package groovy.dk.dm844.grovyintro

import dk.dm844.groovyintro.JavaPlane
import groovy.dk.dm844.groovyintro.GroovyPlane
import spock.lang.Specification
import spock.lang.Unroll


class PlaneSpec extends Specification {

    @Unroll
    void "Test JavaPlane and GroovyPlane works same way"() {
        expect:
        plane.getQuadron() == 'Starboard air group'
        plane.type == 'Viper'
        plane.currentPilot == 'Starbuck'
        plane.getFormerPilots() == []

        when:
        plane.setCurrentPilot('Apollo')
        plane.addToFormerPilots('Starbuck')

        then:
        plane.currentPilot == 'Apollo'
        plane.formerPilots == ['Starbuck']

        where:
        plane << [
                new GroovyPlane(quadron: 'Starboard air group', type: 'Viper', currentPilot: 'Starbuck'),
                new JavaPlane('Starboard air group', 'Viper', 'Starbuck')
        ]
    }
}
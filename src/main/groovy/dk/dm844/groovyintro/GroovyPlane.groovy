package groovy.dk.dm844.groovyintro
// tag::plane[]
/**
 * A plane from the fleet from Battlestar Galactica,
 * tracking relevant elements - Groovy style
 */
class GroovyPlane {

    String type
    String currentPilot
    List<String> formerPilots = []

    void addToFormerPilots(String pilot) {
        formerPilots << pilot
    }
}
// end::plane[]

package groovy.dk.dm844.groovyintro
// tag::plane[]
/**
 * A plane from the fleet from Battlestar Galactica,
 * tracking relevant elements - Java style
 */
class GroovyPlane {
    String quadron
    String type
    String currentPilot
    List<String> formerPilots = [];

    public void addToFormerPilots(String pilot) {
        formerPilots.add(pilot);
    }
}
// end::plane[]

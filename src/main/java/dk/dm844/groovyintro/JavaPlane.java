package dk.dm844.groovyintro;
// tag::plane[]
import java.util.ArrayList;

/**
 * A plane from the fleet from Battlestar Galactica,
 * tracking relevant elements - Java style
 */
public class JavaPlane {

    private String type;
    private String currentPilot;
    private ArrayList<String> formerPilots;

    public JavaPlane(String type, String currentPilot) {
        this.type = type;
        this.currentPilot = currentPilot;
        this.formerPilots = new ArrayList<String>();
    }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getCurrentPilot() { return currentPilot; }

    public void setCurrentPilot(String currentPilot) { this.currentPilot = currentPilot; }

    public void addToFormerPilots(String pilot) { formerPilots.add(pilot); }

    public ArrayList<String> getFormerPilots() { return formerPilots; }
}
// end::plane[]

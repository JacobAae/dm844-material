package dk.dm844.groovyintro;


import java.util.ArrayList;
import java.util.List;

public class JavaCollectionSamples {

    public JavaCollectionSamples() {

    }

    public List<String> listExample() {

        //tag::lists[]
        List<String> battlestars = new ArrayList<String>();
        battlestars.add("Pegasus");
        battlestars.add("Galactica");
        //end::lists[]

        return battlestars;
    }

}

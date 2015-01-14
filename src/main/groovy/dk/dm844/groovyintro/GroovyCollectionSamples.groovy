package groovy.dk.dm844.groovyintro


class GroovyCollectionSamples {

    List<String> listExample() {

        //tag::lists[]
        def battlestars = ['Pegasus',"Galactica"]

        assert battlestars.first() == 'Pegasus'
        assert battlestars[0] == 'Pegasus'
        assert battlestars[-1] == "Galactica"

        assert battlestars instanceof java.util.List
        //end::lists[]

        return battlestars;
    }

    Map mapExample() {
        //tag::maps[]
        def crewSize = ['Pegasus': 1752, 'Galactica': 2662, 'Colonial One': 27]

        assert crewSize['Galactica'] == 2662
        assert crewSize.Pegasus == 1752
        assert crewSize.get('Colonial One') == 27
        //end::maps[]

        return crewSize
    }

    List rangeExample() {

        //tag::range[]
        def range = 3..8

        assert range.size() == 6
        assert range.get(2) == 5
        assert range[2] == 5
        assert range instanceof java.util.List
        assert range.contains(7)
        assert range.from == 3
        assert range.to == 8
        //end::range[]

        return range
    }


}

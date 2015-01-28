package dk.dm844.groovyintro


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

        crewSize.Demetrius = 18
        crewSize['Astral Queen'] = 1500

        assert crewSize['Demetrius'] == 18
        assert crewSize.'Astral Queen' == 1500
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

	Set setExample() {
		//tag::set[]
		def set = [1,2,3,3,2,1] as Set

		assert set.size() == 3
		assert set.containsAll([1,2,3])
		assert set instanceof java.util.Set
		assert set.min() == 1
		assert set.max() == 3
		//end::set[]

		return set
	}


	void asExample() {
		//tag::as-keyword[]
		Doctor doctor = new Doctor(name: 'Dr. Cottle', age: 62)

		def doctorMap = doctor as Map

		assert doctorMap instanceof Map
		assert doctorMap.name == 'Dr. Cottle'
		assert doctorMap['age'] == 62
		//end::as-keyword[]
	}



}

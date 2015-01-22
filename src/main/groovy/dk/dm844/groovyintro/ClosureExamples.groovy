package groovy.dk.dm844.groovyintro

/**
 * Created by jacob on 1/17/15.
 */
class ClosureExamples {

    List<Pilot> getPilots() {
        // tag::pilot-list[]
        List<Pilot> pilots = [
                new Pilot(name: 'Starbuck', stillAlive: true, fracs: 289),
                new Pilot(name: 'Racetrack', stillAlive: false, fracs: 27),
                new Pilot(name: 'Crashdown', stillAlive: false, fracs: 46),
                new Pilot(name: 'Hotdog', stillAlive: true, fracs: 89),
                new Pilot(name: 'Apollo', stillAlive: true, fracs: 224),
                new Pilot(name: 'Hardball', stillAlive: false, fracs: 54)
        ]
        // end::pilot-list[]
        pilots
    }


    void closureIntro1() {
        // tag::closure1[]
        Closure alive = { it.stillAlive }
        assert pilots.findAll(alive).size() == 3
        // end::closure1[]
    }

    void closureIntro2() {
        // tag::closure2[]
        Closure startsWthH = { String s -> s.startsWith('H') }
        assert pilots.findAll{ startsWthH(it.name)}*.name == ['Hotdog','Hardball']
        // end::closure2[]
    }

    void closureIntro3() {
        // tag::closure3[]
        String outside = "So say we all!"
        Closure noParameters = { ->  "Adama says: '${outside}'" }

        assert noParameters.call() == "Adama says: 'So say we all!'"
        assert noParameters() == "Adama says: 'So say we all!'"
        // end::closure3[]
    }

    void closureIntro4() {
        // tag::closure4[]
        def sortedPilots =  pilots.sort { a,b -> a.name <=> b.name  }
        assert sortedPilots*.name == ['Apollo' ,'Crashdown' , 'Hardball' , 'Hotdog' , 'Racetrack' , 'Starbuck']
        // end::closure4[]
    }

    void closureIntro5() {
        // tag::closure5[]
        List<Pilot> anonymous = [
                new Pilot(name: 'Anonymous', stillAlive: true, fracs: 9),
                new Pilot(name: 'Anonymous', stillAlive: true, fracs: 7),
                new Pilot(name: 'AAnonymous', stillAlive: true, fracs: 1),
                new Pilot(name: 'Anonymous', stillAlive: true, fracs: 3),
        ]

        assert anonymous.sort { a,b -> a.name <=> b.name ?: a.fracs <=> b.fracs }*.name == ['AAnonymous' ,'Anonymous' , 'Anonymous' , 'Anonymous']
        assert anonymous.sort { a,b -> a.name <=> b.name ?: a.fracs <=> b.fracs }*.fracs == [1, 3, 7, 9 ]
        // end::closure5[]
    }

    void closureIntro6() {
        // tag::closure6[]
        List highFracs = []

        pilots.each {
            if( it.fracs > 200) {
                highFracs << it
            }
        }
        assert highFracs == [new Pilot(name: 'Starbuck', stillAlive: true, fracs: 289),
                new Pilot(name: 'Apollo', stillAlive: true, fracs: 224)]
        // end::closure6[]
    }

}

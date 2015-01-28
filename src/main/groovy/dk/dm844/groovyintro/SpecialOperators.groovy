package groovy.dk.dm844.groovyintro

/**
 * Created by jacob on 1/21/15.
 */
class SpecialOperators {

    // tag::military-person[]
    class MilitaryPerson {
        String name
        MilitaryPerson superiorOfficer
    }
    // end::military-person[]


    void showNullSafeAccess() {

        // tag::safe-reference[]
        MilitaryPerson admiral = new MilitaryPerson(name:'William Adama')
        MilitaryPerson xo = new MilitaryPerson(name:'Saul Tigh', superiorOfficer: admiral )

        String nameOfSuperior = xo.superiorOfficer?.name
        assert nameOfSuperior == 'William Adama'

        nameOfSuperior = admiral.superiorOfficer?.name
        assert nameOfSuperior == null
        // end::safe-reference[]

    }

    void showElvisOperator() {

        // tag::elvis[]
        MilitaryPerson unknown = new MilitaryPerson()
        String name = unknown.name ?: 'Value instead of null'
        assert name == 'Value instead of null'
        // end::elvis[]

    }

    void showSpreadDotOperator() {
        // tag::spread-dot[]
        List<MilitaryPerson> officers = [
                new MilitaryPerson(name: 'William Adama'),
                new MilitaryPerson(name: 'Saul Tigh'),
                new MilitaryPerson(name: 'Karl Agathon')
        ]
        List<String> names = officers*.name
        assert names == ['William Adama','Saul Tigh' ,'Karl Agathon' ]
        // end::spread-dot[]


    }



    // tag::spaceship1[]
    class Officer implements Comparable {
        String name
        String rank

        int compareTo(other) {
            this.name <=> other.name
        }
    }
    // end::spaceship1[]

    void showSpaceshipOperator() {
        // tag::spaceship2[]
        assert -1 == ('A' <=> 'Z')
        assert 0 == (7 <=> 7)
        assert -1 == (new Officer([name:'Adama', rank: 'Admiral']) <=> new Officer([name:'Duallas', rank:'Major']))
        // end::spaceship2[]
    }

    void demoInOperator() {

        // tag::in-operator[]
        assert 1 in [1, 2, 5]
        assert !(3 in [1, 2, 5])
        // end::in-operator[]

    }


}

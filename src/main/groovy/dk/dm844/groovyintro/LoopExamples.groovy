package groovy.dk.dm844.groovyintro


class LoopExamples {

    List<String> getPilots() {
        // tag::pilots-loop[]
        List pilots = ['Hotdog','Athena','Racetrack','Helo']
        // end::pilots-loop[]
        pilots
    }

    def demoForLoop() {
        // tag::for-loop[]
        for(String pilot in pilots) {
            println pilot
        }
        // end::for-loop[]
    }

    def demoTimesLoop() {
        // tag::times-loop[]
        4.times {
            println pilots[it]
        }
        // end::times-loop[]
    }

    def demoEachLoop() {
        // tag::each-loop[]
        pilots.each {
            println it
        }
        // end::each-loop[]
    }

    def demoEachWithIndexLoop() {
        // tag::each-with-index-loop[]
        pilots.eachWithIndex { String pilot, int i ->
            println "pilots[$i] is '$pilot'"
        }
        // end::each-with-index-loop[]
    }

}

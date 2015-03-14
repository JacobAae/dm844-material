package dk.dm844.bsg

class Person {

	String name
	String title

//	static belongsTo = [homeShip: Ship]
//	static hasMany = [ solvedCrisis: Crisis ]

	static constraints = {
		name blank: false
		title size: 3..7
	}

    String toString() {
        name
    }

}

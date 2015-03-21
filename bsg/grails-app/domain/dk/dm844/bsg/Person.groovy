package dk.dm844.bsg

class Person {

	String name
	String title
    Persontype persontype

	static belongsTo = [homeShip: Ship]
	static hasMany = [ solvedCrisis: Crisis ]

	static constraints = {
		name blank: false, validator: mustHaveFirstAndLastName
		title nullable: true
	}

    String toString() {
        name
    }

    private static mustHaveFirstAndLastName = { String name -> name ==~ /[A-Z].* [A-Z].*/ }

}

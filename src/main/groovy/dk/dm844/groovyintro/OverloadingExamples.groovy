package dk.dm844.groovyintro

class OverloadingExamples {

	void knownOverloading() {

		// tag::known-overloading[]
		assert [1] + [2] == [1,2]

		List c = [1,2,3]
		c << 4
		assert c == [1,2,3,4]

		assert c[2] == 3
        // end::known-overloading[]
	}
// tag::money1[]
	class Money {
		def amount

		Money plus(Money other) {
			new Money(amount: this.amount + other.amount)
		}

		Money minus(Money other) {
			new Money(amount: this.amount - other.amount)
		}
	}
// end::money1[]

	void showMoneyOverloadingExample() {
		// tag::money2[]
		def money1 = new Money(amount: 100)
		def money2 = new Money(amount: 20)

		def sum = money1 + money2
		assert sum instanceof Money
		assert sum.amount == 120

		def difference = money1 - money2
		assert difference instanceof Money
		assert difference.amount == 80
// end::money2[]
	}


}

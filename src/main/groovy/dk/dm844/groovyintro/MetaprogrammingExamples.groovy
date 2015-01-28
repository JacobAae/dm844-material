package dk.dm844.groovyintro

class MetaprogrammingExamples {

	void demoExpando() {
		// tag::expando[]
		Expando expando = new Expando()

		expando.pilot = 'Starbuck'
		assert expando.pilot == 'Starbuck'

		expando.rallyingCry = { -> 'So say we all!' }
		assert expando.rallyingCry() == 'So say we all!'

		expando.properGreeting = { String s-> "${s}, Sir!" }
		assert expando.properGreeting('Hello') == 'Hello, Sir!'
		// end::expando[]

	}

	void demoExpandoWithArguments() {
		// tag::expando2[]
		Expando expando = new Expando(pilot: 'Apollo', fracs: 124)

		assert expando.pilot == 'Apollo'
		assert expando.fracs == 124
		// end::expando2[]

	}

	void quorumMemberMissingMethod() {
		// tag::method-missing[]
		QuorumMember qm = new QuorumMember(name: 'Tom Zarek', colony: 'Sagittaron' )

		assert qm.putToJail('Criminal') == 'Ouch, the method putToJail with arguments [Criminal] is missing'
		assert qm.putAllToJail('Criminal', 'Layer') == 'Ouch, the method putAllToJail with arguments [Criminal, Layer] is missing'
		// end::method-missing[]
	}

	void quorumMemberSetAndGetProperty() {
		// tag::missing-property[]
		QuorumMember qm = new QuorumMember(name: 'Tom Zarek', colony: 'Sagittaron' )

		qm.monthsInOffice = 2
		assert qm.monthsInOffice == 2
		assert qm.notSetProperty == null
		// end::missing-property[]
	}

	void stringMetaclassExampleSimple() {
		// tag::metaClass1[]
		String.metaClass.saysRallyingCry = {
			"'So say we all'"
		}
		String adama = 'Adama'

		assert adama.saysRallyingCry() == "'So say we all'"
		// end::metaClass1[]
	}

	void stringMetaclassExample() {
		// tag::metaClass2[]
		String.metaClass.saysRallyingCry = {
			"${delegate} says 'So say we all'"
		}
		String adama = 'Adama'

		assert adama.saysRallyingCry() == "Adama says 'So say we all'"
		// end::metaClass2[]
	}


}

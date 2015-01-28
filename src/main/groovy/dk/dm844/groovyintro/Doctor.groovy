package dk.dm844.groovyintro

//tag::doctor[]
class Doctor {
	String name
	Integer age

	def asType(Class type) {
		if( type == Map) {
			return [name:name, age: age]
		} else {
			throw new UnsupportedOperationException("Not able to convert to $type")
		}
	}
}
//end::doctor[]

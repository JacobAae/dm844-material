package dk.dm844.groovyintro

// tag::quorum-member[]
class QuorumMember {

	String name
	String colony
	private Map unknownProperties = [:]

	def methodMissing(String name, args) {
		return "Ouch, the method ${name} with arguments [${args.join(', ')}] is missing"
	}

	void setProperty(String propertyName, val) {
		unknownProperties[propertyName] = val
	}
	def getProperty(String propertyName) {
		unknownProperties[propertyName]
	}
}
// end::quorum-member[]

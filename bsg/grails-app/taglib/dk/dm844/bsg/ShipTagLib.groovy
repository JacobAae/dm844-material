package dk.dm844.bsg

class ShipTagLib {
    static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [rallyingCry: [taglib:'none']]

	def rallyingCry = {
		out << "<h1>So Say We All!!!</h1>"
	}

	def info = {
		out << "<p>actionName: ${actionName}</p>"
		out << "<p>controllerName: ${controllerName}</p>"
		out << "<p>flash: ${flash}</p>"
		out << "<p>params: ${params}</p>"
		out << "<p>session: ${session}</p>"
	}

	def isMilitary = { attrs, body ->
		Ship ship = attrs.ship
		if( ship?.shiptype == Shiptype.MILITARY ) {
			out << body()
		}
	}

}

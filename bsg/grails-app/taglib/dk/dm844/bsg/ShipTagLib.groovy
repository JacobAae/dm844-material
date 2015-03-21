package dk.dm844.bsg

class ShipTagLib {

    static namespace = "bsg"

    static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [rallyingCry: [taglib:'none'], randomQuote: [taglib:'none'], showErrorCodes: [taglib:'none']]

    QuoteService quoteService

    def randomQuote = {
        String quoteTitle = g.message(code: 'random.quote.label')
        String quote = quoteService.randomQuote
        out << "<h2>$quoteTitle</h2>"
        out << "<h3>$quote</h3>"
    }


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

    def showErrorCodes = { attrs ->
        Ship bean = attrs.bean
        if( bean.hasErrors()) {
            out << "<ol>"
            bean.errors.allErrors.each{
                out << "<li><ul>"
                it.codes.each { code ->
                    out << "<li> $code </li>"
                }
                out << "</ul></li>"
            }
            out << "</ol>"
        }
    }

}

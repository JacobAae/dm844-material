package dk.dm844.bsg

class JquerydemoController {

	SocketService socketService

	def index() {}

	def geolocation() {	}

	def canvas() {

	}

	def socketDemo() {}

	// For activating sockets
	def createShip() {
		Ship shipInstance = new Ship(params)
		[ship: shipInstance]
	}

	def saveShip() {
		Ship shipInstance = new Ship(params)
		if( shipInstance?.save()) {
			socketService.messageShip(shipInstance)
			flash.message = "Ship saved"
		} else {
			flash.message = "Something is not right"
		}
		render(view: 'createShip', model: [ship: shipInstance])
	}

}

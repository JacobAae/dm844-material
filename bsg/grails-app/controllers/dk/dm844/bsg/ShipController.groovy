package dk.dm844.bsg

class ShipController {

	static scaffold = true

	def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Ship.list(params), model:[shipInstanceCount: Ship.count()]
    }

    def errorDemo() {
        Ship shipInstance = new Ship(params)

        shipInstance.errors.reject('dk.dm844.bsg.ship.random.error.code', [42, 'some value'] as Object[], 'Default reason whith arguments {0} and {1}' )

        [ship: shipInstance]
    }


}

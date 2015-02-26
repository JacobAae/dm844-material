package dk.dm844.bsg

import grails.transaction.Transactional

@Transactional
class ShipSearchService {

    List<Ship> searchForShips(SearchInputCommand input) {
        if( !input.validate() ) {
            return []
        }
        return Ship.findAllByNameOrCrewsizeBetween(input.shipname, input.minCrew, input.maxCrew, [sort: 'name', order: 'asc'])
    }
}

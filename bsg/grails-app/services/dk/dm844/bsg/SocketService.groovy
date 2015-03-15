package dk.dm844.bsg

import org.springframework.messaging.simp.SimpMessagingTemplate

class SocketService {

	SimpMessagingTemplate brokerMessagingTemplate

	void messageShip(Ship ship) {
		String message = "New ship saved! ${ship.name} of type ${ship.shiptype}"
		brokerMessagingTemplate.convertAndSend "/topic/ship", message
	}
}

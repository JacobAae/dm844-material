package dk.dm844.bsg

enum Shiptype  implements org.springframework.context.MessageSourceResolvable {

	MILITARY,
	ADMINISTRATION,
	FREIGHT,
	ACCOMODATION,
	PRODUCTION,
	MISC

    Object[] getArguments() {
        [] as Object[]
    }

    String[] getCodes() {
        ["${getClass().name}.${name()}"] as String[]
    }

    String getDefaultMessage() {
        name()
    }
}

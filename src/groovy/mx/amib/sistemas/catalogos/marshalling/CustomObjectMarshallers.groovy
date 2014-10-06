package mx.amib.sistemas.catalogos.marshalling

import java.util.List;

class CustomObjectMarshallers {
	List marshallers = []
	
	def register() {
		marshallers.each{ it.register() }
	}
}

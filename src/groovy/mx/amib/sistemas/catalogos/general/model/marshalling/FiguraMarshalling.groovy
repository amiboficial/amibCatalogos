package mx.amib.sistemas.catalogos.general.model.marshalling

import grails.converters.JSON
import mx.amib.sistemas.catalogos.general.model.catalog.Figura

class FiguraMarshalling {
	void register(){
		JSON.registerObjectMarshaller(Figura){ Figura obj ->
			return [
				id:obj.id,
				numeroVersion:obj.numeroVersion,
				nombre:obj.nombre,
				nombreAcuse:obj.nombreAcuse,
				esAutorizable:obj.esAutorizable,
				tipoAutorizacion:obj.tipoAutorizacion,
				iniciales:obj.iniciales,
				vigente:obj.vigente,
				variantes:obj.variantes
			]
		}
	}
}

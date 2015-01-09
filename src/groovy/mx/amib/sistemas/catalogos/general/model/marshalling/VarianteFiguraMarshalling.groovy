package mx.amib.sistemas.catalogos.general.model.marshalling

import grails.converters.JSON
import mx.amib.sistemas.catalogos.general.model.catalog.VarianteFigura

class VarianteFiguraMarshalling {
	void register(){
		JSON.registerObjectMarshaller(VarianteFigura){ VarianteFigura obj ->
			return [
				id:obj.id,
				version:obj.version,
				nombre:obj.nombre,
				vigente:obj.vigente,
				idFigura:obj.figura?.id,
				nombreFigura:obj.figura?.nombre,
				nombreAcuseFigura:obj.figura?.nombreAcuse,
				esAutorizableFigura:obj.figura?.esAutorizable,
				tipoAutorizacion:obj.figura?.tipoAutorizacion,
				inicialesFigura:obj.figura?.iniciales
			]
		}
	}
}

package mx.amib.sistemas.catalogos.general.model.marshalling

import mx.amib.sistemas.catalogos.general.model.catalog.Institucion
import mx.amib.sistemas.catalogos.general.model.catalog.GrupoFinanciero
import grails.converters.JSON

class GrupoFinancieroMarshalling {
	void register(){
		JSON.registerObjectMarshaller(GrupoFinanciero){ GrupoFinanciero obj ->
			return [
				id:obj.id,
				nombre:obj.nombre,
				vigente:obj.vigente,
				instituciones:obj.instituciones
			]
		}
	}
}

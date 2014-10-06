package mx.amib.sistemas.catalogos.sepomex.model.marshalling

import grails.converters.JSON

import mx.amib.sistemas.catalogos.sepomex.model.catalog.*

class SepomexMarshalling {
	void register(){
		JSON.registerObjectMarshaller(Sepomex){ Sepomex obj ->
			return [
				id: obj.id,
				codigoPostal: obj.codigoPostal,
				
				idEntidadFederativa: obj.asentamiento.municipio.entidadFederativa.id,
				idMunicipio: obj.asentamiento.municipio.id,
				idCiudad: obj.ciudad?.id,
				idAsentamiento: obj.asentamiento.id,
				
				ciudad: obj.ciudad,
				asentamiento: obj.asentamiento
			]
		}
	}
}

class CiudadMarshalling {
	void register(){
		JSON.registerObjectMarshaller(Ciudad){ Ciudad obj ->
			return [
				id: obj.id,
				clave: obj.clave,
				nombre: obj.nombre,
				vigente: obj.vigente,
				
				idEntidadFederativa: obj.municipio.entidadFederativa.id,
				idMunicipio: obj.municipio.id,
				
				municipio: obj.municipio
			]
		}
	}
}

class AsentamientoMarshalling {
	void register(){
		JSON.registerObjectMarshaller(Asentamiento){ Asentamiento obj ->
			return [
				id: obj.id,
				clave: obj.clave,
				nombre: obj.nombre,
				vigente: obj.vigente,
				
				idEntidadFederativa: obj.municipio.entidadFederativa.id,
				idMunicipio: obj.municipio.id,
				
				municipio: obj.municipio
			]
		}
	}
}

class MunicipioMarshalling {
	void register(){
		JSON.registerObjectMarshaller(Municipio){ Municipio obj ->
			return [
				id: obj.id,
				clave: obj.clave,
				nombre: obj.nombre,
				vigente: obj.vigente,
				
				idEntidadFederativa: obj.entidadFederativa.id,
				entidadFederativa: obj.entidadFederativa
			]
		}
	}
}

class EntidadFederativaMarshalling {
	void register(){
		JSON.registerObjectMarshaller(EntidadFederativa){ EntidadFederativa obj ->
			return [
				id: obj.id,
				clave: obj.clave,
				nombre: obj.nombre,
				vigente: obj.vigente
			]
		}
	}
}


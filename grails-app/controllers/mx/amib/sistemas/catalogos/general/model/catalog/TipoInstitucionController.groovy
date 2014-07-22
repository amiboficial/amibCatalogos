package mx.amib.sistemas.catalogos.general.model.catalog



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class TipoInstitucionController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond TipoInstitucion.list(params), model:[tipoInstitucionInstanceCount: TipoInstitucion.count()]
    }

    def show(TipoInstitucion tipoInstitucionInstance) {
        respond tipoInstitucionInstance
    }

    def create() {
        respond new TipoInstitucion(params)
    }

    @Transactional
    def save(TipoInstitucion tipoInstitucionInstance) {
        if (tipoInstitucionInstance == null) {
            notFound()
            return
        }

        if (tipoInstitucionInstance.hasErrors()) {
            respond tipoInstitucionInstance.errors, view:'create'
            return
        }

        tipoInstitucionInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'tipoInstitucion.label', default: 'TipoInstitucion'), tipoInstitucionInstance.id])
                redirect tipoInstitucionInstance
            }
            '*' { respond tipoInstitucionInstance, [status: CREATED] }
        }
    }

    def edit(TipoInstitucion tipoInstitucionInstance) {
        respond tipoInstitucionInstance
    }

    @Transactional
    def update(TipoInstitucion tipoInstitucionInstance) {
        if (tipoInstitucionInstance == null) {
            notFound()
            return
        }

        if (tipoInstitucionInstance.hasErrors()) {
            respond tipoInstitucionInstance.errors, view:'edit'
            return
        }

        tipoInstitucionInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'TipoInstitucion.label', default: 'TipoInstitucion'), tipoInstitucionInstance.id])
                redirect tipoInstitucionInstance
            }
            '*'{ respond tipoInstitucionInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(TipoInstitucion tipoInstitucionInstance) {

        if (tipoInstitucionInstance == null) {
            notFound()
            return
        }

        tipoInstitucionInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'TipoInstitucion.label', default: 'TipoInstitucion'), tipoInstitucionInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'tipoInstitucion.label', default: 'TipoInstitucion'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}

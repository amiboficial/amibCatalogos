package mx.amib.sistemas.catalogos.general.controller



import static org.springframework.http.HttpStatus.*
import mx.amib.sistemas.catalogos.general.model.catalog.Figura;
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FiguraController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Figura.list(params), model:[figuraInstanceCount: Figura.count()]
    }

    def show(Figura figuraInstance) {
        respond figuraInstance
    }

	def list(Integer max) {
		params.max = Math.min(max ?: 10, 100)
		[figuraInstanceList: Figura.list(params), figuraInstanceTotal: Figura.count()]
	}
	
    def create() {
        respond new Figura(params)
    }

    @Transactional
    def save(Figura figuraInstance) {
        if (figuraInstance == null) {
            notFound()
            return
        }

        if (figuraInstance.hasErrors()) {
            respond figuraInstance.errors, view:'create'
            return
        }

        figuraInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'figura.label', default: 'Figura'), figuraInstance.id])
                redirect figuraInstance
            }
            '*' { respond figuraInstance, [status: CREATED] }
        }
    }

    def edit(Figura figuraInstance) {
        respond figuraInstance
    }

    @Transactional
    def update(Figura figuraInstance) {
        if (figuraInstance == null) {
            notFound()
            return
        }

        if (figuraInstance.hasErrors()) {
            respond figuraInstance.errors, view:'edit'
            return
        }

        figuraInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Figura.label', default: 'Figura'), figuraInstance.id])
                redirect figuraInstance
            }
            '*'{ respond figuraInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Figura figuraInstance) {

        if (figuraInstance == null) {
            notFound()
            return
        }

        figuraInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Figura.label', default: 'Figura'), figuraInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'figura.label', default: 'Figura'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}

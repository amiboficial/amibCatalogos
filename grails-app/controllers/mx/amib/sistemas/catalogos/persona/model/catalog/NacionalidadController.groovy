package mx.amib.sistemas.catalogos.persona.model.catalog



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NacionalidadController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Nacionalidad.list(params), model:[nacionalidadInstanceCount: Nacionalidad.count()]
    }

    def show(Nacionalidad nacionalidadInstance) {
        respond nacionalidadInstance
    }

    def create() {
        respond new Nacionalidad(params)
    }

    @Transactional
    def save(Nacionalidad nacionalidadInstance) {
        if (nacionalidadInstance == null) {
            notFound()
            return
        }

        if (nacionalidadInstance.hasErrors()) {
            respond nacionalidadInstance.errors, view:'create'
            return
        }

        nacionalidadInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nacionalidad.label', default: 'Nacionalidad'), nacionalidadInstance.id])
                redirect nacionalidadInstance
            }
            '*' { respond nacionalidadInstance, [status: CREATED] }
        }
    }

    def edit(Nacionalidad nacionalidadInstance) {
        respond nacionalidadInstance
    }

    @Transactional
    def update(Nacionalidad nacionalidadInstance) {
        if (nacionalidadInstance == null) {
            notFound()
            return
        }

        if (nacionalidadInstance.hasErrors()) {
            respond nacionalidadInstance.errors, view:'edit'
            return
        }

        nacionalidadInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Nacionalidad.label', default: 'Nacionalidad'), nacionalidadInstance.id])
                redirect nacionalidadInstance
            }
            '*'{ respond nacionalidadInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Nacionalidad nacionalidadInstance) {

        if (nacionalidadInstance == null) {
            notFound()
            return
        }

        nacionalidadInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Nacionalidad.label', default: 'Nacionalidad'), nacionalidadInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nacionalidad.label', default: 'Nacionalidad'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}

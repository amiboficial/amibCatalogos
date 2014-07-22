package mx.amib.sistemas.catalogos.persona.model.catalog



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NivelEstudiosController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NivelEstudios.list(params), model:[nivelEstudiosInstanceCount: NivelEstudios.count()]
    }

    def show(NivelEstudios nivelEstudiosInstance) {
        respond nivelEstudiosInstance
    }

    def create() {
        respond new NivelEstudios(params)
    }

    @Transactional
    def save(NivelEstudios nivelEstudiosInstance) {
        if (nivelEstudiosInstance == null) {
            notFound()
            return
        }

        if (nivelEstudiosInstance.hasErrors()) {
            respond nivelEstudiosInstance.errors, view:'create'
            return
        }

        nivelEstudiosInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nivelEstudios.label', default: 'NivelEstudios'), nivelEstudiosInstance.id])
                redirect nivelEstudiosInstance
            }
            '*' { respond nivelEstudiosInstance, [status: CREATED] }
        }
    }

    def edit(NivelEstudios nivelEstudiosInstance) {
        respond nivelEstudiosInstance
    }

    @Transactional
    def update(NivelEstudios nivelEstudiosInstance) {
        if (nivelEstudiosInstance == null) {
            notFound()
            return
        }

        if (nivelEstudiosInstance.hasErrors()) {
            respond nivelEstudiosInstance.errors, view:'edit'
            return
        }

        nivelEstudiosInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NivelEstudios.label', default: 'NivelEstudios'), nivelEstudiosInstance.id])
                redirect nivelEstudiosInstance
            }
            '*'{ respond nivelEstudiosInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NivelEstudios nivelEstudiosInstance) {

        if (nivelEstudiosInstance == null) {
            notFound()
            return
        }

        nivelEstudiosInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NivelEstudios.label', default: 'NivelEstudios'), nivelEstudiosInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nivelEstudios.label', default: 'NivelEstudios'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}

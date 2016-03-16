package RocheSALM

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class LicenciaController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Licencia.list(params), model:[licenciaCount: Licencia.count()]
    }

    def show(Licencia licencia) {
        respond licencia
    }

    def create() {
        respond new Licencia(params)
    }

    @Transactional
    def save(Licencia licencia) {
        if (licencia == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (licencia.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond licencia.errors, view:'create'
            return
        }

        licencia.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'licencia.label', default: 'Licencia'), licencia.id])
                redirect licencia
            }
            '*' { respond licencia, [status: CREATED] }
        }
    }

    def edit(Licencia licencia) {
        respond licencia
    }

    @Transactional
    def update(Licencia licencia) {
        if (licencia == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (licencia.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond licencia.errors, view:'edit'
            return
        }

        licencia.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'licencia.label', default: 'Licencia'), licencia.id])
                redirect licencia
            }
            '*'{ respond licencia, [status: OK] }
        }
    }

    @Transactional
    def delete(Licencia licencia) {

        if (licencia == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        licencia.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'licencia.label', default: 'Licencia'), licencia.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'licencia.label', default: 'Licencia'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}

package RocheSALM

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SedeClienteController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond SedeCliente.list(params), model:[sedeClienteCount: SedeCliente.count()]
    }

    def show(SedeCliente sedeCliente) {
        respond sedeCliente
    }

    def create() {
        respond new SedeCliente(params)
    }

    @Transactional
    def save(SedeCliente sedeCliente) {
        if (sedeCliente == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (sedeCliente.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond sedeCliente.errors, view:'create'
            return
        }

        sedeCliente.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'sedeCliente.label', default: 'SedeCliente'), sedeCliente.id])
                redirect sedeCliente
            }
            '*' { respond sedeCliente, [status: CREATED] }
        }
    }

    def edit(SedeCliente sedeCliente) {
        respond sedeCliente
    }

    @Transactional
    def update(SedeCliente sedeCliente) {
        if (sedeCliente == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (sedeCliente.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond sedeCliente.errors, view:'edit'
            return
        }

        sedeCliente.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'sedeCliente.label', default: 'SedeCliente'), sedeCliente.id])
                redirect sedeCliente
            }
            '*'{ respond sedeCliente, [status: OK] }
        }
    }

    @Transactional
    def delete(SedeCliente sedeCliente) {

        if (sedeCliente == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        sedeCliente.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'sedeCliente.label', default: 'SedeCliente'), sedeCliente.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'sedeCliente.label', default: 'SedeCliente'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}

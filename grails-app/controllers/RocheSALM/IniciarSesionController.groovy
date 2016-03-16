package RocheSALM

class IniciarSesionController {

    def index() { 
        redirect(action: "LogScreen", params: params)
    }
    
    def LogScreen(){
        
        if(params.error==null){
            params.error=false
        }
        
        [error:params.error]
        
    }
        
    def iniciarSesion(){
        def res = Responsable.findByEmail(params.email)      
        if(res!=null){
            if(res.password==params.password){
                //session["permisions"]="Padre"
                session.data=res
                redirect(controller:"Responsable", action: "show", id: res.id)
            }else{
                params.error=true
                redirect(action: "LogScreen", params: params)
            }
        } else {
            flash.message = "El usuario solicitado no se encuentra registrado en el sistema."
        }
        
        render(view: "LogScreen")
        
    }
   
    def logout() {
        session.invalidate()
        redirect(action: "LogScreen")
    }
    
    def registrar(){
        render(view: "registrar")
    }
}
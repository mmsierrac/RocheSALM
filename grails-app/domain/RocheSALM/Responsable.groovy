package RocheSALM

class Responsable {
    
    String email
    String confirmEmail
    String password
    String confirmPassword
    String nombreResponsable
    String telefonoResponsable
    String empresaResponsable 
    
    static hasMany=[cliente: Cliente]
    
    static constraints = {
        
        nombreResponsable blank: false, size: 1..25
        telefonoResponsable size: 10..15, matches: "[(0-9)]+"
        empresaResponsable blank: false, size: 1..25
        
        email blank: false, email: true,  validator: {email, obj ->
            def confirmEmail = obj.properties['confirmEmail']
            if(confirmEmail == null) return true 
            if (confirmEmail == email) return true 
            else return ['invalid.error']
        }
        password(blank: false, size: 5..15 , password:true, validator: {password, obj ->
                def confirmPassword = obj.properties['confirmPassword']
                if(confirmPassword == null) return true
                confirmPassword == password ? true : ['invalid.matchingpasswords']
            })
        confirmPassword blank: false, size: 5..15 , password:true
    }
}

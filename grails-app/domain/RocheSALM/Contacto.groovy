package RocheSALM

class Contacto {
    
    String nombreContacto;
    String direccionContacto;
    String telefonoContacto;
    String correoContacto;

    static constraints = {
        
        nombreContacto blank: false, size: 1..25
        direccionContacto size: 1..25
        telefonoContacto size: 10..15, matches: "[(0-9)]+"
        correoContacto blank: false, email: true
        
    }
}

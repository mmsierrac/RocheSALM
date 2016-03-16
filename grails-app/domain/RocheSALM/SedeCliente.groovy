package RocheSALM

class SedeCliente {
    
    String zonaSedeCliente;
    String ciudadSedeCliente;
    String entregadoA;
    String nombreSedeCliente;
    String direccionSedeCliente;
    String telefonoSedeCliente;
    
    Contacto contacto;
    
    static belongsTo = [cliente : Cliente]
    
    static hasMany=[licencia : Licencia, servidor : Servidor]

    static constraints = {
        
        zonaSedeCliente blank: false, inList: ["ANTIOQUIA", "CENTRO", "COSTA ATLANTICA", "COSTA PACIFICA",
            "EJE CAFETERO", "LLANOS ORIENTALES", "OCCIDENTE", "ORIENTE", "SUR"]
        ciudadSedeCliente blank: false, size: 1..25, matches: "[a-zA-Z- ]+"
        entregadoA size: 8..8, matches: "[(0-9)]+", unique: true
        nombreSedeCliente blank: false, size: 1..25
        direccionSedeCliente size: 1..25
        telefonoSedeCliente size: 10..15, matches: "[(0-9)]+"
        
    }
}

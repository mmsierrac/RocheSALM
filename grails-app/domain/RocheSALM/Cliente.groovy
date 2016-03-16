package RocheSALM

class Cliente {
    
    String zonaCliente;
    String ciudadCliente;
    String vendidoA;
    String nombreCliente;
    String direccionCliente;
    String telefonoCliente;
    
    static belongsTo = [responsable : Responsable]
    
    static hasMany=[sedeCliente: SedeCliente]

    static constraints = {
        
        zonaCliente blank: false, inList: ["ANTIOQUIA", "CENTRO", "COSTA ATLANTICA", "COSTA PACIFICA",
            "EJE CAFETERO", "LLANOS ORIENTALES", "OCCIDENTE", "ORIENTE", "SUR"]
        ciudadCliente blank: false, size: 1..25, matches: "[a-zA-Z- ]+"
        nombreCliente blank: false, size: 1..25
        vendidoA size: 8..8, matches: "[(0-9)]+", unique: true
        direccionCliente size: 1..25
        telefonoCliente  size: 7..12, matches: "[(0-9)]+"
        
    }
}

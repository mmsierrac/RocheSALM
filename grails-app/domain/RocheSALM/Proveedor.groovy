package RocheSALM

class Proveedor {
    
    String zonaProveedor;
    String ciudadProveedor;
    String nombreProveedor;
    String direccionProveedor;
    String telefonoProveedor;
    
    static hasMany=[licencia: Licencia]

    static constraints = {
        
        zonaProveedor blank: false, inList: ["ANTIOQUIA", "CENTRO", "COSTA ATLANTICA", "COSTA PACIFICA",
            "EJE CAFETERO", "LLANOS ORIENTALES", "OCCIDENTE", "ORIENTE", "SUR"]
        ciudadProveedor blank: false, size: 1..25, matches: "[a-zA-Z- ]+"
        nombreProveedor blank: false, size: 1..25
        direccionProveedor size: 1..25
        telefonoProveedor size: 10..15, matches: "[(0-9)]+"
        
    }
}

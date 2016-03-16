package RocheSALM

class Servidor {
    
    String tipoServidor
    String modeloServidor;
    String generacionServidor;
    String serialServidor;
    String placaActivoFijo
    String tipoContratoServidor;
    String estadoGarantiaServidor;
    String fechaInicioVigenciaGarantia;
    String fechaFinalizacionVigenciaGarantia;
    String fechaInstalacion;
    String usuarioAccesoRemoto;
    String contrasenaAccesoRemoto;    
    
    static belongsTo = [sedeCliente : SedeCliente]
    
    static hasMany = [licencia : Licencia]

    static constraints = {
        
        tipoServidor blank: false, inList: ["SERVIDOR DE RACK", "SERVIDOR DE TORRE"]
        modeloServidor blank: false
        generacionServidor blank: false, inList: ["G6", "G7", "G8", "G9","G10"]
        serialServidor blank: false, unique: true, matches: "[[(0-9)]+[A-Z]+ ]+"
        placaActivoFijo blank: false, size: 6..6, matches: "[(0-9)]+", unique: true
        tipoContratoServidor blank: false, inList: ["CUBRE TODO", "DIA SIGUIENTE"]
        estadoGarantiaServidor blank: false, inList: ["ACTIVO", "VENCIDO"]
        fechaInicioVigenciaGarantia blank: false
        fechaFinalizacionVigenciaGarantia blank: false
        fechaInstalacion blank: false
        
    }
}

package RocheSALM

class Licencia {
    
    String tipoLicencia;
    String serialLicencia;
    String referenciaTamanoLicencia;
    String codigoSAP;
    String fechaActivacionLicencia;
    String actaEntregaLicenciaFirmada;
    String fechaActaEntregaLicencia;
    
    static belongsTo = [proveedor : Proveedor, sedeCliente : SedeCliente, servidor : Servidor]
    
    static hasMany = [servidor : Servidor]

    static constraints = {
        
        tipoLicencia blank: false, inList: ["LICENCIA DE DATALAB 2005", "LICENCIA DATALAB LITE",
            "LICENCIA ENTERPRISE LYTE", "LICENCIA ENTERPRISE SIDE LAB", "LICENCIA ENTERPRISE REMOTE LAB",
            "LICENCIA DE ENTERPRISE", "LICENCIA DE ENTERPRISE H", "LICENCIA DE ERP", "LICENCIA DE PSM",
            "LICENCIA DE OMEGA 4", "LICENCIA OMEGA 3.1. 1-17 PROCESS", "LICENCIA DE OMEGA 3.3 17-50 PROCESS",
            "COBAS INFINITY CORE LICENCE", "LICENCIA DE COBAS IT1000 CORE LICENSE", "LINCENCIA DE WINDOWS 2000 SERVER",
            "CAL DE 2000 SERVER", "LICENCIA DE WINDOWS 2003 SERVER STANDARD", "CAL DE 2003 SERVER STANDARD",
            "LICENCIA DE WINDOWS 2008 SERVER R2", "CAL DE WINDOWS 2008 SERVER R2", 
            "LICENCIA DE WINDOWS IT 1000", "SQL SERVER 2005 EXPRESS", "CAL DE SQL SERVER 2005 EXPRESS",
            "SQL SERVER 2005 STANDARD", "CAL SQL SERVER 2005 STANDARD", "SQL SERVER 2008 EXPRESS",
            "CAL DE SQL SERVER 2008 EXPRESS", "SQL SERVER 2008 STANDARD",
            "CAL DE SQL SERVER 2008 STANDARD", "SQL SERVER 2014 STANDARD"]
        serialLicencia blank: false
        referenciaTamanoLicencia blank: false, inList: ["Cache New - XS (1-10)", "Cache Renew - XS (1-10)", 
            "Cache New - S (11-25)", "Cache Renew - S (11-25)", "Cache New - M (26-50)", "Cache Renew - M (26-50)",
            "Cache New - L (51-80)", "Cache Renew - L (51-80)", "Cache New Inc Web add-on-S (11-25)",
            "Cache Custom License 8"]
        codigoSAP blank: false, size: 10..10, matches: "[(0-9)]+"
        fechaActivacionLicencia blank: false
        actaEntregaLicenciaFirmada blank: false, inList: ["SI", "NO"]
        fechaActaEntregaLicencia blank: false
        
    }
}

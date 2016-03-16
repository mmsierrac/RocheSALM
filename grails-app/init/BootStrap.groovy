
class BootStrap {

    def init = {
        //Responsable
        
        def r1 = new RocheSALM.Responsable(email: "r1@correo.com", confirmEmail: "r1@correo.com",
            password: "12345", confirmPassword: "12345", nombreResponsable: "Responsable Uno",
            telefonoResponsable: "1234567890", empresaResponsable: "Roche")
        r1.save(flush:true)
        
        def r2 = new RocheSALM.Responsable(email: "r2@correo.com", confirmEmail: "r2@correo.com",
            password: "12345", confirmPassword: "12345", nombreResponsable: "Responsable Dos",
            telefonoResponsable: "1234567890", empresaResponsable: "Roche")
        r2.save(flush:true)
        
        def r3 = new RocheSALM.Responsable(email: "r3@correo.com", confirmEmail: "r3@correo.com",
            password: "12345", confirmPassword: "12345", nombreResponsable: "Responsable Tres",
            telefonoResponsable: "1234567890", empresaResponsable: "Roche")
        r3.save(flush:true)
        
        //Contacto
        
        def con1 = new RocheSALM.Contacto(nombreContacto: "Contacto Uno", direccionContacto: "direccionContacto",
            telefonoContacto: "1234567890", correoContacto: "con1@correo.com")
        con1.save(flush:true);
        
        def con2 = new RocheSALM.Contacto(nombreContacto: "Contacto Dos", direccionContacto: "direccionContacto",
            telefonoContacto: "1234567890", correoContacto: "con2@correo.com")
        con1.save(flush:true);
        
        def con3 = new RocheSALM.Contacto(nombreContacto: "Contacto Tres", direccionContacto: "direccionContacto",
            telefonoContacto: "1234567890", correoContacto: "con3@correo.com")
        con1.save(flush:true);
        
        //Cliente
        
        def cli1 = new RocheSALM.Cliente(zonaCliente: "ANTIOQUIA", ciudadCliente: "Ciudad Uno",
            vendidoA: "12345678", nombreCliente: "Cliente Uno", direccionCliente: "direccionCliente",
            telefonoCliente: "1234567890", responsable:r1, SedeCliente: null)
        cli1.save(flush:true);
        
        def cli2 = new RocheSALM.Cliente(zonaCliente: "ORIENTE", ciudadCliente: "Ciudad Dos",
            vendidoA: "23456789", nombreCliente: "Cliente Dos", direccionCliente: "direccionCliente",
            telefonoCliente: "1234567890", responsable:r2, SedeCliente: null)
        cli2.save(flush:true);
        
        def cli3 = new RocheSALM.Cliente(zonaCliente: "OCCIDENTE", ciudadCliente: "Ciudad Tres",
            vendidoA: "34567890", nombreCliente: "Cliente Tres", direccionCliente: "direccionCliente",
            telefonoCliente: "1234567890", responsable:r3, SedeCliente: null)
        cli3.save(flush:true);
        
        //SedeCliente
        
        def sd1 = new RocheSALM.SedeCliente(zonaSedeCliente: "ANTIOQUIA", ciudadSedeCliente: "Ciudad Uno",
            entregadoA: "98765432", nombreSedeCliente: "Sede Cliente Uno", direccionSedeCliente: "direccionSedeCliente",
            telefonoSedeCliente: "1234567890", contacto:con1, cliente:cli1)
        sd1.save(flush:true);
        
        def sd2 = new RocheSALM.SedeCliente(zonaSedeCliente: "ORIENTE", ciudadSedeCliente: "Ciudad Dos",
            entregadoA: "87654321", nombreSedeCliente: "Sede Cliente Dos", direccionSedeCliente: "direccionSedeCliente",
            telefonoSedeCliente: "1234567890", contacto:con2, cliente:cli2)
        sd2.save(flush:true);
        
        def sd3 = new RocheSALM.SedeCliente(zonaSedeCliente: "OCCIDENTE", ciudadSedeCliente: "Ciudad Tres",
            entregadoA: "76543210", nombreSedeCliente: "Sede Cliente Tres", direccionSedeCliente: "direccionSedeCliente",
            telefonoSedeCliente: "1234567890", contacto:con3, cliente:cli3)
        sd3.save(flush:true)
        
        //Proveedor
        
        def p1 = new RocheSALM.Proveedor(zonaProveedor: "ANTIOQUIA", ciudadProveedor: "Ciudad Uno", 
            nombreProveedor: "Proveedor Uno", direccionProveedor: "direccionProveedor",
            telefonoProveedor: "1234567890")
        p1.save(flush:true);
        
        def p2 = new RocheSALM.Proveedor(zonaProveedor: "ORIENTE", ciudadProveedor: "Ciudad Dos", 
            nombreProveedor: "Proveedor Dos", direccionProveedor: "direccionProveedor",
            telefonoProveedor: "1234567890")
        p2.save(flush:true);
        
        def p3 = new RocheSALM.Proveedor(zonaProveedor: "OCCIDENTE", ciudadProveedor: "Ciudad Tres", 
            nombreProveedor: "Proveedor Tres", direccionProveedor: "direccionProveedor",
            telefonoProveedor: "1234567890")
        p3.save(flush:true);
        
        //Servidores
        
        def s1 = new RocheSALM.Servidor(tipoServidor: "SERVIDOR DE RACK", modeloServidor: "modeloServidor", 
            generacionServidor: "G6", serialServidor: "X123456", 
            tipoContratoServidor: "CUBRE TODO", estadoGarantiaServidor: "ACTIVO", 
            placaActivoFijo: "345678",
            fechaInicioVigenciaGarantia: "12062015", fechaFinalizacionVigenciaGarantia: "17062015", 
            fechaInstalacion: "12062015", usuarioAccesoRemoto: "usuarioAccesoRemoto",
            contrasenaAccesoRemoto: "contrasenaAccesoRemoto", sedeCliente:sd1)
        s1.save(flush:true)
        
        def s2 = new RocheSALM.Servidor(tipoServidor: "SERVIDOR DE TORRE", modeloServidor: "modeloServidor", 
            generacionServidor: "G7", serialServidor: "M123456", 
            tipoContratoServidor: "CUBRE TODO", estadoGarantiaServidor: "VENCIDO", 
            placaActivoFijo: "234567",
            fechaInicioVigenciaGarantia: "12062015", fechaFinalizacionVigenciaGarantia: "17062015", 
            fechaInstalacion: "12062015", usuarioAccesoRemoto: "usuarioAccesoRemoto",
            contrasenaAccesoRemoto: "contrasenaAccesoRemoto", sedeCliente:sd2)
        s2.save(flush:true)
        
        def s3 = new RocheSALM.Servidor(tipoServidor: "SERVIDOR DE RACK", modeloServidor: "modeloServidor", 
            generacionServidor: "G8", serialServidor: "L123456", 
            tipoContratoServidor: "CUBRE TODO", estadoGarantiaServidor: "ACTIVO",
            placaActivoFijo: "123456",
            fechaInicioVigenciaGarantia: "12062015", fechaFinalizacionVigenciaGarantia: "17062015", 
            fechaInstalacion: "12062015", usuarioAccesoRemoto: "usuarioAccesoRemoto",
            contrasenaAccesoRemoto: "contrasenaAccesoRemoto", sedeCliente:sd3)
        s3.save(flush:true)
        
        //Licencias
        
        def l1 = new RocheSALM.Licencia(tipoLicencia: "LICENCIA DATALAB LITE", serialLicencia: "serialLicencia",
            referenciaTamanoLicencia: "Cache New - XS (1-10)", codigoSAP: "0123456789", 
            fechaActivacionLicencia: "fechaActivacionLicencia", actaEntregaLicenciaFirmada: "SI",
            fechaActaEntregaLicencia: "fechaActaEntregaLicencia", proveedor:p1, sedeCliente:sd1, servidor:s1)
        l1.save(flush:true)
        
        def l2 = new RocheSALM.Licencia(tipoLicencia: "LICENCIA ENTERPRISE LYTE", serialLicencia: "serialLicencia",
            referenciaTamanoLicencia: "Caché Renew - XS (1-10)", codigoSAP: "1234567890",
            fechaActivacionLicencia: "12062015", actaEntregaLicenciaFirmada: "SI",
            fechaActaEntregaLicencia: "12062015", proveedor:p2, sedeCliente:sd2, servidor:s2)
        l2.save(flush:true)
        
        def l3 = new RocheSALM.Licencia(tipoLicencia: "LICENCIA DATALAB LITE", serialLicencia: "serialLicencia",
            referenciaTamanoLicencia: "Caché New - S (11-25)", codigoSAP: "1234567890",
            fechaActivacionLicencia: "12062015", actaEntregaLicenciaFirmada: "SI",
            fechaActaEntregaLicencia: "12062015", proveedor:p3, sedeCliente:sd3, servidor:s3)
        l3.save(flush:true)
        
    }
    def destroy = {
    }
}

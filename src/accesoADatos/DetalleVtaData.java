package accesoADatos;

import java.sql.Connection;

public class DetalleVtaData {

     private Connection conexion = null;

    public DetalleVtaData() {
        conexion = Conexion.getConexion();
    
    
}
}
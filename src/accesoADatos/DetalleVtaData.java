package accesoADatos;

import entidades.DetalleVenta;
import entidades.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DetalleVtaData {

     private Connection conexion = null;

    public DetalleVtaData() {
        conexion = Conexion.getConexion();
     
    
}
    
    public void registarDetalle(DetalleVenta detalleVenta){
         String sql = "INSERT INTO detalleVenta (cantidad, idVenta, precioVenta, idProducto) VALUES (?, ?, ?, ?)";
        try {
            ProductoData pd = new ProductoData();
            pd.buscarProducto(detalleVenta.)
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, venta.getIdCliente());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getDomicilio());
            ps.setString(5, cliente.getTelefono());
            ps.setBoolean(6, true);
            ps.executeUpdate();
            ResultSet resul = ps.getGeneratedKeys();
            if (resul.next()) {
                cliente.setIdCliente(resul.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente registrado con éxito.");
            }
            ps.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al registrar al cliente en la base de datos.");

        }
        
    }
    
    
    
    
    
}
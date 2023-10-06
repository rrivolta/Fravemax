package accesoADatos;

import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class DetalleVtaData {

    private Connection conexion = null;

    public DetalleVtaData() {
        conexion = Conexion.getConexion();
    }
    
    public void registrarDetalle(DetalleVenta detalleVenta) {
        String sql = "INSERT INTO detalleVenta (cantidad, idVenta, precioVenta, idProducto) VALUES (?, ?, ?, ?)";
        Set<Producto> hs = new HashSet<>(detalleVenta.getProductos());
        for (Producto prod : hs){
            DecimalFormat formato = new DecimalFormat ("0.00");
            double precioTotal = 0.0;
            int ocurrencias = detalleVenta.cantidadDeOcurrencias(prod);
            precioTotal += ocurrencias * prod.getPrecioActual();
            
            double num1 = Math.round(precioTotal*100.0)/100.0;
            //System.out.println(num1);
            
            try {
                PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, ocurrencias);
                ps.setInt(2, detalleVenta.getVenta().getIdVenta());
                ps.setDouble(3, precioTotal);
                ps.setInt(4, prod.getIdProducto());
                ps.executeUpdate();
                ResultSet resul = ps.getGeneratedKeys();
                if (resul.next()) {
                    detalleVenta.setIdDetalleVenta(resul.getInt(1));
                    JOptionPane.showMessageDialog(null, "Detalle registrado con éxito.");
                }
                ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al registrar el detalle en la base de datos.");
            }
        }
    }

}
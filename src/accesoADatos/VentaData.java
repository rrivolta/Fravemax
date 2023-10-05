package accesoADatos;

import entidades.Producto;
import entidades.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import javax.swing.JOptionPane;

public class VentaData {

    private Connection conexion = null;

    public VentaData() {
        conexion = Conexion.getConexion();
    }
        public void registrarVenta(Venta venta) {
        String sql = "INSERT INTO venta (idCliente, fechaVenta) VALUES (?, ?)";
        try {

            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, venta.getCliente().getIdCliente());
            ps.setDate(2, Date.valueOf(venta.getFechaVenta()));
            ps.executeUpdate();
            ResultSet resul = ps.getGeneratedKeys();
            if (resul.next()) {
                venta.setIdVenta(resul.getInt(1));
                JOptionPane.showMessageDialog(null, "Venta registrada con éxito.");
            }
            ps.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al registrar la venta en la base de datos.");

        }
    }
    public void modificarVenta(Venta venta) {
        String sql = "UPDATE venta SET idCliente = ?, fechaVenta = ? where idVenta = ?";
        try {

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, venta.getCliente().getIdCliente());
            ps.setDate(2, Date.valueOf(venta.getFechaVenta()));
            ps.setInt(3, venta.getIdVenta());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Venta modificada");
            }
            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al modificar la venta en la base de datos.");

        }
    }

    public void eliminarVenta(int id) {
        String sql = "UPDATE venta SET estado=0 WHERE idVenta=?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Venta eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta");
        }

    }

    
    
    }



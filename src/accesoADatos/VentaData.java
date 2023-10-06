package accesoADatos;

import entidades.Cliente;
import entidades.Producto;
import entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VentaData {

    private Connection conexion = null;

    public VentaData() {
        conexion = Conexion.getConexion();
    }
        public void registrarVenta(Venta venta) {
        String sql = "INSERT INTO venta (idCliente, fechaVenta, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, venta.getCliente().getIdCliente());
            ps.setDate(2, Date.valueOf(venta.getFechaVenta()));
            ps.setBoolean(3, true);
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
    
    public Venta buscarVenta(int idVenta) {
        String sql = "SELECT idCliente, fechaVenta FROM  venta "
                + "WHERE idVenta=? AND estado=1";
        Venta venta = new Venta();
        ClienteData cd = new ClienteData();
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idVenta);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                venta.setIdVenta(idVenta);
                Cliente cli=cd.buscarCliente(result.getInt("idCliente"));
                venta.setCliente(cli);
                venta.setFechaVenta(result.getDate("fechaVenta").toLocalDate());
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto");
        }
        return venta;
    }

        public List<Venta> listarVentaXFecha(LocalDate fecha){
            String sql = "SELECT idVenta FROM venta WHERE fechaVenta=?";

            List<Venta> ventas = new ArrayList<>();
            try {
                PreparedStatement ps = conexion.prepareStatement(sql);
                ps.setDate(1, Date.valueOf(fecha));
                ResultSet result = ps.executeQuery();

                while (result.next()) {
                    Venta venta = new Venta();
                    venta = buscarVenta(result.getInt("idVenta"));
                    
                    ventas.add(venta);
                }

                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente");

            }
            return ventas;
            }
        
    
    
    }



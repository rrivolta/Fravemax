package accesoADatos;

import entidades.Cliente;
import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteData {

    private Connection conexion = null;

    public ClienteData() {
        conexion = Conexion.getConexion();
    }

    public void registrarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (idCliente, apellido, nombre, domicilio, telefono, estado) "
                + "VALUES (?, ?, ?, ?, ?,?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, cliente.getIdCliente());
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

    public void modificarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET apellido = ?, nombre = ?, domicilio = ?, telefono= ?, estado = ? "
                + "where idCliente = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.setBoolean(5, cliente.isEstado());
            ps.setInt(6, cliente.getIdCliente());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cliente modificado");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el cliente en la base de datos.");
        }
    }

    public void eliminarCliente(int id) {
        String sql = "UPDATE cliente SET estado=0 WHERE idCliente=?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente");
        }
    }

    public List<Cliente> listarClientes() {
        String sql = "SELECT idCliente, apellido, nombre, domicilio, telefono, estado FROM  cliente ";

        List<Cliente> clientes = new ArrayList<>();
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                Cliente cli = new Cliente();
                cli.setIdCliente(result.getInt("idCliente"));
                cli.setApellido(result.getString("apellido"));
                cli.setNombre(result.getString("nombre"));
                cli.setDomicilio(result.getString("domicilio"));
                cli.setTelefono(result.getString("telefono"));
                cli.setEstado(result.getBoolean("estado"));
                clientes.add(cli);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente");
        }
        return clientes;
    }
    
    public Cliente buscarCliente(int idCliente) {
        String sql = "SELECT apellido, nombre, domicilio, telefono, estado FROM cliente "
                + "WHERE idcliente=?";
        Cliente cli = new Cliente();
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                cli.setApellido(result.getString("apellido"));
                cli.setNombre(result.getString("nombre"));
                cli.setDomicilio(result.getString("domicilio"));
                cli.setTelefono(result.getString("telefono"));
                cli.setEstado(result.getBoolean("estado"));
                cli.setIdCliente(idCliente);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente");
        }
        return cli;
    }
    
    public List<Cliente> clientesXProducto(int idProducto){
        String sql = "SELECT c.idCliente, apellido, nombre, domicilio, telefono, c.estado FROM cliente c "
                + "JOIN venta v ON (c.idCliente = v.idVenta) JOIN detalleventa dv "
                + "ON (dv.idVenta = v.idVenta) JOIN producto p ON (p.idProducto = dv.idProducto) "
                + "WHERE p.idProducto = ?";
        
        List<Cliente> clientes = new ArrayList<>();
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                Cliente cli = new Cliente();
                cli.setIdCliente(result.getInt("idCliente"));
                cli.setApellido(result.getString("apellido"));
                cli.setNombre(result.getString("nombre"));
                cli.setDomicilio(result.getString("domicilio"));
                cli.setTelefono(result.getString("telefono"));
                cli.setEstado(result.getBoolean("estado"));
                clientes.add(cli);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente");
        }
        return clientes;
    }
}

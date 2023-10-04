package accesoADatos;

import entidades.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoData {

    private Connection conexion = null;

    public ProductoData() {
        conexion = Conexion.getConexion();
    }

    public void registrarProducto(Producto producto) {
        String sql = "INSERT INTO producto (nombreProducto, descripcion, precioActual, stock, estado) VALUES (?, ?, ?, ?, ?)";
        try {

            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.executeUpdate();
            ResultSet resul = ps.getGeneratedKeys();
            if (resul.next()) {
                producto.setIdProdructo(resul.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto registrado con éxito.");
            }
            ps.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al registrar el producto en la base de datos.");

        }
    }

    public void modificarProducto(Producto producto) {
        String sql = "UPDATE producto SET nombreProducto = ?, descripcion = ?, precioActual = ?, stock = ?, estado = ? where idProducto = ?";
        try {

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProdructo());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado");
            }
            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al modificar el producto en la base de datos.");

        }

    }

    public void eliminarProducto(int id) {
        String sql = "UPDATE producto SET estado=0 WHERE idProducto=?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }

    }

    public List<Producto> listarProductos() {
        String sql = "SELECT idProducto, nombreProducto, descripcion, precioActual, stock, estado FROM  producto ";

        List<Producto> productos = new ArrayList<>();
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                Producto prod = new Producto();
                prod.setIdProdructo(result.getInt("idProducto"));
                prod.setNombreProducto(result.getString("nombreProducto"));
                prod.setDescripcion(result.getString("descripcion"));
                prod.setPrecioActual(result.getDouble("precioActual"));
                prod.setStock(result.getInt("stock"));
                productos.add(prod);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla productos");

        }
        return productos;
    }

    
}




package entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleVenta {
    private int idDetalleVenta;
    private Venta venta;
    private List<Producto> productos;
    private double precioVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(Venta venta) {
        this.venta = venta;
        this.productos =new ArrayList<Producto>();
        this.precioVenta=0;
    }
    
    public DetalleVenta(Venta venta, List<Producto> productos) {
        this.venta = venta;
        this.productos = productos;
    }

    public DetalleVenta(int idDetalleVenta, Venta venta, List<Producto> productos, double precioVenta) {
        this.idDetalleVenta = idDetalleVenta;
        this.venta = venta;
        this.productos = productos;
        this.precioVenta = precioVenta;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List producto) {
        this.productos = productos;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return idDetalleVenta + " " + venta;
    }
    
    public void agregarProducto(Producto producto) {
        if (producto.getStock() >= 1) {
            this.productos.add(producto);
            this.precioVenta += producto.getPrecioActual();
        } else {
            JOptionPane.showMessageDialog(null, "Sin Stock");
        }
    }

    public int cantidadDeOcurrencias(Producto producto) {
        return Collections.frequency(this.productos, producto);
    }
   
}

    


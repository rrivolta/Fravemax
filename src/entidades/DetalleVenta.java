package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleVenta {

    private int idDetalleVenta, cantidad;
    private Venta venta;
    private List<Producto>productos;
    private double precioVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(Venta venta) {

        this.venta = venta;
        this.productos =new ArrayList<Producto>();
        this.precioVenta=0;
    }

    public DetalleVenta(int idDetalleVenta, int cantidad, Venta venta, ArrayList<Producto> productos, double precioVenta) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantidad = cantidad;
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

    public int getCantindad() {
        return cantidad;
    }

    public void setCantindad(int cantindad) {
        this.cantidad = cantindad;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<Producto> getProducto() {
        return productos;
    }

    public void setProducto(List producto) {
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
        return "DetalleVenta{" + "idDetalleVenta=" + idDetalleVenta + ", cantidad=" + cantidad + ", venta=" + venta + ", productos=" + productos + ", precioVenta=" + precioVenta + '}';
    }
    
    public void agregarProducto(Producto producto){
    
    if(producto.getStock()>=1){
    this.productos.add(producto);   
    this.precioVenta+=producto.getPrecioActual();
    }else{
        JOptionPane.showMessageDialog(null, "Sin Stock");
    }
    }
    public int cantidadDeOcurrencias(Producto producto){
        return Collections.frequency(productos, producto);
    }
  
}

    


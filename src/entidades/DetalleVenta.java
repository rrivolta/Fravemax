package entidades;

public class DetalleVenta {

    private int idDetalleVenta, cantindad;
    private Venta venta;
    private Producto producto;
    private double precioVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(int cantindad, Venta venta, Producto producto, double precioVenta) {
        this.cantindad = cantindad;
        this.venta = venta;
        this.producto = producto;
        this.precioVenta = precioVenta;
    }

    public DetalleVenta(int idDetalleVenta, int cantindad, Venta venta, Producto producto, double precioVenta) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantindad = cantindad;
        this.venta = venta;
        this.producto = producto;
        this.precioVenta = precioVenta;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getCantindad() {
        return cantindad;
    }

    public void setCantindad(int cantindad) {
        this.cantindad = cantindad;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalleVenta=" + idDetalleVenta + ", cantindad=" + cantindad + ", venta=" + venta + ", producto=" + producto + ", precioVenta=" + precioVenta + '}';
    }
    
    
    
    
}

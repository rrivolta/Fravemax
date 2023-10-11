package entidades;


public class Producto {

    private int idProducto, stock;
    private String nombreProducto, descripcion;
    private double precioActual;
    private boolean estado;

    public Producto() {
    }

    public Producto( String nombreProducto, String descripcion, double precioActual, int stock, boolean estado) {
        this.stock = stock;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.estado = estado;
    }

    public Producto(int idProducto, String nombreProducto, String descripcion, double precioActual, int stock, boolean estado) {
        this.idProducto = idProducto;
        this.stock = stock;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    @Override
    public String toString() {
        return "Producto{" + "idProdructo=" + idProducto + ", stock=" + stock + ", nombreProducto=" + nombreProducto + ", descripcion=" + descripcion + ", precioActual=" + precioActual + ", estado=" + estado + '}';
    }
     
}

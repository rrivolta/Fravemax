package entidades;


public class Producto {

    private int idProdructo, stock;
    private String nombreProducto, descripcion;
    private double precioActual;
    private boolean estado;

    public Producto() {
    }

    public Producto(int stock, String nombreProducto, String descripcion, double precioActual, boolean estado) {
        this.stock = stock;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.estado = estado;
    }

    public Producto(int idProdructo, int stock, String nombreProducto, String descripcion, double precioActual, boolean estado) {
        this.idProdructo = idProdructo;
        this.stock = stock;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.estado = estado;
    }

    public int getIdProdructo() {
        return idProdructo;
    }

    public void setIdProdructo(int idProdructo) {
        this.idProdructo = idProdructo;
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
        return "Producto{" + "idProdructo=" + idProdructo + ", stock=" + stock + ", nombreProducto=" + nombreProducto + ", descripcion=" + descripcion + ", precioActual=" + precioActual + ", estado=" + estado + '}';
    }
     
    
    
}

package entidades;

public class Cliente {

    private String apellido, nombre, domicilio, telefono;
    private int idCliente;

    public Cliente() {
    }

    public Cliente(String apellido, String nombre, String domicilio, String telefono) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Cliente(String apellido, String nombre, String domicilio, String telefono, int idCliente) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.idCliente = idCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "apellido=" + apellido + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", idCliente=" + idCliente + '}';
    }
     
    
}

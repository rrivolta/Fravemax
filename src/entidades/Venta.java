package entidades;

import java.time.LocalDate;


public class Venta {

    private int idVenta;
    private Cliente cliente;
    private LocalDate fechaVenta;
    private boolean estado;
    
    public Venta() {
    }

    public Venta(Cliente cliente, LocalDate fechaVenta, boolean estado) {
        this.cliente = cliente;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
    }

    public Venta(int idVenta, Cliente cliente, LocalDate fechaVenta, boolean estado) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", cliente=" + cliente + ", fechaVenta=" + fechaVenta + ", estado=" + estado + '}';
    }
    
}

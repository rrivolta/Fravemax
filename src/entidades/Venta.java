package entidades;

import java.time.LocalDate;


public class Venta {

    private int idVenta;
    private Cliente cliente;
    private LocalDate fechaVenta;

    public Venta() {
    }

    public Venta(Cliente cliente, LocalDate fechaVenta) {
        this.cliente = cliente;
        this.fechaVenta = fechaVenta;
    }

    public Venta(int idVenta, Cliente cliente, LocalDate fechaVenta) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.fechaVenta = fechaVenta;
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

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", cliente=" + cliente + ", fechaVenta=" + fechaVenta + '}';
    }
    
    
    
}

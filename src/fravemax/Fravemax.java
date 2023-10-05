package fravemax;

import accesoADatos.ClienteData;
import java.sql.Connection;
import accesoADatos.Conexion;
import accesoADatos.ProductoData;
import accesoADatos.VentaData;
import entidades.Cliente;
import entidades.Producto;
import entidades.Venta;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import javax.swing.JOptionPane;
public class Fravemax {

   
    public static void main(String[] args) {
        
       //Connection conexion = Conexion.getConexion();
        ProductoData pd=new ProductoData();
   
        /*Producto producto = new Producto (10, "Aire Acondicionado", "Aire Acondicionado 2250 Frigorias", 255.089, true);
       
        pd.registrarProducto(producto);*/
    
        /*Producto producto2 = new Producto (1, 10, "Ventilador", "Ventilador 3 velocidades", 55.200, true);
       
        pd.modificarProducto(producto2);*/
        
        /*Producto producto3 = new Producto (1, 10, "Ventilador", "Ventilador 3 velocidades", 55.200, true);
      
        pd.eliminarProducto(1);*/
    
        
        /*List<Producto> productos=pd.listarProductos();
        for(Producto producto: productos){
            JOptionPane.showMessageDialog(null, producto.toString());        
        
    }*/
        ClienteData cd = new ClienteData();
        
        /*Cliente cliente = new Cliente( "Gonzalez", "Ricardo", "malabia 3344",  "1160326748", true);
        //cd.registrarCliente(cliente);*/
    
        Cliente cliente = new Cliente( "Gonzalez", "Ricardo Ricardo", "malabia 3344",  "1160326754", 1, true);
         //cd.modificarCliente(cliente);*/
   
        //cd.eliminarCliente(1);
    
        VentaData vd = new VentaData();
        Venta venta = new Venta(1,cliente,LocalDate.of(2022, 06, 23));
        //vd.registrarVenta(venta);

        //vd.modificarVenta(venta);
    
        //vd.eliminarVenta(1);
        
        
        System.out.println(pd.buscarProducto(4).toString());
    }
        
    
}
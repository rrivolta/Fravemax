package fravemax;

import accesoADatos.ClienteData;
import accesoADatos.Conexion;
import accesoADatos.DetalleVtaData;
import accesoADatos.ProductoData;
import accesoADatos.VentaData;
import entidades.Cliente;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.AdministrarClientes;
import vista.DetalleDeVentas;
import vista.RealizarVentas;

public class Fravemax {

    public static void main(String[] args) {

//       //Connection conexion = Conexion.getConexion();
//        ProductoData pd=new ProductoData();
//   
//        /*Producto producto = new Producto (10, "Aire Acondicionado", "Aire Acondicionado 2250 Frigorias", 255.089, true);
//       
//        pd.registrarProducto(producto);*/
//    
//        /*Producto producto2 = new Producto (1, 10, "Ventilador", "Ventilador 3 velocidades", 55.200, true);
//       
//        pd.modificarProducto(producto2);*/
//        
//        /*Producto producto3 = new Producto (1, 10, "Ventilador", "Ventilador 3 velocidades", 55.200, true);
//      
//        pd.eliminarProducto(1);*/
//    
//        
//        /*List<Producto> productos=pd.listarProductos();
//        for(Producto producto: productos){
//            JOptionPane.showMessageDialog(null, producto.toString());        
//        
//    }*/
//        ClienteData cd = new ClienteData();
//        
//        /*Cliente cliente = new Cliente( "Gonzalez", "Ricardo", "malabia 3344",  "1160326748", true);
//        //cd.registrarCliente(cliente);*/
//    
//        Cliente cliente = new Cliente( "Gonzalez", "Ricardo Ricardo", "malabia 3344",  "1160326754", 1, true);
//         //cd.modificarCliente(cliente);*/
//   
//        //cd.eliminarCliente(1);
//    
//        VentaData vd = new VentaData();
//        Venta venta = new Venta(1,cliente,LocalDate.of(2022, 06, 23));
//        //vd.registrarVenta(venta);
//
//        //vd.modificarVenta(venta);
//    
//        //vd.eliminarVenta(1);
//      
        /*Cliente cliente = new Cliente("Gonzalez", "Ricardo Ricardo", "malabia 3344", "1160326754", 1, true);
        Venta v1 = new Venta(cliente, LocalDate.now(),true);
        VentaData vd = new VentaData();
        vd.registrarVenta(v1);
        DetalleVenta dv = new DetalleVenta(v1);
        Producto producto1 = new Producto( 1, "Ventilador", "Ventilador 3 velocidades", 55.200,10, true);
        dv.agregarProducto(producto1);
        dv.agregarProducto(producto1);
        dv.agregarProducto(producto1);
        Producto producto2 = new Producto(5, "licuadora liliana", "licuadora liliana de 3 velocidades con vaso irrompible.", 85.000, 10, true);
        dv.agregarProducto(producto2);
        dv.agregarProducto(producto2);
        DetalleVtaData dvd = new DetalleVtaData();
        dvd.registrarDetalle(dv);*/
        
        
        /*VentaData vd = new VentaData();
        System.out.println(vd.listarVentaXFecha(LocalDate.of(2023, 10, 06)));
        for (Venta mat : vd.listarVentaXFecha(LocalDate.of(2023, 10, 06))) {
            System.out.println(mat);
        }
        
        //ClienteData cd = new ClienteData();
        ProductoData pd = new ProductoData();
        for (Producto pro : pd.buscarProductoXFecha(LocalDate.of(2023, 10, 06), 12)) {
            System.out.println(pro);
        }*/
        
        //JFrame frame = new JFrame("Aplicación de Ventas");
        JFrame frame = new JFrame("Realizar de Ventas");
        JDesktopPane desktopPane = new JDesktopPane();
        
        DetalleDeVentas detalleDeVentas = new DetalleDeVentas();
        RealizarVentas rv = new RealizarVentas();
        desktopPane.add(rv);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(desktopPane);
        frame.setSize(800, 600); // Establece el tamaño del JFrame según tus necesidades.
        frame.setVisible(true);

    }
}

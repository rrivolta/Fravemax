package fravemax;

import java.sql.Connection;
import accesoADatos.Conexion;
import accesoADatos.ProductoData;
import entidades.Producto;
public class Fravemax {

   
    public static void main(String[] args) {
        
       Connection conexion = Conexion.getConexion();
        
   
        /*Producto producto = new Producto (10, "Aire Acondicionado", "Aire Acondicionado 2250 Frigorias", 255.089, true);
        ProductoData pd = new ProductoData();
        pd.registrarProducto(producto);*/
    
        /*Producto producto2 = new Producto (1, 10, "Ventilador", "Ventilador 3 velocidades", 55.200, true);
        ProductoData pd1 = new ProductoData();
        pd1.modificarProducto(producto2);*/
        
        Producto producto3 = new Producto (1, 10, "Ventilador", "Ventilador 3 velocidades", 55.200, true);
        ProductoData pd2 = new ProductoData();
        pd2.eliminarProducto(1);
        
    }
}
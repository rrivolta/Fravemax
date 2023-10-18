
package v;

import accesoADatos.ClienteData;
import accesoADatos.ProductoData;
import entidades.Cliente;
import entidades.Producto;
import javax.swing.JOptionPane;

public class RegistrarProductos extends javax.swing.JInternalFrame {

    
    public RegistrarProductos() {
        initComponents();
        desactivarCampos();
        jBEliminar.setEnabled(false);
        jBModificar.setEnabled(false);
        jBGuardar.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jTNombreProd = new javax.swing.JTextField();
      jTDescripcion = new javax.swing.JTextField();
      jTStock = new javax.swing.JTextField();
      jTPrecioActual = new javax.swing.JTextField();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      jBAgregar = new javax.swing.JButton();
      jBModificar = new javax.swing.JButton();
      jBEliminar = new javax.swing.JButton();
      jBSalir = new javax.swing.JButton();
      jBGuardar = new javax.swing.JButton();
      jLIdProducto = new javax.swing.JLabel();
      jTIdProd = new javax.swing.JTextField();
      jBuscar = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();

      jLabel1.setText("Nombre del Producto");

      jLabel4.setText("Descripción");

      jLabel5.setText("Precio Actual");

      jLabel7.setText("Stock");

      jBAgregar.setText("Agregar");
      jBAgregar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBAgregarActionPerformed(evt);
         }
      });

      jBModificar.setText("Modificar");
      jBModificar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBModificarActionPerformed(evt);
         }
      });

      jBEliminar.setText("Eliminar");
      jBEliminar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBEliminarActionPerformed(evt);
         }
      });

      jBSalir.setText("Salir");
      jBSalir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBSalirActionPerformed(evt);
         }
      });

      jBGuardar.setText("Guardar");
      jBGuardar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBGuardarActionPerformed(evt);
         }
      });

      jLIdProducto.setText("ID Producto");

      jBuscar.setText("Buscar");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(jTNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLIdProducto)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBAgregar)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGap(18, 18, 18)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jTPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(jBGuardar)
                              .addGap(29, 29, 29)
                              .addComponent(jBModificar)
                              .addGap(18, 18, 18)
                              .addComponent(jBEliminar))
                           .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                              .addComponent(jTIdProd, javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jTStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jBuscar)
                           .addComponent(jBSalir))))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(45, 45, 45)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jTNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(17, 17, 17)
                  .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jTPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLIdProducto)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jTIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jBuscar)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jBAgregar)
               .addComponent(jBGuardar)
               .addComponent(jBModificar)
               .addComponent(jBEliminar)
               .addComponent(jBSalir))
            .addGap(35, 35, 35))
      );

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 532, Short.MAX_VALUE)
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );

      jLabel2.setText("Registrar Productos");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(196, 196, 196))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
       if (jTNombreProd.getText().isEmpty() || jTDescripcion.getText().isEmpty() || jTPrecioActual.getText().isEmpty() || jTStock.getText().isEmpty() || jTIdProd.getText().isEmpty()) {

           JOptionPane.showMessageDialog(this, "No deje campos en blanco");
           return;
       }
       String nombreProd = jTNombreProd.getText();
       String descripcion = jTDescripcion.getText();
       double precioActual = Double.parseDouble(jTPrecioActual.getText());
       int stock = Integer.parseInt(jTStock.getText());

       ProductoData prodData = new ProductoData();
       Producto prod = prodData.buscarProducto(Integer.parseInt(jTIdProd.getText()));
       prod.setNombreProducto(nombreProd);
       prod.setDescripcion(descripcion);
       prod.setPrecioActual(precioActual);
       prod.setStock(stock);
       prodData.modificarProducto(prod);

       limpiar();

   }//GEN-LAST:event_jBModificarActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed

        activarCampos();
        jBGuardar.setEnabled(true);
        jTIdProd.setEditable(false);


    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (jTNombreProd.getText().isEmpty() || jTDescripcion.getText().isEmpty() || jTPrecioActual.getText().isEmpty() || jTStock.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "No deje campos en blanco");
            return;
        }

        String nombreProd = jTNombreProd.getText();
        String descripcion = jTDescripcion.getText();
        double precioActual = Double.parseDouble(jTPrecioActual.getText());
        int stock = Integer.parseInt(jTStock.getText());

        Producto prod = new Producto(nombreProd, descripcion, precioActual, stock, true);
        ProductoData prodData = new ProductoData();
        prodData.registrarProducto(prod);

        limpiar();


    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        try {
            int idProducto = Integer.parseInt(jTIdProd.getText());
            ProductoData pd = new ProductoData();
            pd.eliminarProducto(idProducto);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido");

        }
        limpiar();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jBAgregar;
   private javax.swing.JButton jBEliminar;
   private javax.swing.JButton jBGuardar;
   private javax.swing.JButton jBModificar;
   private javax.swing.JButton jBSalir;
   private javax.swing.JButton jBuscar;
   private javax.swing.JLabel jLIdProducto;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JTextField jTDescripcion;
   private javax.swing.JTextField jTIdProd;
   private javax.swing.JTextField jTNombreProd;
   private javax.swing.JTextField jTPrecioActual;
   private javax.swing.JTextField jTStock;
   // End of variables declaration//GEN-END:variables

    private void limpiar() {
        jTNombreProd.setText("");
        jTDescripcion.setText("");
        jTPrecioActual.setText("");
        jTStock.setText("");
        jTIdProd.setText("");

    }

    private void activarCampos() {
        jTNombreProd.setEnabled(true);
        jTDescripcion.setEnabled(true);
        jTPrecioActual.setEnabled(true);
        jTIdProd.setEditable(true);
    }

    private void desactivarCampos() {
        jTNombreProd.setEnabled(false);
        jTDescripcion.setEnabled(false);
        jTStock.setEnabled(false);
        jTIdProd.setEditable(false);

    }
}

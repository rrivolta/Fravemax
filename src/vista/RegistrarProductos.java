
package vista;

import accesoADatos.ClienteData;
import accesoADatos.ProductoData;
import entidades.Cliente;
import entidades.Producto;
import javax.swing.JOptionPane;
import menu.main;

public class RegistrarProductos extends javax.swing.JPanel {

    public RegistrarProductos() {
        initComponents();
        initComponents();
        desactivarCampos();
        jBEliminar.setEnabled(false);
        jBModificar.setEnabled(false);
        jBGuardar.setEnabled(false);
    }

	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTNombreProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTPrecioActual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTStock = new javax.swing.JTextField();
        jLIdProducto = new javax.swing.JLabel();
        jTIdProd = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(157, 196, 162));
        setPreferredSize(new java.awt.Dimension(734, 564));

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setText("Nombre del Producto");

        jLabel4.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel4.setText("Descripción");

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel5.setText("Precio Actual");

        jLabel7.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel7.setText("Stock");

        jLIdProducto.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLIdProducto.setText("ID Producto");

        jBAgregar.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar_24.png"))); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.setContentAreaFilled(false);
        jBAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar_24.png"))); // NOI18N
        jBAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar_32.png"))); // NOI18N
        jBAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar_24.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setContentAreaFilled(false);
        jBGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar_24.png"))); // NOI18N
        jBGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar_32.png"))); // NOI18N
        jBGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar_24.png"))); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.setContentAreaFilled(false);
        jBModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar_24.png"))); // NOI18N
        jBModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar_32.png"))); // NOI18N
        jBModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_24.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setContentAreaFilled(false);
        jBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_24.png"))); // NOI18N
        jBEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar_32.png"))); // NOI18N
        jBEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_24.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setContentAreaFilled(false);
        jBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_24.png"))); // NOI18N
        jBSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_32.png"))); // NOI18N
        jBSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBuscar.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_24.png"))); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.setContentAreaFilled(false);
        jBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_24.png"))); // NOI18N
        jBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_32.png"))); // NOI18N
        jBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rakoon Personal Use", 0, 36)); // NOI18N
        jLabel2.setText("Registrar Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(79, 79, 79)
                                    .addComponent(jBuscar))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBAgregar)
                                    .addGap(40, 40, 40)
                                    .addComponent(jBGuardar))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jTNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(jBModificar)
                                    .addGap(35, 35, 35)
                                    .addComponent(jBEliminar)
                                    .addGap(45, 45, 45)
                                    .addComponent(jBSalir)))))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIdProducto))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIdProducto)
                    .addComponent(jTIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAgregar)
                            .addComponent(jBGuardar)
                            .addComponent(jBModificar)
                            .addComponent(jBEliminar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jBSalir)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
      jTIdProd.setEditable(true);

   }//GEN-LAST:event_jBGuardarActionPerformed

   private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
       if (jTNombreProd.getText().isEmpty() || jTDescripcion.getText().isEmpty() || jTPrecioActual.getText().isEmpty()
               || jTStock.getText().isEmpty() || jTIdProd.getText().isEmpty()) {
           JOptionPane.showMessageDialog(this, "No deje campos en blanco");
           return;
       }
       String nombreProd = jTNombreProd.getText();
       String descripcion = jTDescripcion.getText();
       try {
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
       } catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(this, "Debe ingresar números en el campo 'Precio Actual'");
       }
   }//GEN-LAST:event_jBModificarActionPerformed

   private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
      try {
         int idProducto = Integer.parseInt(jTIdProd.getText());
         ProductoData pd = new ProductoData();
         pd.eliminarProducto(idProducto);
      } catch (NullPointerException ex) {
         JOptionPane.showMessageDialog(this, "Ingrese un ID válido");
      } catch (NumberFormatException ex){
          return;
      }
      limpiar();
   }//GEN-LAST:event_jBEliminarActionPerformed
                                           
    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        activarCampos();  
        jBEliminar.setEnabled(true);
        jBModificar.setEnabled(true);
        try {
            int idProducto = Integer.parseInt(jTIdProd.getText());
            ProductoData pd = new ProductoData();
            Producto producto = pd.buscarProducto(idProducto);
            
            jTNombreProd.setText(producto.getNombreProducto());
            jTDescripcion.setText(producto.getDescripcion());
            jTPrecioActual.setText(""+producto.getPrecioActual());
            jTStock.setText(""+producto.getStock());
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido");
            limpiar();
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error en el campo IDProducto. Ingrese solo numeros");
            limpiar();
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.setVisible(false);
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
        jTStock.setEnabled(true);
    }

    private void desactivarCampos() {
        jTNombreProd.setEnabled(false);
        jTDescripcion.setEnabled(false);
        jTPrecioActual.setEnabled(false);
        jTStock.setEnabled(false);

    }

//	private void dispose() {
//		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//	}
}

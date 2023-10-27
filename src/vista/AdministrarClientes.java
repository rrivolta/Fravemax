
package vista;

import accesoADatos.ClienteData;
import entidades.Cliente;
import javax.swing.JOptionPane;


public class AdministrarClientes extends javax.swing.JPanel {

	public AdministrarClientes() {
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
        jTNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jTDire = new javax.swing.JTextField();
        jTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLBuscar = new javax.swing.JLabel();
        jTBuscarid = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jRActivo = new javax.swing.JRadioButton();
        jRInactivo = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(157, 196, 162));
        setForeground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setText("Administrar Clientes");

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel3.setText("Apellido");

        jTDire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDireActionPerformed(evt);
            }
        });

        jTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefonoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel4.setText("Dirección");

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel5.setText("Num. Teléfono");

        jLBuscar.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLBuscar.setText("Id Cliente");

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

        jRActivo.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jRActivo.setText("Cliente activo");
        jRActivo.setContentAreaFilled(false);
        jRActivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRActivo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRActivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRActivoMouseClicked(evt);
            }
        });
        jRActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRActivoActionPerformed(evt);
            }
        });

        jRInactivo.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jRInactivo.setText("Cliente inactivo");
        jRInactivo.setContentAreaFilled(false);
        jRInactivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRInactivo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRInactivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRInactivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jRActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jRInactivo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(jTBuscarid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(91, 91, 91)
                                                .addComponent(jBuscar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBAgregar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBGuardar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBModificar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBEliminar)))))
                                .addGap(18, 18, 18)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTDire, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTDire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTBuscarid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLBuscar))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBuscar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAgregar)
                    .addComponent(jBGuardar)
                    .addComponent(jBModificar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
      jBGuardar.setEnabled(false);
      activarCampos();
      jBEliminar.setEnabled(true);
      jBModificar.setEnabled(true);

      try {
         int idCliente = Integer.parseInt(jTBuscarid.getText());
         ClienteData cd = new ClienteData();
         Cliente cliente = cd.buscarCliente(idCliente);
         if (cliente.getIdCliente() == 0) {
              JOptionPane.showMessageDialog(this, "No existe el cliente");
              desactivarCampos();
              jBEliminar.setEnabled(false);
              jBModificar.setEnabled(false);
              limpiar();
          }
         jTNombre.setText(cliente.getNombre());
         jTApellido.setText(cliente.getApellido());
         jTDire.setText(cliente.getDomicilio());
         jTelefono.setText(cliente.getTelefono());
          if (cliente.isEstado()) {
              jRActivo.setSelected(true);
              jRInactivo.setSelected(false);
          }else {
              jRInactivo.setSelected(true);
              jRActivo.setSelected(false);
          }

      }catch(NullPointerException ex){

         JOptionPane.showMessageDialog(this, "Ingrese un ID válido");

      }catch (NumberFormatException ex){
         JOptionPane.showMessageDialog(null, "Error en el campo IDCliente. Ingrese solo numeros");
      }
   }//GEN-LAST:event_jBuscarActionPerformed

   private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
      this.setVisible(false);
   }//GEN-LAST:event_jBSalirActionPerformed

   private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

      try {
         int idCliente = Integer.parseInt(jTBuscarid.getText());
         ClienteData cd = new ClienteData();
         cd.eliminarCliente(idCliente);
      } catch (NullPointerException ex) {
         JOptionPane.showMessageDialog(this, "Ingrese un ID válido");

      }
      limpiar();
   }//GEN-LAST:event_jBEliminarActionPerformed

   private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
      if (jTNombre.getText().isEmpty() || jTApellido.getText().isEmpty() || jTDire.getText().isEmpty() || jTelefono.getText().isEmpty()) {

         JOptionPane.showMessageDialog(this, "No deje campos en blanco");
         return;
      }

      String nombre = jTNombre.getText();
      String apellido = jTApellido.getText();
      String direccion = jTDire.getText();
      String telefono = jTelefono.getText();
      boolean estado = jRActivo.isSelected();
      ClienteData clientedata = new ClienteData();

      Cliente cliente = clientedata.buscarCliente(Integer.parseInt(jTBuscarid.getText()));
      cliente.setNombre(nombre);
      cliente.setApellido(apellido);
      cliente.setDomicilio(direccion);
      cliente.setTelefono(telefono);
      cliente.setEstado(estado);
      clientedata.modificarCliente(cliente);

      limpiar();
      jRActivo.setSelected(false);
      jRInactivo.setSelected(false);
   }//GEN-LAST:event_jBModificarActionPerformed

   private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

      if (jTNombre.getText().isEmpty() || jTApellido.getText().isEmpty() || jTDire.getText().isEmpty() || jTelefono.getText().isEmpty()) {

         JOptionPane.showMessageDialog(this, "No deje campos en blanco");
         return;
      }

      String nombre = jTNombre.getText();
      String apellido = jTApellido.getText();
      String direccion = jTDire.getText();
      String telefono = jTelefono.getText();

      Cliente cliente = new Cliente(nombre, apellido, direccion, telefono, true);
      ClienteData clientedata = new ClienteData();
      clientedata.registrarCliente(cliente);

      limpiar();
      jTBuscarid.setEditable(true);
      jBGuardar.setEnabled(false);
   }//GEN-LAST:event_jBGuardarActionPerformed

   private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
      limpiar();
      jBEliminar.setEnabled(false);
      jBModificar.setEnabled(false);
      activarCampos();
      jBGuardar.setEnabled(true);
      jRActivo.setEnabled(false);
      jRInactivo.setEnabled(false);

   }//GEN-LAST:event_jBAgregarActionPerformed

    private void jRActivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRActivoMouseClicked
        jRInactivo.setSelected(false);
    }//GEN-LAST:event_jRActivoMouseClicked

    private void jRInactivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRInactivoMouseClicked
        jRActivo.setSelected(false);
    }//GEN-LAST:event_jRInactivoMouseClicked

    private void jRActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRActivoActionPerformed

    private void jTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelefonoActionPerformed

    private void jTDireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDireActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRActivo;
    private javax.swing.JRadioButton jRInactivo;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTBuscarid;
    private javax.swing.JTextField jTDire;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTelefono;
    // End of variables declaration//GEN-END:variables
private void limpiar() {
        jTNombre.setText("");
        jTApellido.setText("");
        jTDire.setText("");
        jTelefono.setText("");
        jTBuscarid.setText("");
        
    }

    private void activarCampos() {
        jTNombre.setEnabled(true);
        jTApellido.setEnabled(true);
        jTDire.setEnabled(true);
        jTelefono.setEnabled(true);
    }

    private void desactivarCampos() {
        jTNombre.setEnabled(false);
        jTApellido.setEnabled(false);
        jTDire.setEnabled(false);
        jTelefono.setEnabled(false);

    }


}

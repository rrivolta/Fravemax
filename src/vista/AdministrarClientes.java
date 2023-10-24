
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

      jLabel1.setText("Administrar Clientes");

      jLabel2.setText("Nombre");

      jLabel3.setText("Apellido");

      jLabel4.setText("Dirección");

      jLabel5.setText("Num. Teléfono");

      jLBuscar.setText("Id Cliente");

      jBuscar.setText("Buscar");
      jBuscar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBuscarActionPerformed(evt);
         }
      });

      jBSalir.setText("Salir");
      jBSalir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBSalirActionPerformed(evt);
         }
      });

      jBEliminar.setText("Eliminar");
      jBEliminar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBEliminarActionPerformed(evt);
         }
      });

      jBModificar.setText("Modificar");
      jBModificar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBModificarActionPerformed(evt);
         }
      });

      jBGuardar.setText("Guardar");
      jBGuardar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBGuardarActionPerformed(evt);
         }
      });

      jBAgregar.setText("Agregar");
      jBAgregar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBAgregarActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel3)
                  .addGap(122, 122, 122)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(jLBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(30, 30, 30)
                              .addComponent(jTBuscarid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(jBAgregar)
                              .addGap(18, 18, 18)
                              .addComponent(jBGuardar)
                              .addGap(18, 18, 18)
                              .addComponent(jBModificar)
                              .addGap(28, 28, 28)))
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(jBuscar)
                           .addComponent(jBSalir)))
                     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel4)
                              .addGap(0, 0, Short.MAX_VALUE))
                           .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(jTNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                           .addComponent(jTApellido)
                           .addComponent(jTDire))))
                  .addGap(23, 23, 23))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(jLabel5)
                  .addGap(38, 38, 38)
                  .addComponent(jTelefono)
                  .addGap(22, 22, 22))))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel3)
               .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jTDire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel4))
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jBuscar)
               .addComponent(jLBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jTBuscarid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(36, 36, 36)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jBAgregar)
               .addComponent(jBModificar)
               .addComponent(jBEliminar)
               .addComponent(jBSalir)
               .addComponent(jBGuardar))
            .addGap(18, 18, 18))
      );
   }// </editor-fold>//GEN-END:initComponents

   private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
      jBEliminar.setEnabled(false);
      jBModificar.setEnabled(true);
      jBAgregar.setEnabled(false);
      jBGuardar.setEnabled(false);

      try {
         int idCliente = Integer.parseInt(jTBuscarid.getText());
         ClienteData cd = new ClienteData();
         Cliente cliente = cd.buscarCliente(idCliente);
         jTNombre.setText(cliente.getNombre());
         jTApellido.setText(cliente.getApellido());
         jTDire.setText(cliente.getDomicilio());
         jTelefono.setText(cliente.getTelefono());

      }catch(NullPointerException ex){

         JOptionPane.showMessageDialog(this, "Ingrese un ID válido");

      }catch (NumberFormatException ex){
         JOptionPane.showMessageDialog(null, "Error en el campo IDCliente. Ingrese solo numeros");
      }
      limpiar();

   }//GEN-LAST:event_jBuscarActionPerformed

   private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
      this.dispose();
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
      if (jTNombre.getText().isEmpty() || jTApellido.getText().isEmpty() || jTDire.getText().isEmpty() || jTelefono.getText().isEmpty() || jTBuscarid.getText().isEmpty()) {

         JOptionPane.showMessageDialog(this, "No deje campos en blanco");
         return;
      }

      String nombre = jTNombre.getText();
      String apellido = jTApellido.getText();
      String direccion = jTDire.getText();
      String telefono = jTelefono.getText();

      ClienteData clientedata = new ClienteData();

      Cliente cliente = clientedata.buscarCliente(Integer.parseInt(jTBuscarid.getText()));
      cliente.setNombre(nombre);
      cliente.setApellido(apellido);
      cliente.setDomicilio(direccion);
      cliente.setTelefono(telefono);

      clientedata.modificarCliente(cliente);

      limpiar();

   }//GEN-LAST:event_jBModificarActionPerformed

   private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

      if (jTNombre.getText().isEmpty() || jTApellido.getText().isEmpty() || jTDire.getText().isEmpty() || jTelefono.getText().isEmpty() || jTBuscarid.getText().isEmpty()) {

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
   }//GEN-LAST:event_jBGuardarActionPerformed

   private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
      activarCampos();
      jBGuardar.setEnabled(true);
      jTBuscarid.setEditable(false);

   }//GEN-LAST:event_jBAgregarActionPerformed


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
        jTelefono.setEditable(true);
    }

    private void desactivarCampos() {
        jTNombre.setEnabled(false);
        jTApellido.setEnabled(false);
        jTDire.setEnabled(false);
        jTelefono.setEditable(false);

    }

	private void dispose() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
  
        


}
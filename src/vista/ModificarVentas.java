package vista;

import accesoADatos.ClienteData;
import accesoADatos.VentaData;
import entidades.Cliente;
import entidades.Venta;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class ModificarVentas extends javax.swing.JPanel {

    public ModificarVentas() {
        initComponents();
        protocoloDeApertura();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTIdVenta = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTIdCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFechaVenta = new javax.swing.JTextField();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar o Eliminar Ventas");

        jLabel2.setText("Código de Venta");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Código Cliente");

        jLabel4.setText("Fecha de la Venta");

        jBEliminar.setText("Eliminar Venta");
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

        jBModificar.setText("Modificar ");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFechaVenta)
                                            .addComponent(jTIdCliente)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBModificar)
                                        .addGap(171, 171, 171)
                                        .addComponent(jBSalir)))
                                .addGap(0, 8, Short.MAX_VALUE)))))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBEliminar)
                    .addComponent(jBBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBBuscar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir)
                    .addComponent(jBModificar))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        activarCampos();  
        jBEliminar.setEnabled(true);
        jBModificar.setEnabled(true);
        try {
            int idVenta = Integer.parseInt(jTIdVenta.getText());
            VentaData vd = new VentaData();
            Venta venta = vd.buscarVenta(idVenta);
            
            jTIdCliente.setText(""+venta.getCliente().getIdCliente());
            
            LocalDate fechaVenta = venta.getFechaVenta();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
            String fechaVentaTexto = fechaVenta.format(formatter);
            jTFechaVenta.setText(fechaVentaTexto);

        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido");
            protocoloDeApertura();
            limpiar();
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error en el campo Código de Venta. Ingrese solo numeros");
            protocoloDeApertura();
            limpiar();
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        if (jTIdCliente.getText().isEmpty() || jTFechaVenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No deje campos en blanco");
            return;
        }
        
        DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoSalida = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        
        LocalDate fechaVenta = null;
        
        int idVenta = Integer.parseInt(jTIdVenta.getText());
        
        try {
            int idCliente = Integer.parseInt(jTIdCliente.getText());
        
            String fechaVentaTexto = jTFechaVenta.getText();

            fechaVenta = LocalDate.parse(fechaVentaTexto, formatoEntrada);

            VentaData vd = new VentaData();
            Venta venta = vd.buscarVenta(idVenta);
            ClienteData cd = new ClienteData();
            Cliente cliente = cd.buscarCliente(idCliente);
            venta.setCliente(cliente);
            System.out.println(cliente.getIdCliente());
            venta.setFechaVenta(fechaVenta);
            System.out.println(venta.getFechaVenta());
            vd.modificarVenta(venta);

            limpiar();
        } catch (DateTimeParseException e) {
            //JOptionPane.showMessageDialog(this, "Ingrese una fecha correcta");
            return;
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingrese números en el campo 'Código del Cliente'");
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        try {
         int idVenta = Integer.parseInt(jTIdVenta.getText());
         VentaData vd = new VentaData();
         vd.eliminarVenta(idVenta);
      } catch (NullPointerException ex) {
         JOptionPane.showMessageDialog(this, "Ingrese un ID válido");
      } catch (NumberFormatException ex){
          return;
      }
      limpiar();
    }//GEN-LAST:event_jBEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTFechaVenta;
    private javax.swing.JTextField jTIdCliente;
    private javax.swing.JTextField jTIdVenta;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        jTIdVenta.setText("");
        jTIdCliente.setText("");
        jTFechaVenta.setText("");
    }

    private void activarCampos() {
        jTIdCliente.setEnabled(true);
        jTFechaVenta.setEnabled(true);
    }

    private void desactivarCampos() {
        jTIdCliente.setEnabled(false);
        jTFechaVenta.setEnabled(false);
    }
    
    private void protocoloDeApertura() {
        desactivarCampos();
        jBEliminar.setEnabled(false);
        jBModificar.setEnabled(false);
    }

}

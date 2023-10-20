
package vistas;

import accesoADatos.ClienteData;
import accesoADatos.VentaData;
import entidades.Cliente;
import entidades.Venta;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VentasXFechaOXCliente extends javax.swing.JInternalFrame {
    
        private DefaultTableModel modeloTablaFecha = new DefaultTableModel() {
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };
        
         private DefaultTableModel modeloTablaCliente = new DefaultTableModel() {
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };


	public VentasXFechaOXCliente() {
            initComponents();
            cargarCombo();
            armarCabeceraTablaCliente();
            armarCabeceraTablaFecha();
            desactivarElementos();
            limpiarTabla(jTFecha, modeloTablaFecha);
            limpiarTabla(jTClliente, modeloTablaCliente);
	}


	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFecha = new javax.swing.JTable();
        jCBCliente = new javax.swing.JComboBox<Cliente>();
        jLabel3 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jCheckFecha = new javax.swing.JCheckBox();
        jCheckCliente = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTClliente = new javax.swing.JTable();

        jRadioButton1.setText("jRadioButton1");

        jCheckBox3.setText("jCheckBox3");

        jLabel1.setText("Listar las ventas por fecha o por cliente");

        jTFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código de venta", "Id del cliente", "Apellido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTFecha);

        jCBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione un cliente");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione una fecha");

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jCheckFecha.setText("Ventas por fecha");
        jCheckFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckFechaActionPerformed(evt);
            }
        });

        jCheckCliente.setText("Ventas por cliente");
        jCheckCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteActionPerformed(evt);
            }
        });

        jTClliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código de venta", "Fecha de venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTClliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jCheckFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckFecha)
                    .addComponent(jCheckCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckFechaActionPerformed
        jDateChooser1.setEnabled(true);
        
    }//GEN-LAST:event_jCheckFechaActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        limpiarTabla(jTFecha, modeloTablaFecha);
        if(jDateChooser1.getDate() != null){
            LocalDate fechaDeVentas = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            VentaData vd = new VentaData();
            List<Venta> ventasPorFecha = vd.listarVentaXFecha(fechaDeVentas);

            for (Venta venta : ventasPorFecha) {
                modeloTablaFecha.addRow(new Object[]{venta.getIdVenta(), venta.getCliente().getIdCliente(),
                    venta.getCliente().getApellido()});
            }
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jCheckClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteActionPerformed
        jCBCliente.setEnabled(true);
    }//GEN-LAST:event_jCheckClienteActionPerformed

    private void jCBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBClienteActionPerformed
        limpiarTabla(jTClliente, modeloTablaCliente);
        Cliente cliente = (Cliente)jCBCliente.getSelectedItem();
        
        VentaData vd = new VentaData();
        List<Venta> ventasDelCliente = vd.listarVentaXCliente(cliente);
        
        for(Venta venta: ventasDelCliente){
            modeloTablaCliente.addRow(new Object[]{venta.getIdVenta(), venta.getFechaVenta()});
        }
    }//GEN-LAST:event_jCBClienteActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JComboBox<Cliente> jCBCliente;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckCliente;
    private javax.swing.JCheckBox jCheckFecha;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTClliente;
    private javax.swing.JTable jTFecha;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraTablaCliente() {
        modeloTablaCliente.addColumn("Código de venta");
        modeloTablaCliente.addColumn("Fecha de venta");
        jTClliente.setModel(modeloTablaCliente);
    }
    
    private void armarCabeceraTablaFecha() {
        modeloTablaFecha.addColumn("Código de venta");
        modeloTablaFecha.addColumn("Id del cliente");
        modeloTablaFecha.addColumn("Apellido");
        jTFecha.setModel(modeloTablaFecha);
    }
    
    private void cargarCombo() {
        ClienteData cd = new ClienteData();
        for (Cliente cli : cd.listarClientes()) {
            jCBCliente.addItem(cli);
        }
    }
    
    private void limpiarTabla(JTable jTabla, DefaultTableModel modeloTabla) {
        int f = jTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }
    
    private void desactivarElementos(){
        jCBCliente.setEnabled(false);
        jDateChooser1.setEnabled(false);
    }



}

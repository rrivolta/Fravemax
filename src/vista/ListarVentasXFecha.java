package vista;

import accesoADatos.ClienteData;
import accesoADatos.VentaData;
import entidades.Cliente;
import entidades.Venta;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarVentasXFecha extends javax.swing.JPanel {
    private boolean comboCargado=false;
    
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

    public ListarVentasXFecha() {

        initComponents();
        armarCabeceraTablaCliente();
        armarCabeceraTablaFecha();
        desactivarElementos();
        limpiarTabla(jTFecha, modeloTablaFecha);
        limpiarTabla(jTClliente, modeloTablaCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFecha = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTClliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCBCliente = new javax.swing.JComboBox<>();
        jCheckFecha = new javax.swing.JCheckBox();
        jCheckCliente = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(157, 196, 162));

        Salir.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_24.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.setContentAreaFilled(false);
        Salir.setFocusable(false);
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_24.png"))); // NOI18N
        Salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_32.png"))); // NOI18N
        Salir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jTFecha.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
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

        jTClliente.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione una fecha");

        jLabel3.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel3.setText("Seleccione un cliente");

        jCBCliente.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jCBCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBClienteActionPerformed(evt);
            }
        });

        jCheckFecha.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jCheckFecha.setText("Ventas por fecha");
        jCheckFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckFechaActionPerformed(evt);
            }
        });

        jCheckCliente.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jCheckCliente.setText("Ventas por cliente");
        jCheckCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 34)); // NOI18N
        jLabel1.setText("Listar las ventas por fecha o por cliente");

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jCheckFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jCheckCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckCliente)
                    .addComponent(jCheckFecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void jCBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBClienteActionPerformed
       limpiarTabla(jTClliente, modeloTablaCliente);
       if (jCBCliente.getSelectedIndex() == -1) {
           JOptionPane.showMessageDialog(this, "Seleccione un cliente");
           return;
       }
       
       Cliente cliente = (Cliente) jCBCliente.getSelectedItem();
       try{
       VentaData vd = new VentaData();
       List<Venta> ventasDelCliente = vd.listarVentaXCliente(cliente);

       for (Venta venta : ventasDelCliente) {
           modeloTablaCliente.addRow(new Object[]{venta.getIdVenta(), venta.getFechaVenta()});
       }
       }catch(NullPointerException ex){
           return;
       }
   }//GEN-LAST:event_jCBClienteActionPerformed
    
   private void jCheckFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckFechaActionPerformed
       limpiarTabla(jTFecha, modeloTablaFecha);
       limpiarTabla(jTClliente, modeloTablaCliente);
       jCheckCliente.setSelected(false);
       jCBCliente.setEnabled(false);
       jDateChooser1.setEnabled(true);
       
   }//GEN-LAST:event_jCheckFechaActionPerformed

   private void jCheckClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteActionPerformed
       limpiarTabla(jTFecha, modeloTablaFecha);
       limpiarTabla(jTClliente, modeloTablaCliente);
       jCheckFecha.setSelected(false);
       jDateChooser1.setDate(null);
       jCBCliente.setEnabled(true);
       if (!comboCargado) {
           cargarCombo();
           this.comboCargado = true;
       }
   }//GEN-LAST:event_jCheckClienteActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        limpiarTabla(jTFecha, modeloTablaFecha);
        if (jDateChooser1.getDate() != null) {
            LocalDate fechaDeVentas = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            VentaData vd = new VentaData();
            List<Venta> ventasPorFecha = vd.listarVentaXFecha(fechaDeVentas);
            
            for (Venta venta : ventasPorFecha) {
                modeloTablaFecha.addRow(new Object[]{venta.getIdVenta(), venta.getCliente().getIdCliente(),
                    venta.getCliente().getApellido()});
            }
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JComboBox<Cliente> jCBCliente;
    private javax.swing.JCheckBox jCheckCliente;
    private javax.swing.JCheckBox jCheckFecha;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
        jCBCliente.addItem(null);
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

    private void desactivarElementos() {
        jCBCliente.setEnabled(false);
        jDateChooser1.setEnabled(false);
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

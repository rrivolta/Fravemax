
package vista;

import accesoADatos.ProductoData;
import accesoADatos.VentaData;
import entidades.Producto;
import entidades.Venta;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ProductosVentaXFecha extends javax.swing.JPanel {
	
	    private DefaultTableModel modeloTabla = new DefaultTableModel() {
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };

	public ProductosVentaXFecha() {
		initComponents();
		armarCabecera();
                limpiarTabla(jTable, modeloTabla);
                jCVenta.setEnabled(false);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jCVenta = new javax.swing.JComboBox<>();
        jDate = new com.toedter.calendar.JDateChooser();
        jBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(157, 196, 162));

        jLabel3.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel3.setText("Elija la fecha");

        jLabel2.setFont(new java.awt.Font("Rakoon Personal Use", 0, 36)); // NOI18N
        jLabel2.setText("Mostrar productos");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Descripción"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setText("Seleccione Venta");

        jCVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCVentaActionPerformed(evt);
            }
        });

        jDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDatePropertyChange(evt);
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
        jBSalir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54)
                                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(173, 173, 173))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jBSalir)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void jCVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCVentaActionPerformed
      limpiarTabla(jTable, modeloTabla);
       /*if (jCVenta.getSelectedIndex()== -1) {
           JOptionPane.showMessageDialog(this, "Seleccione una venta");
           return;
       }*/
      try{
      Venta venta = (Venta)jCVenta.getSelectedItem();
      ProductoData pd = new ProductoData();
      LocalDate fechaDeVenta = jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
      List<Producto> productosDeVenta = pd.buscarProductoXVenta(fechaDeVenta, venta.getIdVenta());
      
      for (Producto prod : productosDeVenta) {
         modeloTabla.addRow(new Object[]{prod.getIdProducto(), prod.getNombreProducto(), prod.getDescripcion()});
      }
      }catch(NullPointerException ex){
          return;
      }
   }//GEN-LAST:event_jCVentaActionPerformed

   private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
       this.setVisible(false);
   }//GEN-LAST:event_jBSalirActionPerformed

    private void jDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDatePropertyChange
        jCVenta.removeAllItems();
        if(jDate.getDate() != null){
            LocalDate fechaDeVenta = jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            jCVenta.setEnabled(true);
            cargarCombo(fechaDeVenta);
    }//GEN-LAST:event_jDatePropertyChange
    }
		  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Venta> jCVenta;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables

	

    private void armarCabecera() {
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Descripción del producto");
        jTable.setModel(modeloTabla);
    }
    
    private void cargarCombo(LocalDate fechaVenta) {
        jCVenta.addItem(null);
        VentaData vd = new VentaData();
        for (Venta venta : vd.listarVentaXFecha(fechaVenta)) {
            jCVenta.addItem(venta);
        }
    }
    
    private void limpiarTabla(JTable jTable, DefaultTableModel modeloTabla) {
        int f = jTable.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }

}

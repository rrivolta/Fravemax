/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package v;

import accesoADatos.DetalleVtaData;
import accesoADatos.VentaData;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DetalleDeVentas extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };

    public DetalleDeVentas() {
        initComponents();
        armarCabeceraTabla();
        cargarCombo();
        limpiarTabla(jTable, modeloTabla);
    }

	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTable = new javax.swing.JTable();
      jLabel2 = new javax.swing.JLabel();
      jTImporte = new javax.swing.JTextField();
      jBSalir = new javax.swing.JButton();
      jLabel3 = new javax.swing.JLabel();
      jCBox = new javax.swing.JComboBox<Venta>();

      jLabel1.setText("Detalle de Venta");

      jTable.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
         },
         new String [] {
            "ID Venta", "Código Producto", "cantidad", "Valor Unitario"
         }
      ) {
         boolean[] canEdit = new boolean [] {
            false, false, true, false
         };

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      jScrollPane1.setViewportView(jTable);

      jLabel2.setText("Importe Final");

      jBSalir.setText("Salir");
      jBSalir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBSalirActionPerformed(evt);
         }
      });

      jLabel3.setText("Seleccione una venta");

      jCBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCBoxActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addContainerGap(17, Short.MAX_VALUE)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jBSalir))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jTImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(jTImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
            .addComponent(jBSalir)
            .addGap(21, 21, 21))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBoxActionPerformed
        limpiarTabla(jTable, modeloTabla);
        Venta venta = (Venta) jCBox.getSelectedItem();
        
        DetalleVtaData dvd = new DetalleVtaData();
        DetalleVenta dv = dvd.buscarDetalle(venta.getIdVenta());
        
        try {
            Set<Producto> hs = new HashSet<>(dv.getProductos());
            double precioTotal = 0.0;
            for (Producto prod : hs) {
                DecimalFormat formato = new DecimalFormat("0.00");
                double precioProducto = 0.0;
                int ocurrencias = dv.cantidadDeOcurrencias(prod);
                precioProducto += ocurrencias * prod.getPrecioActual();
                precioProducto = Math.round(precioProducto * 100.0) / 100.0;
                precioTotal += precioProducto;
                modeloTabla.addRow(new Object[]{dv.getVenta().getIdVenta(), prod.getIdProducto(), ocurrencias, precioTotal});
            }
            jTImporte.setText(String.valueOf(precioTotal));
        }catch (NullPointerException ex){
            return;
        }
        
    }//GEN-LAST:event_jCBoxActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jBSalir;
   private javax.swing.JComboBox<Venta> jCBox;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextField jTImporte;
   private javax.swing.JTable jTable;
   // End of variables declaration//GEN-END:variables

    private void armarCabeceraTabla() {
        modeloTabla.addColumn("Id Venta");
        modeloTabla.addColumn("Código Producto");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Precio por Unidad");
        jTable.setModel(modeloTabla);
    }
    
    private void cargarCombo() {
        VentaData vd = new VentaData();
        for (Venta venta : vd.listarVentas()) {
            jCBox.addItem(venta);
        }
    }
    
    private void limpiarTabla(JTable jTabla, DefaultTableModel modeloTabla) {
        int f = jTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }
 
}

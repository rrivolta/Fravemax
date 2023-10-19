
package vista;

import accesoADatos.ProductoData;
import accesoADatos.VentaData;
import entidades.Producto;
import entidades.Venta;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
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
      Salir = new javax.swing.JButton();
      jLabel2 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTable = new javax.swing.JTable();
      jLabel1 = new javax.swing.JLabel();
      jCVenta = new javax.swing.JComboBox<Venta>();
      jDate = new org.netbeans.modules.form.InvalidComponent();

      jLabel3.setText("Elija la fecha");

      Salir.setText("Salir");
      Salir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            SalirActionPerformed(evt);
         }
      });

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

      jLabel1.setText("Seleccione Venta");

      jCVenta.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCVentaActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(179, 179, 179)
            .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(59, 59, 59))
         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
               .addGap(14, 14, 14)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                           .addGap(17, 17, 17)
                           .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                           .addGap(5, 5, 5)
                           .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                     .addComponent(jCVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addGap(15, 15, 15))
                  .addGroup(layout.createSequentialGroup()
                     .addGap(131, 131, 131)
                     .addComponent(Salir)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                     .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(116, 116, 116)))
               .addGap(15, 15, 15)))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(39, 39, 39)
            .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(243, 243, 243))
         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
               .addGap(7, 7, 7)
               .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGap(18, 18, 18)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jCVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addComponent(Salir)
               .addGap(8, 8, 8)))
      );
   }// </editor-fold>//GEN-END:initComponents

   private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
      this.dispose();
   }//GEN-LAST:event_SalirActionPerformed

   private void jCVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCVentaActionPerformed
      limpiarTabla(jTable, modeloTabla);
      Venta venta = (Venta)jCVenta.getSelectedItem();
      ProductoData pd = new ProductoData();
      LocalDate fechaDeVenta = jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
      List<Producto> productosDeVenta = pd.buscarProductoXVenta(fechaDeVenta, venta.getIdVenta());

      for (Producto prod : productosDeVenta) {
         modeloTabla.addRow(new Object[]{prod.getIdProducto(), prod.getNombreProducto(), prod.getDescripcion()});
      }
   }//GEN-LAST:event_jCVentaActionPerformed

	   private void jDatePropertyChange(java.beans.PropertyChangeEvent evt) {                                     
        if(jDate.getDate() != null){
            LocalDate fechaDeVenta = jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            jCVenta.setEnabled(true);
            cargarCombo(fechaDeVenta);
        }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton Salir;
   private javax.swing.JComboBox<Venta> jCVenta;
   private org.netbeans.modules.form.InvalidComponent jDate;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTable;
   // End of variables declaration//GEN-END:variables

	private void dispose() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

    private void armarCabecera() {
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Descripción");
        jTable.setModel(modeloTabla);
    }
    
    private void cargarCombo(LocalDate fechaVenta) {
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

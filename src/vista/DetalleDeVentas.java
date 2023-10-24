package vista;
import accesoADatos.DetalleVtaData;
import accesoADatos.VentaData;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;;

public class DetalleDeVentas extends javax.swing.JPanel {
    
        //refresh
    
        private boolean comboCargado=false;

	private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };
    public DetalleDeVentas() {
        initComponents();
        armarCabeceraTabla();
        limpiarTabla(jTable, modeloTabla);
    }

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBSalir = new javax.swing.JButton();
        jTImporte = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jCBox = new javax.swing.JComboBox<Venta>();
        jLabel1 = new javax.swing.JLabel();

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Importe Final");

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

        jLabel3.setText("Seleccione una venta");

        jCBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBoxMouseClicked(evt);
            }
        });
        jCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Detalle de Venta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jTImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jBSalir)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jBSalir)
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
      this.setVisible(false);
		
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
               int ocurrencias = dv.cantidadDeOcurrencias(prod);
               double precioProducto = ocurrencias * prod.getPrecioActual();
               precioTotal += precioProducto;
               modeloTabla.addRow(new Object[]{dv.getVenta().getIdVenta(), prod.getIdProducto(), ocurrencias, precioProducto});
           }

           jTImporte.setText(String.valueOf(precioTotal));
       } catch (NullPointerException ex) {
           return;
       }

   }//GEN-LAST:event_jCBoxActionPerformed

    private void jCBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBoxMouseClicked
        if(!comboCargado){
            cargarCombo();
            this.comboCargado = true;
        }
    }//GEN-LAST:event_jCBoxMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Venta> jCBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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

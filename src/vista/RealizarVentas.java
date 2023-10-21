package vista;

import accesoADatos.ClienteData;
import accesoADatos.DetalleVtaData;
import accesoADatos.ProductoData;
import accesoADatos.VentaData;
import entidades.Cliente;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class RealizarVentas extends javax.swing.JPanel {

	private List<Producto> productos = new ArrayList<>();
        private boolean comboCargado = false;

        private DefaultTableModel modeloTabla = new DefaultTableModel() {
           public boolean isCellEditable(int r, int c) {
            return false;
        }
    };
	public RealizarVentas() {
            initComponents();
            armarCabeceraTabla();
            limpiarTabla(jTable, modeloTabla);
            desactivarElementos();
            //cargarComboClientes();
	}
        
        

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBox1 = new javax.swing.JComboBox<Cliente>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCBox2 = new javax.swing.JComboBox<Producto>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jBRegistar = new javax.swing.JButton();
        jBQuitar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jDFecha = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("Realizar Ventas");

        jLabel2.setText("Seleccione Cliente");

        jCBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBox1MouseClicked(evt);
            }
        });
        jCBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha");

        jLabel3.setText("Seleccione Producto");

        jCBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox2ActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Producto", "Descripción", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel4.setText("Productos");

        jBRegistar.setText("Registrar");
        jBRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistarActionPerformed(evt);
            }
        });

        jBQuitar.setText("Quitar");
        jBQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQuitarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jDFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDFechaPropertyChange(evt);
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
                        .addComponent(jBRegistar)
                        .addGap(33, 33, 33)
                        .addComponent(jBQuitar)
                        .addGap(45, 45, 45)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(28, 28, 28))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBox1, 0, 380, Short.MAX_VALUE)
                            .addComponent(jCBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jDFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jCBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBRegistar)
                            .addComponent(jBSalir)
                            .addComponent(jBQuitar))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void jCBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox1ActionPerformed
       jDFecha.setEnabled(true);
   }//GEN-LAST:event_jCBox1ActionPerformed

   private void jCBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox2ActionPerformed
      jBRegistar.setEnabled(true);
      jBQuitar.setEnabled(true);
      try{
          Producto prod = (Producto) jCBox2.getSelectedItem();
          ProductoData pd = new ProductoData();

          if (prod.getStock() > 0) {
              modeloTabla.addRow(new Object[]{prod.getIdProducto(), prod.getNombreProducto(),
                  prod.getDescripcion(), prod.getPrecioActual()});
              prod.setStock(prod.getStock() - 1);
              pd.modificarStock(prod);
              this.productos.add(prod);
          } else {
              JOptionPane.showMessageDialog(this, "Producto sin stock");
          }   
      }catch (NullPointerException ex){
          return;
      }
   }//GEN-LAST:event_jCBox2ActionPerformed

   private void jBRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistarActionPerformed
      Cliente cliente = (Cliente) jCBox1.getSelectedItem();
      //JOptionPane.showMessageDialog(this, "Seleccione un cliente");
      LocalDate fechaVenta=jDFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

      Venta venta = new Venta(cliente, fechaVenta, true);
      VentaData vd = new VentaData();
      vd.registrarVenta(venta);

      DetalleVenta detalle = new DetalleVenta(venta, this.productos);
      DetalleVtaData dvd = new DetalleVtaData();
      dvd.registrarDetalle(detalle);

      limpiarTabla(jTable, modeloTabla);
      vaciarLista();
      desactivarElementos();
   }//GEN-LAST:event_jBRegistarActionPerformed

   private void jBQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQuitarActionPerformed
       int fila = jTable.getSelectedRow();
       ProductoData pd = new ProductoData();

       if (fila >= 0) {
           Integer códigoProd = (Integer) modeloTabla.getValueAt(fila, 0);
           Producto prod = pd.buscarProducto(códigoProd);

           if (prod != null) {
               this.productos.remove(prod);
               prod.setStock(prod.getStock() + 1);
               pd.modificarStock(prod);

               int columnas = modeloTabla.getColumnCount();
               for (int columna = 0; columna < columnas; columna++) {
                   modeloTabla.setValueAt("", fila, columna);
               }

               // Notifica a la tabla que los datos han cambiado para que se refresque
               modeloTabla.fireTableDataChanged();
               modeloTabla.removeRow(fila);
               jCBox2.removeAllItems();
               cargarComboProductos();
           }
       }
   }//GEN-LAST:event_jBQuitarActionPerformed

   private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.setVisible(false);
       
   }//GEN-LAST:event_jBSalirActionPerformed

    private void jDFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDFechaPropertyChange

        if (jDFecha.getDate() != null) {
            jCBox2.setEnabled(true);

            // Borra todos los elementos actuales del JComboBox
            DefaultComboBoxModel<Producto> comboBoxModel = (DefaultComboBoxModel<Producto>) jCBox2.getModel();
            comboBoxModel.removeAllElements();

            // Carga el JComboBox con productos
            cargarComboProductos();
        }
    }//GEN-LAST:event_jDFechaPropertyChange

    private void jCBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBox1MouseClicked
        if(!comboCargado){
          cargarComboClientes();
          this.comboCargado = true;
      }
    }//GEN-LAST:event_jCBox1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBQuitar;
    private javax.swing.JButton jBRegistar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Cliente> jCBox1;
    private javax.swing.JComboBox<Producto> jCBox2;
    private com.toedter.calendar.JDateChooser jDFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
 
   private void armarCabeceraTabla() {
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Descripción");
        modeloTabla.addColumn("PrecioActual");
        jTable.setModel(modeloTabla);
    }
    
    private void cargarComboClientes() {
        ClienteData cd = new ClienteData();
        for (Cliente cli : cd.listarClientes()) {
            if(cli.isEstado()){
                jCBox1.addItem(cli);
            }
        }
    }
    
    private void cargarComboProductos() {
        ProductoData pd = new ProductoData();
        jCBox2.addItem(null);
        for (Producto prod : pd.listarProductosActivos()) {
            jCBox2.addItem(prod);
        }
    }
    
    private void limpiarTabla(JTable jTabla, DefaultTableModel modeloTabla) {
        int f = jTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }
    
    private void desactivarElementos(){
        jCBox2.setEnabled(false);
        jDFecha.setEnabled(false);
        jBRegistar.setEnabled(false);
        jBQuitar.setEnabled(false);
    }
    
    private void vaciarLista(){
        this.productos.clear();
    } 
}
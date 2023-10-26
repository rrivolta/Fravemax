
package vista;
import accesoADatos.ClienteData;
import accesoADatos.ProductoData;
import entidades.Cliente;
import entidades.Producto;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ClientesXProducto extends javax.swing.JPanel {
    private boolean comboCargado = false;
    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };

    public ClientesXProducto() {
        initComponents();
        armarCabecera();
        limpiarTabla(jTable, modeloTabla);
    }
	

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jCProducto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(157, 196, 162));
        setPreferredSize(new java.awt.Dimension(733, 564));

        jLabel2.setFont(new java.awt.Font("Rakoon Personal Use", 0, 36)); // NOI18N
        jLabel2.setText("Mostrar Cliente por Productos");

        Salir.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_24.png"))); // NOI18N
        Salir.setText("Sallir");
        Salir.setContentAreaFilled(false);
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_24.png"))); // NOI18N
        Salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir_32.png"))); // NOI18N
        Salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jTable.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Cliente", "Apellido", "Nombre", "Dirección", "Teléfono", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jCProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCProductoMouseClicked(evt);
            }
        });
        jCProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProductoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel3.setText("Seleccione un producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(Salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jCProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Salir)
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
      this.setVisible(false);
   }//GEN-LAST:event_SalirActionPerformed

   private void jCProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProductoActionPerformed
      limpiarTabla(jTable, modeloTabla);
      if (jCProducto.getSelectedIndex() == -1) {
           JOptionPane.showMessageDialog(this, "Seleccione un producto");
           return;
      }
      Producto prod = (Producto) jCProducto.getSelectedItem();

      ClienteData cd = new ClienteData();
      List<Cliente> listaClientes = cd.clientesXProducto(prod.getIdProducto());
      Set<Cliente> lista2 = new HashSet<Cliente>(listaClientes);
      for(Cliente cli: lista2){
         modeloTabla.addRow(new Object[]{cli.getIdCliente(), cli.getApellido(), cli.getNombre(),
            cli.getDomicilio(), cli.getTelefono(), cli.isEstado()});
      }
   }//GEN-LAST:event_jCProductoActionPerformed

    private void jCProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCProductoMouseClicked
        if (!comboCargado) {
           cargarCombo();
           this.comboCargado = true;
       }
    }//GEN-LAST:event_jCProductoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JComboBox<Producto> jCProducto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        modeloTabla.addColumn("Id Cliente");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Dirección");
        modeloTabla.addColumn("Teléfono");
        modeloTabla.addColumn("Estado");
        jTable.setModel(modeloTabla);
    }

    private void cargarCombo() {
        jCProducto.addItem(null);
        ProductoData pd = new ProductoData();
        for (Producto prod : pd.listarProductos()) {
            jCProducto.addItem(prod);
        }
    }

    private void limpiarTabla(JTable jTable, DefaultTableModel modeloTabla) {
        int f = jTable.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }

	private void dispose() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
}

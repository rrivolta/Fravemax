
package menu;

/**
 *
 * @author Administrador
 */
public class DefaultForm extends javax.swing.JPanel {

	public DefaultForm(String name) {
		initComponents();
		jLabel1.setText(name);
	}

	
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();

      setBackground(new java.awt.Color(153, 0, 0));

      jLabel1.setBackground(new java.awt.Color(255, 0, 255));
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("HOLAAAAA");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
      );
   }// </editor-fold>//GEN-END:initComponents


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel jLabel1;
   // End of variables declaration//GEN-END:variables
}

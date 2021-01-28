
package javaswing;

import java.awt.Color;


public class Compras extends javax.swing.JFrame {

  
    public Compras() {
        initComponents();
        setResizable(false); // impede a mudanca de tamanho
        setLocationRelativeTo(null); //posiciona no centro do ecra
        this.getContentPane().setBackground(Color.BLACK);
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel2 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jToggleButton1 = new javax.swing.JToggleButton();
    jToggleButton2 = new javax.swing.JToggleButton();
    jToggleButton3 = new javax.swing.JToggleButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Escolha uma opção para continuar:");

    jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 255, 255));
    jLabel1.setText("Compras");

    jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
    jToggleButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
    jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
    jToggleButton1.setText("Registar nova compra");
    jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jToggleButton1ActionPerformed(evt);
      }
    });

    jToggleButton2.setBackground(new java.awt.Color(0, 0, 0));
    jToggleButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
    jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
    jToggleButton2.setText("Mostrar histórico de compra");
    jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jToggleButton2ActionPerformed(evt);
      }
    });

    jToggleButton3.setBackground(new java.awt.Color(0, 0, 0));
    jToggleButton3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
    jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
    jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-voltar.jpg"))); // NOI18N
    jToggleButton3.setText("Voltar ");
    jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jToggleButton3ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2)
              .addComponent(jToggleButton1))
            .addGap(76, 76, 76))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGap(139, 139, 139))))
      .addGroup(layout.createSequentialGroup()
        .addGap(73, 73, 73)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jToggleButton3)
          .addComponent(jToggleButton2))
        .addContainerGap(55, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(35, 35, 35)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(jLabel2)
        .addGap(18, 18, 18)
        .addComponent(jToggleButton1)
        .addGap(18, 18, 18)
        .addComponent(jToggleButton2)
        .addGap(29, 29, 29)
        .addComponent(jToggleButton3)
        .addContainerGap(33, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.dispose();
        RegistoCompras novacompra = new RegistoCompras();
        novacompra.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
       this.dispose();
       HistoricoCompras historico = new HistoricoCompras();
       historico.setVisible(true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
      this.dispose();
      MenuPrincipal home = new MenuPrincipal();
       home.setVisible(true);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JToggleButton jToggleButton1;
  private javax.swing.JToggleButton jToggleButton2;
  private javax.swing.JToggleButton jToggleButton3;
  // End of variables declaration//GEN-END:variables
}


package javaswing;

import java.awt.Color;
import javax.swing.JOptionPane;


public class Registo extends javax.swing.JFrame {

    
    public Registo() {
      initComponents();
      setLocationRelativeTo(null);
      this.getContentPane().setBackground(Color.BLACK);
    }

   
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txt_utilizador = new javax.swing.JTextField();
    bt_menu_principal = new javax.swing.JButton();
    bt_registar = new javax.swing.JButton();
    txt_password = new javax.swing.JPasswordField();
    check_password = new javax.swing.JCheckBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 255, 255));
    jLabel1.setText("Registar Utilizador:");

    jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Utilizador:");

    jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Password:");

    txt_utilizador.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_utilizadorActionPerformed(evt);
      }
    });

    bt_menu_principal.setBackground(new java.awt.Color(0, 0, 0));
    bt_menu_principal.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
    bt_menu_principal.setForeground(new java.awt.Color(255, 255, 255));
    bt_menu_principal.setText("Menu Principal");
    bt_menu_principal.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bt_menu_principalActionPerformed(evt);
      }
    });

    bt_registar.setBackground(new java.awt.Color(0, 0, 0));
    bt_registar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
    bt_registar.setForeground(new java.awt.Color(255, 255, 255));
    bt_registar.setText("Registar");
    bt_registar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bt_registarActionPerformed(evt);
      }
    });

    txt_password.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_passwordActionPerformed(evt);
      }
    });

    check_password.setBackground(new java.awt.Color(0, 0, 0));
    check_password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    check_password.setForeground(new java.awt.Color(255, 255, 255));
    check_password.setText("Mostrar palavra-passe");
    check_password.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        check_passwordActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(124, 124, 124)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(bt_menu_principal)
            .addGap(132, 132, 132)
            .addComponent(bt_registar)
            .addContainerGap(132, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel2)
                  .addComponent(jLabel3))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(check_password)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_utilizador, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(txt_password)))))
            .addGap(0, 0, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(49, 49, 49)
        .addComponent(jLabel1)
        .addGap(64, 64, 64)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txt_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addGap(65, 65, 65)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(check_password)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(bt_menu_principal)
          .addComponent(bt_registar))
        .addGap(49, 49, 49))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void bt_menu_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menu_principalActionPerformed
        this.dispose();
        MenuInicial voltarMenuPrincipal = new MenuInicial();
        voltarMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_bt_menu_principalActionPerformed

    private void bt_registarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registarActionPerformed
      if (txt_utilizador.getText().length() > 0 && txt_password.getText().length() > 0) {
        LoginUtilizador registaUtilizador = new LoginUtilizador();

        registaUtilizador.nome = txt_utilizador.getText();
        registaUtilizador.pwd = txt_password.getText();

        if (registaUtilizador.isUtilizadorRegistado()) // verifica se o utilizador já é registado na bd
        {
          JOptionPane.showMessageDialog(null, "Utilizador já registado!");
        }
        else{
          registaUtilizador.registarUtilizador();
          this.dispose();
          
        }

      }else{
        JOptionPane.showMessageDialog(null, "Deve informar um utilizador e password");
      }
    }//GEN-LAST:event_bt_registarActionPerformed

    private void txt_utilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_utilizadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_utilizadorActionPerformed

  private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txt_passwordActionPerformed

  private void check_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_passwordActionPerformed
    if(this.check_password.isSelected()){
      this.txt_password.setEchoChar((char)0);
    }else{
      this.txt_password.setEchoChar('*');
    }
  }//GEN-LAST:event_check_passwordActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registo().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton bt_menu_principal;
  private javax.swing.JButton bt_registar;
  private javax.swing.JCheckBox check_password;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPasswordField txt_password;
  private javax.swing.JTextField txt_utilizador;
  // End of variables declaration//GEN-END:variables
}

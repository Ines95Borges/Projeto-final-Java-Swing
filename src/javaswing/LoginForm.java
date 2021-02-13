
package javaswing;

import java.awt.Color;
import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame {

    
    public LoginForm() {
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
    bt_entrar = new javax.swing.JButton();
    txt_password = new javax.swing.JPasswordField();
    check_password = new javax.swing.JCheckBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 255, 255));
    jLabel1.setText("Login do utilizador:");

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Utilizador:");

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

    bt_entrar.setBackground(new java.awt.Color(0, 0, 0));
    bt_entrar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
    bt_entrar.setForeground(new java.awt.Color(255, 255, 255));
    bt_entrar.setText("Entrar");
    bt_entrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bt_entrarActionPerformed(evt);
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
        .addGap(137, 137, 137)
        .addComponent(jLabel1)
        .addContainerGap(148, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(102, 102, 102)
            .addComponent(bt_menu_principal))
          .addGroup(layout.createSequentialGroup()
            .addGap(179, 179, 179)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2)
              .addComponent(jLabel3))
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(txt_utilizador, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
              .addComponent(check_password)
              .addComponent(txt_password))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(bt_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(114, 114, 114))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(45, 45, 45)
        .addComponent(jLabel1)
        .addGap(69, 69, 69)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txt_utilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addGap(60, 60, 60)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel3)
          .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(check_password)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(bt_menu_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bt_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(47, 47, 47))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents


    private void txt_utilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_utilizadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_utilizadorActionPerformed

    private void bt_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_entrarActionPerformed
      // Código do botão Entrar - Login: 
      String utilizador = txt_utilizador.getText(); // lê a informação dada para user
      String password = txt_password.getText(); //lÊ a informação dada para pwd

      LoginUtilizador fazLogin = new LoginUtilizador();
      fazLogin.nome = utilizador;
      fazLogin.pwd = password;

      if(fazLogin.fazerLogin()){
          
          this.dispose();
        
        MenuPrincipal x = new MenuPrincipal(); // Classe criada pelo Hugo
        x.setVisible(true);
        
      }
      else{
        JOptionPane.showMessageDialog(null, "Utilizador ou password inválidos");
      }
    }//GEN-LAST:event_bt_entrarActionPerformed

    private void bt_menu_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menu_principalActionPerformed
        this.dispose();
        MenuInicial voltarMenuPrincipal = new MenuInicial();
        voltarMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_bt_menu_principalActionPerformed

  private void check_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_passwordActionPerformed
    if(this.check_password.isSelected()){
      this.txt_password.setEchoChar((char)0);
    }else{
      this.txt_password.setEchoChar('*');
    }
  }//GEN-LAST:event_check_passwordActionPerformed

    
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
 

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton bt_entrar;
  private javax.swing.JButton bt_menu_principal;
  private javax.swing.JCheckBox check_password;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPasswordField txt_password;
  private javax.swing.JTextField txt_utilizador;
  // End of variables declaration//GEN-END:variables

}

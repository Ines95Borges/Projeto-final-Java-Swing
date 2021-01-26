package javaswing;

import java.awt.Color;

public class MenuInicial extends javax.swing.JFrame {
  
  public MenuInicial() {
    initComponents();
    setLocationRelativeTo(null);
    this.getContentPane().setBackground(Color.BLACK);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    btn_login = new javax.swing.JButton();
    btn_registar = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    lbl_icon = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(0, 0, 0));
    setForeground(new java.awt.Color(0, 0, 0));

    jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 255, 255));
    jLabel1.setText("Menu Inicial");

    btn_login.setBackground(new java.awt.Color(0, 0, 0));
    btn_login.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
    btn_login.setForeground(new java.awt.Color(255, 255, 255));
    btn_login.setText("Login");
    btn_login.setPreferredSize(new java.awt.Dimension(60, 25));
    btn_login.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_loginActionPerformed(evt);
      }
    });

    btn_registar.setBackground(new java.awt.Color(0, 0, 0));
    btn_registar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
    btn_registar.setForeground(new java.awt.Color(255, 255, 255));
    btn_registar.setText("Registar");
    btn_registar.setPreferredSize(new java.awt.Dimension(60, 25));
    btn_registar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_registarActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Bem-vindo(a) ao seu programa para registo de compras e vendas. ");

    jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Para começar faça seu registo ou login.");

    lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-menuInicial.png"))); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(209, 209, 209)
            .addComponent(jLabel3))
          .addGroup(layout.createSequentialGroup()
            .addGap(105, 105, 105)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jLabel2)))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
              .addContainerGap()
              .addComponent(lbl_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
              .addGap(206, 206, 206)
              .addComponent(jLabel1))))
        .addContainerGap(142, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(lbl_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(jLabel2)
        .addGap(18, 18, 18)
        .addComponent(jLabel3)
        .addGap(48, 48, 48)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btn_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
    LoginForm login = new LoginForm();
    login.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_btn_loginActionPerformed

  private void btn_registarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registarActionPerformed
    Registo registoUser = new Registo();
    registoUser.setVisible(true);
    this.dispose();
  }//GEN-LAST:event_btn_registarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_login;
  private javax.swing.JButton btn_registar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel lbl_icon;
  // End of variables declaration//GEN-END:variables

}

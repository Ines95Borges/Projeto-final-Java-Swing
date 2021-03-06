package javaswing;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegistoFornecedores extends javax.swing.JFrame {
  

  public RegistoFornecedores() {
    initComponents();
    setLocationRelativeTo(null);
    this.getContentPane().setBackground(Color.BLACK);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txt_nome = new javax.swing.JTextField();
    btn_voltar = new javax.swing.JButton();
    btn_registar = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    txt_nif = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 255, 255));
    jLabel1.setText("Registar Novo Fornecedor");

    jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Nome:");

    btn_voltar.setBackground(new java.awt.Color(0, 0, 0));
    btn_voltar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
    btn_voltar.setForeground(new java.awt.Color(255, 255, 255));
    btn_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-voltar.jpg"))); // NOI18N
    btn_voltar.setText("Voltar");
    btn_voltar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_voltarActionPerformed(evt);
      }
    });

    btn_registar.setBackground(new java.awt.Color(0, 0, 0));
    btn_registar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
    btn_registar.setForeground(new java.awt.Color(255, 255, 255));
    btn_registar.setText("Registar");
    btn_registar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_registarActionPerformed(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("NIF:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel2)
          .addComponent(jLabel3))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
            .addComponent(btn_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(txt_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addComponent(txt_nif)))
        .addContainerGap(51, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(51, 51, 51))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(32, 32, 32)
        .addComponent(jLabel1)
        .addGap(39, 39, 39)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(41, 41, 41)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txt_nif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(47, 47, 47)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btn_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 59, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_registarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registarActionPerformed
    String nome = txt_nome.getText();
    
    int nif = Integer.parseInt(txt_nif.getText());
    
    Conexao conn = new Conexao();
    conn.abreConexao();
    try {
      PreparedStatement ps = conn.conn.prepareStatement("INSERT INTO fornecedores(Fornecedor_ID, Nome, NIF) VALUES (NULL, ?, ?)");
      ps.setString(1, nome);
      ps.setInt(2, nif);
      ps.executeUpdate();
    } catch (SQLException ex) {
      Logger.getLogger(RegistoFornecedores.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    this.dispose();
    MenuPrincipal homepage = new MenuPrincipal();
    homepage.setVisible(true);
    // TODO: implementar verificações
    JOptionPane.showMessageDialog(null, "Registado com sucesso.");
  }//GEN-LAST:event_btn_registarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
      this.dispose();
      MenuPrincipal homepage = new MenuPrincipal();
      homepage.setVisible(true);
    }//GEN-LAST:event_btn_voltarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_registar;
  private javax.swing.JButton btn_voltar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JTextField txt_nif;
  private javax.swing.JTextField txt_nome;
  // End of variables declaration//GEN-END:variables
}

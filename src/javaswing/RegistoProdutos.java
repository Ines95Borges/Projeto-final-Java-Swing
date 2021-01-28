package javaswing;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistoProdutos extends javax.swing.JFrame {
  

  public RegistoProdutos() {
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
    txt_pCompra = new javax.swing.JTextField();
    txt_pVenda = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 255, 255));
    jLabel1.setText("Registar Novo Produto");

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
    jLabel3.setText("Preço de Venda:");

    txt_pCompra.setText("0.00");

    txt_pVenda.setText("0.00");
    txt_pVenda.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_pVendaActionPerformed(evt);
      }
    });

    jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Preço de Compra:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel1)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(layout.createSequentialGroup()
              .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btn_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2)
                .addComponent(jLabel3))
              .addGap(25, 25, 25)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txt_pVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addComponent(txt_nome)))
            .addGroup(layout.createSequentialGroup()
              .addComponent(jLabel4)
              .addGap(18, 18, 18)
              .addComponent(txt_pCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(48, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(37, 37, 37)
        .addComponent(jLabel1)
        .addGap(34, 34, 34)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(44, 44, 44)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txt_pVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(41, 41, 41)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txt_pCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4))
        .addGap(43, 43, 43)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btn_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(36, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_registarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registarActionPerformed
    String nome = txt_nome.getText();
    
    float pVenda = Float.parseFloat(txt_pVenda.getText());
    float pCompra = Float.parseFloat(txt_pCompra.getText());
    
    Conexao conn = new Conexao();
    conn.abreConexao();
    try {
      PreparedStatement ps = conn.conn.prepareStatement("INSERT INTO produtos(Produto_ID, nome, precoVenda, quantidade, precoCompra) VALUES (NULL, ?, ?, 0, ?)");
      ps.setString(1, nome);
      ps.setFloat(2, pVenda);
      ps.setFloat(3, pCompra);
      ps.executeUpdate();
    } catch (SQLException ex) {
      Logger.getLogger(RegistoProdutos.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    this.dispose();
    Stock stock = new Stock();
    stock.run();
  }//GEN-LAST:event_btn_registarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
      this.dispose();
      MenuPrincipal homepage = new MenuPrincipal();
      homepage.setVisible(true);
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void txt_pVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pVendaActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_registar;
  private javax.swing.JButton btn_voltar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JTextField txt_nome;
  private javax.swing.JTextField txt_pCompra;
  private javax.swing.JTextField txt_pVenda;
  // End of variables declaration//GEN-END:variables
}

package javaswing;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegistoVendas extends javax.swing.JFrame {
  
  Vendas vendas = new Vendas();

  public RegistoVendas() {
    initComponents();
    vendas.carregaProdutos(tbl_produtos);
    vendas.carregaClientes(tbl_clientes);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_produtos = new javax.swing.JTable();
    jScrollPane2 = new javax.swing.JScrollPane();
    tbl_clientes = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    txt_quantidade = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    btn_registar = new javax.swing.JButton();
    btn_historico = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
    jLabel1.setText("Registar uma venda");

    tbl_produtos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Produto ID", "Nome", "Preço", "Quantidade"
      }
    ));
    jScrollPane1.setViewportView(tbl_produtos);

    tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Cliente ID", "Nome"
      }
    ));
    jScrollPane2.setViewportView(tbl_clientes);

    jLabel2.setText("Quantidade:");

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-voltar.jpg"))); // NOI18N
    jButton1.setText("Voltar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    btn_registar.setText("Registar Venda");
    btn_registar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_registarActionPerformed(evt);
      }
    });

    btn_historico.setText("Ver histórico de vendas");
    btn_historico.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_historicoActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_registar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGap(110, 110, 110))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(btn_historico)
            .addGap(158, 158, 158))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addComponent(jLabel1)
        .addGap(40, 40, 40)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(39, 39, 39)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton1)
          .addComponent(btn_registar))
        .addGap(18, 18, 18)
        .addComponent(btn_historico)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_registarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registarActionPerformed
    String quantidade = txt_quantidade.getText();
    int quantidade_inteiro = Integer.parseInt(quantidade);
    
    int produtosSelectedRow = tbl_produtos.getSelectedRow();
    int idProdutos = (int) tbl_produtos.getValueAt(produtosSelectedRow, 0);
    
    int clientesSelectedRow = tbl_clientes.getSelectedRow();
    int idClientes = (int) tbl_clientes.getValueAt(clientesSelectedRow, 0);
    
    Conexao conn = new Conexao();
    conn.abreConexao();
    try {
      PreparedStatement ps = conn.conn.prepareStatement("INSERT INTO vendeprodutos(Cliente_ID, Produto_ID, Quantidade) VALUES (?, ?, ?)");
      ps.setInt(1, idClientes);
      ps.setInt(2, idProdutos);
      ps.setInt(3, quantidade_inteiro);
      ps.executeUpdate();
      JOptionPane.showMessageDialog(null, "Registo feito com sucesso.");
      this.dispose();
      RegistoVendas registo = new RegistoVendas();
      registo.setVisible(true);
    } catch (SQLException ex) {
      Logger.getLogger(RegistoVendas.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_btn_registarActionPerformed

  private void btn_historicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historicoActionPerformed
      this.dispose();
      HistoricoVendas historicoVendas = new HistoricoVendas();
      historicoVendas.setVisible(true);
  }//GEN-LAST:event_btn_historicoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
      MenuPrincipal homepage = new MenuPrincipal();
      homepage.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_historico;
  private javax.swing.JButton btn_registar;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable tbl_clientes;
  private javax.swing.JTable tbl_produtos;
  private javax.swing.JTextField txt_quantidade;
  // End of variables declaration//GEN-END:variables
}

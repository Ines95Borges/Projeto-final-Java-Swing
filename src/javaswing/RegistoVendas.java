package javaswing;

import java.awt.Color;
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
    vendas.carregaClientes(tbl_utilizador);
    setLocationRelativeTo(null);
    this.getContentPane().setBackground(Color.BLACK);
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_produtos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_utilizador = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_quantidade = new javax.swing.JTextField();
        btn_voltar = new javax.swing.JButton();
        btn_registar = new javax.swing.JButton();
        btn_historico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Registar venda");

        tbl_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto ID", "Nome", "Preço", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(tbl_produtos);

        tbl_utilizador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente ID", "Nome"
            }
        ));
        jScrollPane2.setViewportView(tbl_utilizador);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantidade:");

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
        btn_registar.setText("Registar Venda");
        btn_registar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registarActionPerformed(evt);
            }
        });

        btn_historico.setBackground(new java.awt.Color(0, 0, 0));
        btn_historico.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_historico.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(btn_registar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_historico)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registar, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_historico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btn_registarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registarActionPerformed
    String quantidade = txt_quantidade.getText();
    int quantidade_inteiro = Integer.parseInt(quantidade);
    
    int produtosSelectedRow = tbl_produtos.getSelectedRow();
    int idProdutos = (int) tbl_produtos.getValueAt(produtosSelectedRow, 0);
    
    int clientesSelectedRow = tbl_utilizador.getSelectedRow();
    int idClientes = (int) tbl_utilizador.getValueAt(clientesSelectedRow, 0);
    
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

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
      this.dispose();
      MenuPrincipal homepage = new MenuPrincipal();
      homepage.setVisible(true);
    }//GEN-LAST:event_btn_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_historico;
    private javax.swing.JButton btn_registar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_produtos;
    private javax.swing.JTable tbl_utilizador;
    private javax.swing.JTextField txt_quantidade;
    // End of variables declaration//GEN-END:variables
}

package javaswing;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Stock extends javax.swing.JFrame {

    public Stock() {
        initComponents();
        setLocationRelativeTo(null);
    this.getContentPane().setBackground(Color.BLACK);
    }

    

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_produtos = new javax.swing.JTable();
    btn_voltar = new javax.swing.JButton();
    btn_RegProd = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 255, 255));
    jLabel1.setText("Stock");

    tbl_produtos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "ID Produto", "Nome", "Preço de venda", "Quantidade Disponivel"
      }
    ));
    jScrollPane1.setViewportView(tbl_produtos);

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

    btn_RegProd.setBackground(new java.awt.Color(0, 0, 0));
    btn_RegProd.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
    btn_RegProd.setForeground(new java.awt.Color(255, 255, 255));
    btn_RegProd.setText("Registar Novo Produto");
    btn_RegProd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_RegProdActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addComponent(btn_voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_RegProd, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addGap(261, 261, 261)
            .addComponent(jLabel1)))
        .addContainerGap(23, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn_voltar)
          .addComponent(btn_RegProd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(19, 19, 19))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
      this.dispose();
      MenuPrincipal homepage = new MenuPrincipal();
      homepage.setVisible(true);
  }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_RegProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegProdActionPerformed
        this.dispose();
        RegistoProdutos regProd = new RegistoProdutos();
        regProd.setVisible(true);
    }//GEN-LAST:event_btn_RegProdActionPerformed

    public void run() {
        this.setVisible(true);
        this.carregaProdutos(tbl_produtos);
    }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_RegProd;
  private javax.swing.JButton btn_voltar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tbl_produtos;
  // End of variables declaration//GEN-END:variables

    private void carregaProdutos(JTable tbl_produtos) {
        DefaultTableModel modeloProdutos = (DefaultTableModel) tbl_produtos.getModel();
        modeloProdutos.setNumRows(0);

        tbl_produtos.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbl_produtos.getColumnModel().getColumn(1).setPreferredWidth(40);
        tbl_produtos.getColumnModel().getColumn(2).setPreferredWidth(20);
        tbl_produtos.getColumnModel().getColumn(3).setPreferredWidth(20);

        try {
            Conexao conn = new Conexao();
            conn.abreConexao();
            PreparedStatement pstm;
            ResultSet rs;

            pstm = conn.conn.prepareStatement("SELECT * FROM produtos;");
            rs = pstm.executeQuery();

            while (rs.next()) {
                modeloProdutos.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getFloat(3),
                    rs.getInt(4)
                });
            }
            conn.conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de conexão" + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}

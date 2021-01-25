package javaswing;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Stock extends javax.swing.JFrame {

    public Stock() {
        initComponents();
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

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel1.setText("Stock");

        tbl_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produto", "Nome", "Preço de venda", "Quantidade Disponivel"
            }
        ));
        jScrollPane1.setViewportView(tbl_produtos);

        btn_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-voltar.jpg"))); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

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
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_RegProd, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_voltar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_RegProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
      this.dispose();
      Homepage homepage = new Homepage();
      homepage.setVisible(true);
  }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_RegProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegProdActionPerformed
        this.dispose();
        Homepage homepage = new Homepage();
        homepage.setVisible(true);
    }//GEN-LAST:event_btn_RegProdActionPerformed

    public void run() {
        this.setVisible(true);
        this.carregaProdutos(tbl_produtos);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_RegProd;
    private javax.swing.JButton btn_historico;
    private javax.swing.JButton btn_historico1;
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

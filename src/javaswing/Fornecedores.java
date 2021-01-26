package javaswing;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Fornecedores extends javax.swing.JFrame {

    public Fornecedores() {
        initComponents();
    }

    

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_fornecedores = new javax.swing.JTable();
    jButton1 = new javax.swing.JButton();
    btn_reg_forn = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
    jLabel1.setText("Fornecedores");

    tbl_fornecedores.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "ID", "Nome", "NIF"
      }
    ));
    jScrollPane1.setViewportView(tbl_fornecedores);

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-voltar.jpg"))); // NOI18N
    jButton1.setText("Voltar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    btn_reg_forn.setText("Registar novo fornecedor");
    btn_reg_forn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_reg_fornActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btn_reg_forn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(101, 101, 101)
        .addComponent(jButton1)
        .addGap(96, 96, 96))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(221, 221, 221)
            .addComponent(jLabel1)))
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
          .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btn_reg_forn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
      MenuPrincipal homepage = new MenuPrincipal();
      homepage.setVisible(true);
  }//GEN-LAST:event_jButton1ActionPerformed

  private void btn_reg_fornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reg_fornActionPerformed
    this.dispose();
    RegistoFornecedores registoFornecedores = new RegistoFornecedores();
    registoFornecedores.setVisible(true);
  }//GEN-LAST:event_btn_reg_fornActionPerformed

    public void run() {
        this.setVisible(true);
        this.carregaProdutos(tbl_fornecedores);
    }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_reg_forn;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tbl_fornecedores;
  // End of variables declaration//GEN-END:variables

    private void carregaProdutos(JTable tbl_produtos) {
        DefaultTableModel modeloProdutos = (DefaultTableModel) tbl_produtos.getModel();
        modeloProdutos.setNumRows(0);

        tbl_produtos.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbl_produtos.getColumnModel().getColumn(1).setPreferredWidth(40);
        tbl_produtos.getColumnModel().getColumn(2).setPreferredWidth(20);

        try {
            Conexao conn = new Conexao();
            conn.abreConexao();
            PreparedStatement pstm;
            ResultSet rs;

            pstm = conn.conn.prepareStatement("SELECT * FROM fornecedores;");
            rs = pstm.executeQuery();

            while (rs.next()) {
                modeloProdutos.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3)
                });
            }
            conn.conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de conexão" + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}

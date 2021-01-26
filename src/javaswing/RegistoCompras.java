package javaswing;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistoCompras extends javax.swing.JFrame {

  public RegistoCompras() {
    initComponents();
    setResizable(false); // impede a mudanca de tamanho
    setLocationRelativeTo(null); //posiciona no centro do ecra
    this.getContentPane().setBackground(Color.BLACK);

    DefaultTableModel model;

    int prod;
    String nome;
    float preco;
    int qtde;

    Conexao objCon = new Conexao();
    objCon.abreConexao();

    try {
      PreparedStatement ps = objCon.conn.prepareStatement("Select Produto_ID, nome, precoCompra, quantidade from produtos");
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        prod = rs.getInt("Produto_ID");
        nome = rs.getString("nome");
        preco = rs.getFloat("precoCompra");
        qtde = rs.getInt("quantidade");
        model = (DefaultTableModel) tableProd.getModel();
        model.insertRow(model.getRowCount(), new Object[]{prod, nome, preco, qtde});
      }
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      PreparedStatement ps = objCon.conn.prepareStatement("Select Fornecedor_ID, nome from fornecedores");
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        int idForn = rs.getInt("Fornecedor_ID");
        String nomeForn = rs.getString("nome");
        model = (DefaultTableModel) tableFornecedor.getModel();
        model.insertRow(model.getRowCount(), new Object[]{idForn, nomeForn});
      }

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tableFornecedor = new javax.swing.JTable();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tableProd = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    jtxt_qtde = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Vamos registar uma nova compra:");

    jButton1.setText("Confirmar registo");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setText("Voltar");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    tableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Fornecedor_ID", "Nome"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(tableFornecedor);

    jLabel7.setText("1. Selecione um produto da tabela:");

    jLabel8.setText("*Quantidade = stock atual");

    tableProd.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Produto_ID", "Nome", "Preço de compra", "Quantidade"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane2.setViewportView(tableProd);

    jLabel2.setText("2. Selecione um fornecedor da tabela:");

    jLabel3.setText("3. Informe a quantidade desejada:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(168, 168, 168)
            .addComponent(jLabel1))
          .addGroup(layout.createSequentialGroup()
            .addGap(54, 54, 54)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel7)
              .addComponent(jLabel8)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel2)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxt_qtde, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(132, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(jButton1)
        .addGap(18, 18, 18)
        .addComponent(jButton2)
        .addGap(38, 38, 38))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(53, 53, 53)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(133, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(42, 42, 42)
        .addComponent(jLabel7)
        .addGap(101, 101, 101)
        .addComponent(jLabel8)
        .addGap(50, 50, 50)
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(35, 35, 35)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jtxt_qtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton2)
          .addComponent(jButton1))
        .addGap(23, 23, 23))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(86, 86, 86)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(324, Short.MAX_VALUE)))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      DefaultTableModel model;
      DefaultTableModel modelFornec;

      model = (DefaultTableModel) tableProd.getModel();
      modelFornec = (DefaultTableModel) tableFornecedor.getModel();

      int linhaSel = tableProd.getSelectedRow();
      String idProd = tableProd.getValueAt(linhaSel, 0).toString();
      String nomeProd = tableProd.getValueAt(linhaSel, 1).toString();

      int linhaSelForn = tableFornecedor.getSelectedRow();
      String idForn = tableFornecedor.getValueAt(linhaSelForn, 0).toString();
      String nomeForn = tableFornecedor.getValueAt(linhaSelForn, 1).toString();

      int qtde = Integer.parseInt(jtxt_qtde.getText());

      Conexao objCon = new Conexao();
      objCon.abreConexao();

      try {
        PreparedStatement ps = objCon.conn.prepareStatement("Insert into compraprodutos (Produto_ID, Fornecedor_ID, Quantidade) values (?,?,?)");
        ps.setString(1, idProd);
        ps.setString(2, idForn);
        ps.setInt(3, qtde);

        int verifica = ps.executeUpdate();
        if (verifica > 0) {

          JOptionPane.showMessageDialog(null, "Registado com sucesso");
          jtxt_qtde.setText(null);
          this.dispose();
          RegistoCompras registo = new RegistoCompras();
          registo.setVisible(true);
        } else {
          JOptionPane.showMessageDialog(null, "Sem sucesso");
        }

      } catch (Exception e) {
        System.out.println(e);
      }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.dispose();
      Compras menucompras = new Compras();
      menucompras.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
      java.util.logging.Logger.getLogger(RegistoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(RegistoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(RegistoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(RegistoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RegistoCompras().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTextField jtxt_qtde;
  private javax.swing.JTable tableFornecedor;
  private javax.swing.JTable tableProd;
  // End of variables declaration//GEN-END:variables
}

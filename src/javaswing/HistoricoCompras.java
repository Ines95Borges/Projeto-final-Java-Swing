
package javaswing;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class HistoricoCompras extends javax.swing.JFrame {


    public HistoricoCompras() {
        initComponents();
        setResizable(false); // impede a mudanca de tamanho
        setLocationRelativeTo(null); //posiciona no centro do ecra
        
        DefaultTableModel model;
        
        
        int prod;
        String nome;
        float preco;
        int qtde;
        
        Conexao objCon=new Conexao();
        objCon.abreConexao();

        try {
            PreparedStatement ps = objCon.conn.prepareStatement("Select Produto_ID, nome, precoCompra, quantidade from produtos");
            ResultSet rs = ps.executeQuery();
            
            
            while (rs.next()){
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
            
            
            while (rs.next()){
                int idForn = rs.getInt("Fornecedor_ID");
                String nomeForn = rs.getString("nome");
                model = (DefaultTableModel) tableFornecedor.getModel();
                model.insertRow(model.getRowCount(), new Object[]{idForn, nomeForn});
                
            }

        } catch (Exception e) {
            System.out.println(e);

        }
        
        try {
            PreparedStatement ps = objCon.conn.prepareStatement("Select * from compraprodutos");
            ResultSet rs = ps.executeQuery();
            
            
            while (rs.next()){
                int idCompra = rs.getInt(1);
                int idProdu = rs.getInt(2);
                int idForne = rs.getInt(3);
                int qtdade = rs.getInt(4);
                model = (DefaultTableModel) tablehistorico.getModel();
                model.insertRow(model.getRowCount(), new Object[]{idCompra, idProdu, idForne, qtdade});
                
            }

        } catch (Exception e) {
            System.out.println(e);

        }
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jTextField1 = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tableProd = new javax.swing.JTable();
    jScrollPane1 = new javax.swing.JScrollPane();
    tableFornecedor = new javax.swing.JTable();
    jButton4 = new javax.swing.JButton();
    jScrollPane3 = new javax.swing.JScrollPane();
    tablehistorico = new javax.swing.JTable();
    jLabel4 = new javax.swing.JLabel();

    jButton1.setText("jButton1");

    jButton2.setText("jButton2");

    jButton3.setText("jButton3");

    jTextField1.setText("jTextField1");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Histórico de compras:");

    jLabel3.setText("Aqui encontras o nome do fornecedor:");

    jLabel2.setText("Aqui encontras o nome do produto:");

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

    jButton4.setText("Voltar");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    tablehistorico.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "ID Compras", "ID Produtos", "ID Fornecedorl", "Quantidade"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, true, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane3.setViewportView(tablehistorico);

    jLabel4.setText("Nessa tabela, tens os ID e pode correlacionar com as tabelas fornecedor e produto:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1))
              .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4))
              .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3)
                .addComponent(jLabel2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(20, 20, 20))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(jLabel1))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(37, 37, 37)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(48, 48, 48)))
        .addComponent(jButton4)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
      Compras menucompras = new Compras();
        menucompras.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HistoricoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoricoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoricoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoricoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoricoCompras().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JTable tableFornecedor;
  private javax.swing.JTable tableProd;
  private javax.swing.JTable tablehistorico;
  // End of variables declaration//GEN-END:variables
}

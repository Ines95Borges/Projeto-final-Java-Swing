
package javaswing;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class HistoricoCompras extends javax.swing.JFrame {


    public HistoricoCompras() {
        initComponents();
        setResizable(false); // impede a mudanca de tamanho
        setLocationRelativeTo(null); //posiciona no centro do ecra
        this.getContentPane().setBackground(Color.BLACK);
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProd = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFornecedor = new javax.swing.JTable();
        btn_voltar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablehistorico = new javax.swing.JTable();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Histórico de compras:");

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

        btn_voltar.setBackground(new java.awt.Color(0, 0, 0));
        btn_voltar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_voltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_voltar)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
      this.dispose();
      Compras menucompras = new Compras();
      menucompras.setVisible(true);
    }//GEN-LAST:event_btn_voltarActionPerformed

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
    private javax.swing.JButton btn_voltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableFornecedor;
    private javax.swing.JTable tableProd;
    private javax.swing.JTable tablehistorico;
    // End of variables declaration//GEN-END:variables
}

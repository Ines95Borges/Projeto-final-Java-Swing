
package javaswing;


public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    bt_vendas = new javax.swing.JButton();
    bt_stock = new javax.swing.JButton();
    bt_fornecedores = new javax.swing.JButton();
    bt_sair = new javax.swing.JButton();
    bt_compras = new javax.swing.JButton();
    bt_logout = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 0, 0));
    jLabel1.setText("Bem Vindo");

    bt_vendas.setText("Vendas");
    bt_vendas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bt_vendasActionPerformed(evt);
      }
    });

    bt_stock.setText("Stock");
    bt_stock.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bt_stockActionPerformed(evt);
      }
    });

    bt_fornecedores.setText("Fornecedores");
    bt_fornecedores.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bt_fornecedoresActionPerformed(evt);
      }
    });

    bt_sair.setText("Sair");
    bt_sair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bt_sairActionPerformed(evt);
      }
    });

    bt_compras.setText("Compras");
    bt_compras.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bt_comprasActionPerformed(evt);
      }
    });

    bt_logout.setText("Logout");
    bt_logout.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bt_logoutActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(238, 238, 238)
        .addComponent(jLabel1)
        .addContainerGap(249, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(49, 49, 49)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(bt_compras, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
          .addComponent(bt_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(bt_vendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(bt_fornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
          .addComponent(bt_sair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(bt_stock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(64, 64, 64))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(44, 44, 44)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(bt_fornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
          .addComponent(bt_vendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(bt_compras, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
          .addComponent(bt_stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bt_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(46, 46, 46))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void bt_vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_vendasActionPerformed
        this.dispose();
        RegistoVendas registoVendas = new RegistoVendas();
        registoVendas.setVisible(true);
    }//GEN-LAST:event_bt_vendasActionPerformed

    private void bt_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_stockActionPerformed
        this.dispose();
        Stock stock = new Stock();
        stock.run();
    }//GEN-LAST:event_bt_stockActionPerformed

    private void bt_fornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fornecedoresActionPerformed
        this.dispose();
        Fornecedores fornecedores = new Fornecedores();
        fornecedores.run();
    }//GEN-LAST:event_bt_fornecedoresActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_comprasActionPerformed
        this.dispose();
        Compras compras = new Compras();
        compras.setVisible(true);
    }//GEN-LAST:event_bt_comprasActionPerformed

    private void bt_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logoutActionPerformed
      this.dispose();
    }//GEN-LAST:event_bt_logoutActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton bt_compras;
  private javax.swing.JButton bt_fornecedores;
  private javax.swing.JButton bt_logout;
  private javax.swing.JButton bt_sair;
  private javax.swing.JButton bt_stock;
  private javax.swing.JButton bt_vendas;
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables
}

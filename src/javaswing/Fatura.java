package javaswing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barat
 */
public class Fatura extends javax.swing.JPanel {

  /**
   * Creates new form Fatura
   */
  public Fatura() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    jList1 = new javax.swing.JList<>();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane3 = new javax.swing.JScrollPane();
    table_cliente_fatura = new javax.swing.JTable();
    jScrollPane4 = new javax.swing.JScrollPane();
    jTable2 = new javax.swing.JTable();
    btn_fatura = new javax.swing.JButton();
    btn_voltar = new javax.swing.JButton();

    jList1.setModel(new javax.swing.AbstractListModel<String>() {
      String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
      public int getSize() { return strings.length; }
      public String getElementAt(int i) { return strings[i]; }
    });
    jScrollPane1.setViewportView(jList1);

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jScrollPane2.setViewportView(jTable1);

    jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 0, 255));
    jLabel1.setText("FATURA");
    jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

    table_cliente_fatura.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "ID Cliente", "Nome"
      }
    ));
    jScrollPane3.setViewportView(table_cliente_fatura);

    jTable2.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "ID Produto", "Nome", "Quantidade", "Preço"
      }
    ));
    jScrollPane4.setViewportView(jTable2);

    btn_fatura.setText("EMITIR FATURA");

    btn_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-voltar.jpg"))); // NOI18N
    btn_voltar.setText("VOLTAR");
    btn_voltar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_voltarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
          .addComponent(jScrollPane3))
        .addGap(22, 22, 22))
      .addGroup(layout.createSequentialGroup()
        .addGap(297, 297, 297)
        .addComponent(jLabel1)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(158, 158, 158)
        .addComponent(btn_voltar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
        .addComponent(btn_fatura)
        .addGap(142, 142, 142))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(29, 29, 29)
        .addComponent(jLabel1)
        .addGap(71, 71, 71)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(63, 63, 63)
        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn_voltar)
          .addComponent(btn_fatura))
        .addGap(60, 60, 60))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btn_voltarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_fatura;
  private javax.swing.JButton btn_voltar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JList<String> jList1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JTable jTable1;
  private javax.swing.JTable jTable2;
  private javax.swing.JTable table_cliente_fatura;
  // End of variables declaration//GEN-END:variables
}


package javaswing;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vendas {
  public void carregaProdutos(javax.swing.JTable tabela){
    DefaultTableModel modeloProdutos = (DefaultTableModel) tabela.getModel();
    modeloProdutos.setNumRows(0);
    
    tabela.getColumnModel().getColumn(0).setPreferredWidth(20);
    tabela.getColumnModel().getColumn(1).setPreferredWidth(40);
    tabela.getColumnModel().getColumn(2).setPreferredWidth(20);
    tabela.getColumnModel().getColumn(3).setPreferredWidth(20);
    
    try{
      Conexao conn = new Conexao();
      conn.abreConexao();
      PreparedStatement pstm;
      ResultSet rs;
      
      pstm = conn.conn.prepareStatement("SELECT * FROM produtos;");
      rs = pstm.executeQuery();
      
      while(rs.next()){
        modeloProdutos.addRow(new Object[]{
          rs.getInt(1),
          rs.getString(2),
          rs.getFloat(3),
          rs.getInt(4)
        });
      }
      conn.conn.close();
    }catch(Exception e){
      JOptionPane.showMessageDialog(null, "Erro de conexão"+e, "ERRO", JOptionPane.ERROR_MESSAGE);
    }
  }
  
  public void carregaClientes(javax.swing.JTable tabela){
    DefaultTableModel modeloProdutos = (DefaultTableModel) tabela.getModel();
    modeloProdutos.setNumRows(0);
    
    tabela.getColumnModel().getColumn(0).setPreferredWidth(20);
    tabela.getColumnModel().getColumn(1).setPreferredWidth(40);
    
    try{
      Conexao conn = new Conexao();
      conn.abreConexao();
      PreparedStatement pstm;
      ResultSet rs;
      
      pstm = conn.conn.prepareStatement("SELECT id, nome FROM clientes;");
      rs = pstm.executeQuery();
      
      while(rs.next()){
        modeloProdutos.addRow(new Object[]{
          rs.getInt(1),
          rs.getString(2),
        });
      }
      conn.conn.close();
    }catch(Exception e){
      JOptionPane.showMessageDialog(null, "Erro de conexão"+e, "ERRO", JOptionPane.ERROR_MESSAGE);
    }
  }
}

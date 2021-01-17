


import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

class CriaRegistoProduto {
   public String produto;
   public String quantidade;
   public String fornecedor;
   public String nifFornecedor;
   
   Conexao conn = new Conexao();
   
   public void registroUser(){
        try{
            conn.abreConexao();
            PreparedStatement ps = conn.conn.prepareStatement("insert into registoProduto values(?,?,?,?)");
            ps.setString(1, produto);
            ps.setString(2, quantidade);
            ps.setString(3, fornecedor);
            ps.setString(4, nifFornecedor);
                      
            
            int i = ps.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "Registrado com sucesso!");
            }     
    }
        catch(Exception e){
            System.out.println(e);
        }
        }
    
}
    


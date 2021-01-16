
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Login {
    
    public String nome;
    public String pwd;
    Conexao objCon = new Conexao();
    
    public boolean isUtilizadorRegistado(){
    
        objCon.abreConexao();
        boolean isUtilizadorFound = false;
        
        try{
            PreparedStatement statement = objCon.conn.prepareStatement("select * from clientes where nome=? ");
            statement.setString(1, nome);
            
            ResultSet resultSet = statement.executeQuery();
            isUtilizadorFound = resultSet.next();  
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally { // essa instrução faz parte do try e do catch
            try{
                objCon.conn.close(); // fecha a conexao com a base de dados
            }catch (Exception e){
            }
        }
        return isUtilizadorFound;
    }
    
    public boolean fazerLogin(){
        
        objCon.abreConexao();
        boolean statusLogin = false;
        
        try{
            PreparedStatement ps = objCon.conn.prepareStatement("select * from clientes where nome=? and pwd=? ");
            ps.setString(1, nome);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();
            statusLogin = rs.next();
        }
        catch(Exception e){
        }
        finally {
            
            try{
                objCon.conn.close();
            
            }
            catch(Exception e){
            
            }
        }
        return statusLogin;
    }   
    
    public void registarUtilizador(){
    
        try{
            objCon.abreConexao();
            PreparedStatement ps = objCon.conn.prepareStatement("insert into clientes (nome, pwd) values(?,?)");
            ps.setString(1, nome);
            ps.setString(2, pwd);
            
            int i = ps.executeUpdate(); //regista qualquer ação, tipo alterações na tabela. O método executa a instrução sql recebida
            if(i>0)// E informará o número de linhas que foram alteradas na tabela com a atualização. Se não houver atualização, retorna 0, se houver, retorna o numero de linhas alteradas com a inserção de um novo dado
                JOptionPane.showMessageDialog(null, "Registado com sucesso!");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                objCon.conn.close();
            }
            catch(Exception e){
            }
        }
    }
    
}

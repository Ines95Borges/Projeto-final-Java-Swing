package javaswing;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javaswing.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class LoginUtilizador {
    
    public String nome;
    public String pwd;
    public boolean acessaSistema;
    public boolean acessaSite;
    
    
    Conexao objCon = new Conexao();
    
    public boolean isUtilizadorRegistado(){
    
        objCon.abreConexao();
        boolean isUtilizadorFound = false;
        
        try{
            PreparedStatement statement = objCon.conn.prepareStatement("select * from utilizador where nome=? ");
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
            String sql = "select * "
                    + "from utilizador, privilegioutilizador "
                    + "where nome=? and pwd=? "
                    + "and utilizador.id = privilegioutilizador.idUtilizador "
                    + "and privilegioutilizador.idPrivilegio = 2";
           
            PreparedStatement ps = objCon.conn.prepareStatement(sql);
            
            String senhaHex = getEncryptedPassword();
            
            ps.setString(1, nome);
            ps.setString(2, senhaHex);
            
            
            //ps.setString(1, nome);
            //ps.setString(2, pwd);
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
            String sql = "insert into utilizador (nome, pwd) values(?,?)";
                    
            PreparedStatement statement = objCon.conn.prepareStatement(sql);
            
            statement.setString(1, nome);
            statement.setString(2, getEncryptedPassword());
            
            int i = statement.executeUpdate(); //regista qualquer ação, tipo alterações na tabela. O método executa a instrução sql recebida
            
            if(i>0)
            {
                sql = "select id from utilizador where nome = ? and pwd = ?";
                statement = objCon.conn.prepareStatement(sql);
            
                statement.setString(1, nome);
                statement.setString(2, getEncryptedPassword());
                
                ResultSet result = statement.executeQuery();
                result.next();
                int idUtilizador = result.getInt("id");
                
                if(acessaSite == true) {
                    sql = "insert into privilegioutilizador (idUtilizador, idPrivilegio) values (?, 1)";
                    statement = objCon.conn.prepareStatement(sql);
                    statement.setInt(1, idUtilizador);
                    statement.executeUpdate();
                }
                
                if (acessaSistema == true) {
                    sql = "insert into privilegioutilizador (idUtilizador, idPrivilegio) values (?, 2)";
                    statement = objCon.conn.prepareStatement(sql);
                    statement.setInt(1, idUtilizador);
                    statement.executeUpdate();
                }
                
                // E informará o número de linhas que foram alteradas na tabela com a atualização. 
                //Se não houver atualização, retorna 0, se houver, retorna o numero de linhas alteradas com a inserção de um novo dado
                JOptionPane.showMessageDialog(null, "Registado com sucesso!");
            }
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

    private String getEncryptedPassword() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // conceder privilegio ao utilizador de acesso ao site:
        //(insert into privilegioutilizador(idUtilizador, idPrivilegio) values(?, 1));
        
        //conceder privilegio ao utilizador de acesso ao sistema
        //(insert into privilegioutilizador(idUtilizador, idPRivilegio) values(?, 2));
        
        //criptografia da senha
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = md.digest(pwd.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for(byte b : messageDigest){
            
            sb.append(String.format("02X", 0xFF & b));
        }
        String senhaHex = sb.toString();
        return senhaHex;
    }
    
}

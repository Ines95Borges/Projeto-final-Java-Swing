import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
  
  Connection conn;
  String url = "jdbc:mysql://localhost:3307/javaweb";
  String user = "root";
  String password = "";
  
  public void abreConexao(){
    
    try{
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(url, user, password);
    }catch(Exception e){
      System.out.println(e);
    }
    
    
  }
  
}
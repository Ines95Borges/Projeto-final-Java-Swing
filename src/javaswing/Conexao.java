package javaswing;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
  
  Connection conn;
<<<<<<< HEAD:src/javaswing/Conexao.java
  String url = "jdbc:mysql://localhost:3306/javaweb_pf";
=======
  String url = "jdbc:mysql://localhost:3307/javaweb_pf";
>>>>>>> 3721ecbec37584bc4a1c3e49ad315abc663a85cb:src/Conexao.java
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
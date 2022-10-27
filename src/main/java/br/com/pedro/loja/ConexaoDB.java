package br.com.pedro.loja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoDB {
 
    
    // faz conexão com o banco de dados
     public Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("org.h2.Driver"); // Driver

            conn = DriverManager.getConnection( 
                "jdbc:h2:tcp://localhost/c:/Projeto/banco/loja", // string de conexão
                 "sa",  // usuário 
                  "") ; // senha
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
     } 


     // executa comandos INSERT, DELETE, UPDATE
     public void executeUpdate(String sql ){
        Connection conn = getConnection();

        try {
            int i = conn.createStatement().executeUpdate(sql);
        } catch (SQLException e) {

            e.printStackTrace();
        }
     }


     // execute SELECT
     public ResultSet executeSelect(String sql ){
        Connection conn = getConnection();
        ResultSet ret = null;
        try {
            ret= conn.createStatement().executeQuery(sql);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return ret;
    }


}

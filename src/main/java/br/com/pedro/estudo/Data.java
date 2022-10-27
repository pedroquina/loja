package br.com.pedro.estudo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import br.com.pedro.loja.ConexaoDB;

public class Data {

    String nome;
    Integer idade;
    static double salario;

    public static void main(String args[]) throws SQLException{

        Timestamp obj = new Timestamp( System.currentTimeMillis()  );
        System.out.println("mili : " + System.currentTimeMillis());
        System.out.println(" timestamp : " + obj.toString());
        System.out.println("Insert into teste values ( '" + obj.toString() + "' )");

    }
    
    public static void escrever(){
        ConexaoDB conn = new ConexaoDB();
        String sql = "insert into teste values ( now() )";
        conn.executeUpdate(sql);

    }

    public static void ler() throws SQLException{
        ConexaoDB conn = new ConexaoDB();
        // ler informação do do banco de dados
        String sql = "select * from teste";
        ResultSet rs = conn.executeSelect(sql);
        while ( rs.next() ){
                System.out.println( rs.getTimestamp("data")  );
        }

    }
}

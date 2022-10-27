package br.com.pedro.loja;

import java.sql.ResultSet;
import java.util.Scanner;

public class Usuario {

    Scanner teclado = new Scanner(System.in);

    public Integer usuario_id;
    public String  nome;
    public String  email;
    public String  senha;
    

    public void incluir(){

        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("         USUÁRIO INCLUIR");
        System.out.println("+++++++++++++++++++++++++++++");        

        System.out.println("");

        System.out.print("Entre com o código : ");
        usuario_id = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Entre com o nome : ");
        nome = teclado.nextLine();
        System.out.print("Entre com o email : ");
        email = teclado.nextLine();
        System.out.print("Entre com a senha : ");
        senha = teclado.nextLine();

        
        String sqlInsert = "insert into usuario ( usuario_id, nome, email, senha ) "
           + " values ( " + usuario_id + ",'" + nome + "','" + email + "','" + senha + "')";

        // Errado
        //String sql = "insert into usuario ( usuario_id, nome, email,senha ) "
        //    + " values ( usuario_id, 'nome', 'email', 'senha' ";

        ConexaoDB conexao = new ConexaoDB();

        conexao.executeUpdate(sqlInsert);


    }


    public void excluir(){
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("         USUÁRIO EXCLUIR");
        System.out.println("+++++++++++++++++++++++++++++");        

        System.out.println("");

        System.out.print("Entre com o código : ");
        usuario_id = teclado.nextInt();
        teclado.nextLine();

        String sqlDelete = "delete from usuario where usuario_id = " + usuario_id;

        ConexaoDB conexao = new ConexaoDB();

        conexao.executeUpdate(sqlDelete);


    }


    public void listar(){
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("         USUÁRIO LISTAR");
        System.out.println("+++++++++++++++++++++++++++++");        

        System.out.println("");

        String sqlSelect = "select * from usuario";

        ConexaoDB conexao = new ConexaoDB();

        ResultSet dadosRetornado = conexao.executeSelect(sqlSelect);


        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println(" Cod.     Nome      Email    ");
        System.out.println("+++++++++++++++++++++++++++++");  
        try {
            while ( dadosRetornado.next()){
                System.out.println(
                    dadosRetornado.getInt("usuario_id")+"   " +
                    dadosRetornado.getString("nome")+"    " +
                    dadosRetornado.getString("email")
    
                );
            }      

        } catch( Exception erro){
            //System.out.println("Erro : " + erro.getMessage());
            erro.printStackTrace();
        }




    }


}

package br.com.pedro.loja;

import java.sql.ResultSet;
import java.util.Scanner;

public class Usuario {

    private Scanner teclado = new Scanner(System.in);

    private Integer usuario_id;
    private String  nome;
    private String  email;
    private String  senha;
    

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


    public Scanner getTeclado() {
        return teclado;
    }


    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }


    public Integer getUsuario_id() {
        return usuario_id;
    }


    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


}

package br.com.pedro.estudo;

import br.com.pedro.loja.Usuario;

public class Metodo {
    
    // atributo
    String nome;
    String senha;

    public void fazLinha(){
        System.out.println("----------");
    }

    // método ou função
    public void fazQuadrado(){
        System.out.println("----------");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("----------");
    }


    public void imprimeAlgo( String nome  ){
        System.out.println(  nome );
    }


    public void soma( int n1 , int n2){
        int resultado = n1 + n2;
        System.out.println( resultado );
    }

    
    
    public void imprimeDados(String nome, int idade){
        System.out.println(nome + " sua idade é " + idade);
    }
    
    public void imprimeUsuario(Usuario  objUsuario ){
        System.out.println( objUsuario.nome + " seu email é " + objUsuario.email );
    }
    
    public int soma2( int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }

    public String passarParaMaiusculo( String frase){

        return frase.toUpperCase();
    }


    public static void main(String[] args){

        System.out.println(("Início"));
        Metodo obj = new Metodo();
        int resultadoCalculado = obj.soma2(10, 20);

        System.out.println( "Resultado : " + resultadoCalculado  );
        System.out.println("Fim");

    }

}

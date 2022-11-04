package br.com.pedro.estudo;

public class Aspas {



    public static void main(String a[]){

        // update tabela set campo1 = 'valor1', campo2 = now() where id = valor3;
        int id = 3;
        String nome = "pedro";
        String str = " update categoria set nome='"+nome+"', criado = now() where id="+id; 

        System.out.println(str);

    }
    
}

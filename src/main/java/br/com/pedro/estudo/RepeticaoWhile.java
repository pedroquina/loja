package br.com.pedro.estudo;

import java.util.Date;
import java.util.Scanner;

public class RepeticaoWhile {

    public static void main(String a[]) {

        
        exemploBreak();
        

    }

    private static void exemploBreak(){
        int contador = 0;
        // continue : while, for, do-while
        while (contador < 10) {
            System.out.println("Linha : " + contador);
            if ( contador == 5){
                break;
            }
            contador = contador + 1;
        }
        System.out.println("Fim");
    }

    private static void exemploContinue(){
        int contador = 0;
        // continue : while, for, do-while
        while (contador < 10) {

            contador = contador + 1;
            if ( contador % 2 != 0 ) {
                continue;  // retorna ao while
            }
            
            System.out.println("Linha : " + contador);
        }
        System.out.println("Fim");

    }

    private static void exemploString(){
        Scanner teclado = new Scanner(System.in);

        String  frase="";


        // condição ou expressão lógica
        // números : == , != , > , < , >= , <= 
        // String ou Objetos :  obj.equals , ! obj.equals 
        while (! frase.equals("sai r") ) { 
            System.out.println("Linha : " + new Date());
            
            System.out.println("Para sair digite : sair ");
            frase = teclado.nextLine();

        }
        System.out.println("Fim");        
    }


    private static void exemploNumerico(){
        int contador = 0;
        // condição ou expressão lógica
        while (contador < 10) {
            System.out.println("Linha : " + new Date());
            contador = contador + 1;
        }
        System.out.println("Fim");
    }

}

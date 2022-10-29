package br.com.pedro.estudo;

import java.util.Date;

public class RepeticaoWhile {

    public static void main(String a[]) {

        int contador = 0;
        // condição ou expressão lógica
        while (contador < 10) {
            System.out.println("Linha : " + new Date());
            contador = contador + 1;
        }
        System.out.println("Fim");

    }

}

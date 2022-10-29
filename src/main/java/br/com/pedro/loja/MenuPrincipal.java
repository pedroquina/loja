package br.com.pedro.loja;

import java.util.Scanner;

public class MenuPrincipal {

    Scanner teclado = new Scanner(System.in);


    public void mostarMenuPrincipal(){

        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("        MENU PRINCIPAL");
        System.out.println("+++++++++++++++++++++++++++++");

        System.out.println("");
        System.out.println("1. Usuário");
        System.out.println("2. Categoria");
        System.out.println("0. Finalizar");

        System.out.println("");
        System.out.print("Escolha uma opção :");

        String opcao = teclado.nextLine();

        System.out.println( "Opção escolhido : " + opcao );


        if ( opcao.equals("1")){
            MenuUsuario menuUsuario = new MenuUsuario();
            menuUsuario.mostarMenu();
        }


    }

    
}

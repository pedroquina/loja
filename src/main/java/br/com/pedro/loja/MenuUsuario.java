package br.com.pedro.loja;

import java.util.Scanner;

public class MenuUsuario {

    Scanner teclado = new Scanner(System.in);

    public void mostarMenu() {
        String opcao = "";

        while ( ! opcao.equals("0") ) {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("         MENU USUÁRIO");
            System.out.println("+++++++++++++++++++++++++++++");

            System.out.println("");
            System.out.println("1. Incluir");
            System.out.println("2. Excluir");
            System.out.println("3. Alterar");
            System.out.println("4. Listar");
            System.out.println("0. Sair");

            System.out.println("");
            System.out.print("Escolha uma opção :");

            opcao = teclado.nextLine();

            System.out.println("Opção escolhido : " + opcao);

            if (opcao.equals("1")) {
                Usuario obj = new Usuario();
                obj.incluir();
            }
            if (opcao.equals("2")) {
                Usuario usuario = new Usuario();

                usuario.excluir();

            }
            if (opcao.equals("4")) {
                Usuario usuario = new Usuario();
                usuario.listar();

            }
        }

    }

}

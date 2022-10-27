package br.com.pedro;

import java.sql.SQLException;

import br.com.pedro.loja.MenuPrincipal;


public final class App {
    private App() {
    }

    public static void main(String[] args) throws SQLException {

            MenuPrincipal ze = new MenuPrincipal();

            ze.mostarMenuPrincipal();


            System.out.println("Fim !!!");
        


    }
}

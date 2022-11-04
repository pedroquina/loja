package br.com.pedro.estudo;

public class UsoTryCatchFinally {

    public static void main(String a[]) throws Exception {
        exemplo2TryCatch();
    }

    private static void exemplo2TryCatch() {

        int x = 0;
        int y = 5;
        int z;
        int contador = 0;
        while (contador < 10) {
            try {
                z = y / x;
                System.out.println("z : " + z);
            } catch (Exception erro) {
                System.out.println("Erro : " + erro.getMessage());
                break;
            } finally {
                System.out.println("Eu serei executado sempre !!!!");
            }
            contador ++; // contador = contador + 1
        }

    }

    private static void exemploTryCatch() {

        int x = 0;
        int y = 5;
        int z;
        try {
            z = y / x;
            System.out.println("z : " + z);
        } catch (Exception erro) {
            System.out.println("Erro : " + erro.getMessage());
        } finally {
            System.out.println("Eu serei executado sempre !!!!");
        }

    }

}

package primeirasaulas;

import java.util.ArrayList;

/*
 * primeirasaulas.HelloWorld = Nome da minha classe
 * public = Tipo de acesso da classe
 * class = tipo da classe
 */
public class HelloWorld {

    //conteúdo deverá ser inserido aqui dentro
    public static void main(String[] args) {
        /*
         * Números(Valores) (int, double, float, long)
         * Textos (String)
         * Booleanos (boolean)
         */
        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 19619816516L;
        String dadoDoTipoString = "Colocar o meu texto";
        boolean dadoDoTipoBooleanTrue = true;
        boolean dadoDoTipoBooleanFalse = false;

        //if - else
        if (dadoDoTipoInt == 10) {
            //sysout
            System.out.println("Entrou no if");
        } else if (dadoDoTipoInt == 12) {
            System.out.println("Entrou no if do 12");
        } else {
            System.out.println("Entrou no else");
        }

        if (dadoDoTipoInt == 10) {
            System.out.println("Entrou no if do 10");
        }
        if (dadoDoTipoInt < 12) {
            System.out.println("entrou no id do 12");
        } else {
            System.out.println("Entrou no else");
        }

        //while (Enquanto algo for verdadeiro, faça algo)
        int valorInicial = 0;
        while (valorInicial < 3) {
            System.out.println("O valor inicial é menor que três");
            System.out.println(valorInicial);
            valorInicial++;
        }
        System.out.println("saiu do while");

        //for
        System.out.println("Iniciando o for");
        for (int i = 0; i < 4; i++ ) {
            System.out.println("O valor do i é: " + i);
        }
        System.out.println("Finalizando o for");
    }
}
//fora do escopo da classe
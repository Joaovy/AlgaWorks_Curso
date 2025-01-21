package Capitulo03_AlgaWorks.VariaveisConstantes;

import java.util.Scanner;

public class Exercicio01_Calculando_quadrado_de_um_Numero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do numero que deseja calcular: ");

        // verifica se o numero é valido, não uma string ou algo do tipo.
        if (scanner.hasNextDouble()){

            Double numero = scanner.nextDouble();
            Double numeroAoQuadrado = numero * numero;
            System.out.println("O quadrado de "+ numero +" é "+ numeroAoQuadrado);

        } else {
            System.out.println("Numero invalido!!");
        }

        /* O codigo acima ele verifica com a função hasNextDouble se o numero informado não é uma string, fiz essa alteração
        e também faz o calculo que o exercicio pede.
         */

    }


 }
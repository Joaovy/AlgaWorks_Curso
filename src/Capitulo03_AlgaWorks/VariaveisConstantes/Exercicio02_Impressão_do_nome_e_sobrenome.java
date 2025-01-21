package Capitulo03_AlgaWorks.VariaveisConstantes;

import java.util.Scanner;

public class Exercicio02_Impressão_do_nome_e_sobrenome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informne seu nome: ");
        String primeiroNome = scanner.nextLine();

        /* Nesse bloco de comandos verificamos se o nome não esta vazio utilizando o laço de repetição while
           que é um pouco mais simples que o for deixando o codigo um pouco mais complexo.
         */

        while (primeiroNome.isEmpty()){
            System.out.print("Seu nome não pode esta vazio, por favor digite seu nome: ");
            primeiroNome = scanner.nextLine();

        }
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Prazer! "+ primeiroNome +" "+ sobrenome +" é um belo sobrenome!");

        scanner.close();
    }

}

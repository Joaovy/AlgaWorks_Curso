package Capitulo05_AlgaWorks.EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio03_Imprimindo_Nome_da_Semana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Abaixo esta um codigo onde o sistema pede ao usuario um valor de
        1 ao 7 que será informado o dia da semana, para deixar um pouco mais complexo adicionei a estrutura de
        reptição while, mas o foco do exercicio é o switch.

         */
        Integer diaDaSemana;

        while (true) {
            System.out.print("Informe um numero de 1 a 7 da semana ( ou digite 0 para encerrar o programa ): ");
            diaDaSemana = scanner.nextInt();
            if (diaDaSemana == 0) {
                System.out.println("Progrma encerrado até mais!!");
                break;
            }


            switch (diaDaSemana) {
                case 1:
                    System.out.println("Você digitou: " + diaDaSemana + ", domingo");
                    break;
                case 2:
                    System.out.println("Você digitou: " + diaDaSemana + ", Segunda - feira");
                    break;
                case 3:
                    System.out.println("Você digitou: " + diaDaSemana + ", Terça - feira");
                    break;
                case 4:
                    System.out.println("Você digitou: " + diaDaSemana + ", Quarta - feira");
                    break;
                case 5:
                    System.out.println("Você digitou: " + diaDaSemana + ", Quinta - feira");
                    break;
                case 6:
                    System.out.println("Você digitou: " + diaDaSemana + ", Sexta - Feira");
                    break;
                case 7:
                    System.out.println("Você digitou: " + diaDaSemana + ", Sabado");
                    break;

                default:
                    System.err.println("Por favor digite um valor valido!");
                    System.exit(1);

            }
        }
    }
}

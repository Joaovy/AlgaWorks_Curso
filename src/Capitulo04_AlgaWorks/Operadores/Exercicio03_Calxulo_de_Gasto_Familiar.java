package Capitulo04_AlgaWorks.Operadores;

import java.util.Scanner;

public class Exercicio03_Calxulo_de_Gasto_Familiar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer gastoFamiliar = 0;

        System.out.print("Qual o valor da conta de luz?: ");
        gastoFamiliar += scanner.nextInt();

        System.out.print("Qual o valor da conta de Agua?: ");
        gastoFamiliar += scanner.nextInt();

        System.out.print("Qual o valor da conta de telefone?: ");
        gastoFamiliar += scanner.nextInt();

        System.out.print("Qual o valor da escola do filho?: ");
        gastoFamiliar += scanner.nextInt();

        System.out.print("Qual o valor da fatura do cartão?: ");
        gastoFamiliar += scanner.nextInt();

        System.out.print("Gastos com supermecado? : ");
        gastoFamiliar += scanner.nextInt();

        Integer gastoTotal = gastoFamiliar;
        System.out.println("O Gasto total da familia foi: R$"+ gastoTotal);

        /* O programa acima faz o calculo do gasto que uma familia teve utilizando os operadores += isso equivale
        para subtração e os demais operadores
         */
    }

}

package Capitulo04_AlgaWorks.Operadores;

import java.util.Scanner;

public class Exercicio01_Calculadora_simples {
    public static void main(String[] args) {

        /* O programa abaixo funciona como uma calculadora simples sem ser muito complexo
        porém adicionei algumas funções extras como o laço de repetição while para que o usuario possa
        refazer algum calculo e a verificação que é utilizado o equals e o ! que inverte o resoltado de true para false.
         */
        Scanner scanner = new Scanner(System.in);
        Boolean continuarPrograma = true;

        while (continuarPrograma){
            System.out.print("Informe o primeiro valor que deseja: ");
                Integer primeiroValor = scanner.nextInt();

            System.out.print("Informe o segundo valor que deseja: ");
                Integer segundoValor = scanner.nextInt();

            System.out.println("Qual operação deseja realizar? ");
            System.out.println("1 - adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Digite o numero correspondente a operação: ");
                 Integer operacaoCalculo = scanner.nextInt();

                 if (operacaoCalculo == 1){
                     Integer resultadoAdicao = primeiroValor + segundoValor;
                     System.out.print("Você escolheu adição, resultado: "+ resultadoAdicao);

                 } else if (operacaoCalculo == 2) {
                     Integer resultadoSubtracao = primeiroValor - segundoValor;
                     System.out.print("Você escolheu subtração, resultado: "+ resultadoSubtracao);

                 } else if (operacaoCalculo == 3) {
                     Integer resultadoMultiplicacao = primeiroValor * segundoValor;
                     System.out.println("Vocẽ escolheu multiplicação, resultado: "+ resultadoMultiplicacao);

                 } else if (operacaoCalculo == 4) {
                     Double resultadoDivisao = (double) (primeiroValor / segundoValor);
                     System.out.println("Vocẽ escolheu divisão , resultado: "+ resultadoDivisao);

                 } else {
                     System.out.println("Opção invalida!");
                 }

            System.out.print("\nDeseja continuar? (s/n): ");
                 String respostaContinuar = scanner.next();

                if(! "S".equalsIgnoreCase(respostaContinuar)){

                }
                if(!respostaContinuar.equalsIgnoreCase("s")){
                     continuarPrograma = false;
                     System.out.println("Encerrando programa!");
                 }

        }

    }
}
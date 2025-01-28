package Capitulo08_AlgaWorks.Metodos;

import java.util.Scanner;

public class Exercicio02CalculadoraComMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operacoes = new String[]{"Adição", "Subtração","Multiplicação","Divisão"};

        System.out.println("_____________________________________");
        System.out.println("Qual operação você deseja fazer? ");
        exibirInformacoesVetor(operacoes);
        int escolhaDaOperacao = recebeUmNumeroComoValidacao("Informe o numero que corresponde a operção: ", scanner);
        // acima estão dois metodos que havia feito na aula passada e se encaixão nessa situação.

        processarEscolhadoUsuario(escolhaDaOperacao,operacoes,scanner);
        // Esse metedo contém o switch onde o usuario faz a sua escolha.

        scanner.close();
    }

    //Metdodos
    static void processarEscolhadoUsuario(int escolhaDaOperacao, String[] operacoes, Scanner scanner){
        switch (escolhaDaOperacao){
            case 0:
                //System.out.println("Você escolheu: "+ operacoes[0]);
                int resultadoSoma = operacaoAdicao(scanner);
                System.out.println("A soma dos dois valores é: "+ resultadoSoma);
                break;
            case 1:
                int resultadoSubtracao = operacaoSubtracao(scanner);
                System.out.println("A subtração dos valores é: "+ resultadoSubtracao);
                break;
            case 2:
                int resultadoMultiplicacao = operacaoMultiplicacao(scanner);
                System.out.println("A Multiplicação dos valores é: "+ resultadoMultiplicacao);
                break;
            case 3:
                float resultadoDivisao = operacaoDivisao(scanner);
                System.out.println("O resultado da divisão é: "+ resultadoDivisao);
                break;
            default:
                System.err.println("Escolha invalida!");
        }
    }
    static int operacaoAdicao( Scanner scanner){
        System.out.print("Informe o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Informe o segundo valor: ");
        int valor2 = scanner.nextInt();

        return valor1 + valor2;
    }
    static int operacaoSubtracao( Scanner scanner){
        System.out.print("Informe o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Informe o segundo valor: ");
        int valor2 = scanner.nextInt();

        // int soma = valor1 + valor2;
        return valor1 - valor2;
    }
    static int operacaoMultiplicacao( Scanner scanner){
        System.out.print("Informe o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Informe o segundo valor: ");
        int valor2 = scanner.nextInt();

        // int soma = valor1 + valor2;
        return valor1 * valor2;
    }
    static float operacaoDivisao ( Scanner scanner){
        float valor1 = 0.0f;
        float valor2 = 0.0f;

        System.out.print("Informe o primeiro valor: ");
        valor1 = scanner.nextInt();

        System.out.print("Informe o segundo valor: ");
        valor2 = scanner.nextInt();

        // int soma = valor1 + valor2;
        return valor1 / valor2;
    }

    static int recebeUmNumeroComoValidacao(String texto, Scanner scanner){
        System.out.print(texto);
        int numero = scanner.nextInt();
        return numero;
    }
    static void exibirInformacoesVetor(String[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.println("["+ i +"]"+ vetor[i]);
        }
    }
}

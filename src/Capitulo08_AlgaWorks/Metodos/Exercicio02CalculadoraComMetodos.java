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
    }
    static void processarEscolhadoUsuario(int escolhaDaOperacao, String[] operacoes, Scanner scanner){
        switch (escolhaDaOperacao){
            case 0:
                System.out.println("Você escolheu: "+ operacoes[0]);
                int soma = operacaoAdicao(scanner);
                System.out.println("A soma dos dois valores é: "+ soma);
                break;
            case 1:
                System.out.println("Você escolheu: " + operacoes[1]);
                break;
            case 2:
                System.out.println("Você escolheu: " + operacoes[2]);
                break;
            case 3:
                System.out.println("Você escolheu: " + operacoes[3]);
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

       // int soma = valor1 + valor2;
        return valor1 + valor2;
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

package Anotacoes.CursoAlgarWorks.Capitulos.AlgaWorks;

import java.util.Scanner;

public class RecebendoParametros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] cursos = new String[]{"Java", "Python", "Spring"};

        imprimirTraco();
        System.out.println("Escolha um dos cursos abaixo:");
        exibirPosicoesDovetorString(cursos);

        System.out.print("Qual o curso que você deseja?: ");
        int posicaoDaescolhaDocurso = scanner.nextInt();

        Boolean posicaoValida = posicaoDaescolhaDocurso >= 0 && posicaoDaescolhaDocurso > cursos.length;
        if (posicaoValida) {
            encerraProgamaPorPOsicaoInvalida();
        }

        imprimirTraco();
        String[] formasDePagementos = new String[]{"Credito", "Debito"};
        System.out.println("Qual a forma de pagamento?");
        exibirPosicoesDovetorString(formasDePagementos);

        System.out.print("Informe o numero correspondente a forma de pagamento: ");
        int escolhaDaFormaDepagamento = scanner.nextInt();

        imprimirTraco();
        posicaoValida = escolhaDaFormaDepagamento >= 0 && escolhaDaFormaDepagamento > formasDePagementos.length;

        if (!posicaoValida) {
            encerraProgamaPorPOsicaoInvalida();
        }

        imprimirTraco();
        String cursoEscolhido = cursos[posicaoDaescolhaDocurso];
        String formaDePagamentoEscolhida = formasDePagementos[escolhaDaFormaDepagamento];

        System.out.println("Seu curso escolhido foi " + cursoEscolhido + " e a sua forma de pagamento foi " + formaDePagamentoEscolhida);
        scanner.close();
    }

    static void encerraProgamaPorPOsicaoInvalida() {
        System.err.println("Posição invalida!");
        System.exit(1);
    }

    static void imprimirTraco() {
        System.out.println("-----------------------------------------------");
    }

    static void exibirPosicoesDovetorString(String[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "]" + vetor[i]);
        }
    }
}
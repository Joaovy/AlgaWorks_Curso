package Capitulo08_AlgaWorks.Metodos;

import java.util.Scanner;

public class Exercicio01MetodosAdicionais {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] cursos = new String[]{"Java", "Python", "Spring"};

        imprimirTraco();
        System.out.println("Escolha um dos cursos abaixo:");
        exibirPosicoesDoVetor(cursos);
        int posicaoDaescolhaDocurso = recebendoNumeroInteiroDoUsuario("Qual o curso que você deseja?: ", scanner);
        // Retornando uma string e um valor inteiro com scanner.

        //Boolean posicaoValida = posicaoDaescolhaDocurso >= 0 && posicaoDaescolhaDocurso > cursos.length;
        boolean posicaoValida = verificaPosicaoEscolhidaPeloUsuario(posicaoDaescolhaDocurso, cursos);
        // Metodo acima retona um valor de um valor boolean simples!!!
        if (posicaoValida){
            encerraProgamaPorPOsicaoInvalida();
        }

        imprimirTraco();
        // formas de pagamento
        String[] formasDePagementos = new String[]{"Credito", "Debito"};
        System.out.println("Qual a forma de pagamento?");
        exibirPosicoesDoVetor(formasDePagementos);
        int escolhaDaFormaDepagamento = recebendoNumeroInteiroDoUsuario("Informe o numero correspondente a forma de pagamento: ", scanner);
        // Retornando uma string e um valor inteiro com scanner, mesma logica porém com

        imprimirTraco();
        // posicaoValida = escolhaDaFormaDepagamento >= 0 && escolhaDaFormaDepagamento > formasDePagementos.length;
        posicaoValida = verificaPosicaoEscolhidaPeloUsuario(posicaoDaescolhaDocurso, formasDePagementos);
        // Metodo acima retona um valor de um valor boolean simples!!!
        if (posicaoValida){
            encerraProgamaPorPOsicaoInvalida();
        }

        String cursoEscolhido = cursos[posicaoDaescolhaDocurso];
        String formaDePagamentoEscolhida = formasDePagementos[escolhaDaFormaDepagamento];

        System.out.println("Seu curso escolhido foi "+ cursoEscolhido + " e a sua forma de pagamento foi "+ formaDePagamentoEscolhida);
        scanner.close();
    }
    // Metodos
    static int recebendoNumeroInteiroDoUsuario( String texto, Scanner scanner ){
        System.out.print(texto);
        int numero = scanner.nextInt();
        return numero;
    }
    static boolean verificaPosicaoEscolhidaPeloUsuario(int posicao, String[] vetor){
        Boolean valida = posicao >= 0 && posicao > vetor.length;
        return valida;
    }
    static void encerraProgamaPorPOsicaoInvalida(){
        System.err.println("Posição invalida!");
        System.exit(1);
    }
    static void imprimirTraco(){
        System.out.println("-----------------------------------------------");
    }
    static void exibirPosicoesDoVetor(String[] vetor){
        for(int i = 0; i < vetor.length; i++){
            System.out.println("["+ i + "]"+ vetor[i]);
        }

    }

}

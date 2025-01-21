package Capitulo04_AlgaWorks.Operadores;

import java.util.Scanner;

public class Exercicios04_Verificacao_de_Aposentadoria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a sua idade?: ");
        Integer idade = scanner.nextInt();

        System.out.print("Quantos anos de contribuição você tem?: ");
        Integer anosContribuicacao = scanner.nextInt();

        System.out.print("Informe seu genero ( 'M' para masculino e 'F' para feminino ): ");
        String genero = scanner.next().toUpperCase();

        Boolean verificacaoDeIdade =(genero.equals("M") && idade >= 60) || (genero.equals("F") && idade >= 55);
        Boolean varificaAnosContribuicao = anosContribuicacao >= 25;

        if(verificacaoDeIdade && varificaAnosContribuicao){
            System.out.println("Parabens, você já pode se aposentar!");
        } else {
            System.out.println("Infelizmente você não atingiu os requisitos necessarios.");

        }

        /* O codigo acima ele verifica se você esta apto para se aposentar, porém
        eu adicionei um a funcionalidade que o gpt me sugeriu que foi o equals ele funciona como um ==
        porém ele compara todo o conteudo ou valor.
         */

    }
}

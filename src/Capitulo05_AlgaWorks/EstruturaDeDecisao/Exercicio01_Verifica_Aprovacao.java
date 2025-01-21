package Capitulo05_AlgaWorks.EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio01_Verifica_Aprovacao {

    public static void main(String[] args) {
/* O codigo abaixlo faz uma verificção da nota do aluno bem simples com uma estrutura de if porém eu decide
complicar um pouco e refiz o codigo pra deixar ele um pouco mais logico onde o codigo indica se você foi reprovado
pela materia ou pelo total da sua nota, também apliquei uma logica diferente em nas variaveis boolean

 */
        Scanner scanner = new Scanner(System.in);
        Integer notaPortugues = 0;
        Integer notaMatematica = 0;

        System.out.print("Qual a sua nota em português? ( max 100 ): ");
        notaPortugues = scanner.nextInt();

        System.out.print("Qual a sua nota em matematica? ( max 100 ): ");
        notaMatematica = scanner.nextInt();

        Integer notaTotalDasmaterias = notaMatematica + notaPortugues;
        Boolean verificacaoDoMinimoDeCadaMateria =  (notaMatematica >= 60 ) && ( notaPortugues >= 60);
        Boolean verificacaoDototalDasMaterias =  notaTotalDasmaterias >= 150;

        if (verificacaoDoMinimoDeCadaMateria && verificacaoDototalDasMaterias){
            System.out.println("Parabens, você foi aprovado na vaga!!");

        }else if (verificacaoDoMinimoDeCadaMateria == false){
            System.out.println("Infelizmente você foi reprovado na vaga! por não atingir o minimo de 60 pontos");

        } else if (verificacaoDototalDasMaterias == false) {

            System.out.println("O seu total foi abaixo do 150, infelizmente foi reprovado!");

        }

        // Nesse codigo eu apliquei também a estrutura do else if encadeado ja que se enquadra no codigo.

        scanner.close();
    }
}
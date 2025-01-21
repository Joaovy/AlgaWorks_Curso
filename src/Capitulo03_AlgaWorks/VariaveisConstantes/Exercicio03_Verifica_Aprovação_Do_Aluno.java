package Capitulo03_AlgaWorks.VariaveisConstantes;
import java.util.Scanner;

public class Exercicio03_Verifica_Aprovação_Do_Aluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Abaixo esta o codigo que o exercicio pede informado se o aluno passou ou não de ano.
        System.out.print("Informe sua nota: ");
        Integer nota = scanner.nextInt();

        Boolean verificacaoDaNota = nota >= 70;
        if (verificacaoDaNota){
            System.out.println("Parabens, você passou de ano!!! ");
        }else {
            System.out.println("Infelizmenrte não passou de ano! ");
        }

        /* O codigo abaixo faz o calculo da  media do aluno junto com o for para fazer a repetição das quantidades
        das notas / materias que deseja calcular
         */

        System.out.print("Deseja calcular sua media? ( 0 / sim ou 1 / não ): ");
        Integer escolhaDaMedia = scanner.nextInt();

        if (escolhaDaMedia == 0){

            System.out.print("Digite a quantidade de notas que deseja calcular a sua media: ");
            Integer numeroDeNotas = scanner.nextInt();

            Double somaNotas  = 0.0;

            for(int i = 1; i < numeroDeNotas; i++){
                System.out.print("Digite a nota da "+ i +" :");
                Double valorNotas = scanner.nextDouble();
                somaNotas += valorNotas;

            }

            // Calcula a media da nota do aluno, quantidade de notas dividido pela soma dos valores das notas.
            Double media = somaNotas / numeroDeNotas;

            System.out.println("A media do aluno é: "+ media);

        }

        scanner.close();
    }

}

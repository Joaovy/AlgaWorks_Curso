package Capitulo08_AlgaWorks.Metodos;

import java.util.Enumeration;
import java.util.Scanner;

public class ExibirTabuadaNumeroQualquer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe o numero que deseje ver a tabuada: ");
        int numeroMultiplicando = scanner.nextInt();

        imprimirTabuada(numeroMultiplicando, 0);
        scanner.close();
    }
    static void imprimirTabuada(int multiplicando, int multiplicador){
        if (multiplicador > 10){
            return;
        }
        int resultado = multiplicando * multiplicador;
        System.out.println(multiplicando + " X "+ multiplicador +" = "+ resultado );
        imprimirTabuada(multiplicando, multiplicador + 1);


    }

    //maneira mais eficaz de se fazer a recursivuidade
    /*static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
        System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));

        if (++multiplicador <= 10) {
            imprimirTabuada(multiplicando, multiplicador);
        }
     */


}

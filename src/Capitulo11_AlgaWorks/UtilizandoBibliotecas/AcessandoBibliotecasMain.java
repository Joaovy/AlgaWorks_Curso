package Capitulo11_AlgaWorks.UtilizandoBibliotecas;

import console.Interacao;

public class AcessandoBibliotecasMain {
    public static void main(String[] args) {

        Interacao interacao = new Interacao();

        int numero = interacao.lerNumero("Digite um numero: ");

        double decimal = interacao.lerDecmal("Digite um numero decimal: ");

        interacao.imprimir("Decimal: "+ decimal);

        interacao.erro("Mnesagem de erro!");

        interacao.fechar();

        /* nesse codigo foi feito uma biblioteca em .jar para que possamos usar e
        é demonstrado no codigo acima usando codigos simples e funções simple do codigo.
         */

    }
}

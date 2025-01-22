package Capitulo03_AlgaWorks.VariaveisConstantes;
import java.util.Scanner;

public class Exercicio05_Constante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Double desconto = 0.10;

        System.out.print("Digite o valor do produto ( 10% em todas as compras ) : ");
        Double valorProduto = scanner.nextDouble();

        Double valorDesconto = valorProduto * desconto;

        System.out.println("Preço original: R$ " + valorProduto);

        double precoFinal = valorProduto - valorDesconto;

        System.out.println("Preço final com desconto de 10%: R$ " + precoFinal);

        /* Exercicio simples onde mostra a função de uma constante onde ela consegue manter o valor daquela variavel
        ao decorrer do codigo, e ela não pode ser alterada.
         */
    }
}

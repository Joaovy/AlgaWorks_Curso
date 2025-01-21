package Capitulo04_AlgaWorks.Operadores;

import java.util.Scanner;

public class Exercicio02_Desconto_de_Fretes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer valorFrete = 10;
        Boolean continuarCompra = true;

        while (continuarCompra) {
            System.out.print("Informe o valor do produto: ");
            Integer valorProduto = scanner.nextInt();

            if (valorProduto < 0) {
                System.out.println("INforme um valor valido!!");
                continue;
            }

            if (valorProduto >= 100) {
                System.out.println("Parabens, seu produto atingiu o valor necessario para o desconto do frente!");
                System.out.println("O valor final ficou: R$" + valorProduto);
            } else {
                Integer valorDoProdutoComFrete = valorFrete + valorProduto;
                System.out.println("O seu produto não atingiu o valor necessario para o desconto do frete.");
                System.out.println("Valor final: R$" + valorDoProdutoComFrete);

            }

            System.out.print("Deseja fazer um novo calculo?(s/n): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("n")) {

                System.out.println("Finalizando programa!");

            }


        }

        // codigo acima faz o calculo simplis de um desconto de frente se ele atinge o valor de 100 reias o desconto do frete é aplicado.

    }
}

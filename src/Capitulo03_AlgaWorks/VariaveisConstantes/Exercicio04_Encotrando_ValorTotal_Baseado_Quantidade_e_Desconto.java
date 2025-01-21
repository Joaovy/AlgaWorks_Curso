package Capitulo03_AlgaWorks.VariaveisConstantes;
import java.util.Scanner;

public class Exercicio04_Encotrando_ValorTotal_Baseado_Quantidade_e_Desconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Codigo abaixo recebe o valor do produto e quantidade que o usuario informa, e com essas informações
        encotra o subtotal, esse foi um pouco mais complexo e dificil de compreender as formulas do if e quais seriam
        as medidas de desconto, por isso resolvi não incrementar alguma funcionalidade no codigo.
         */

        System.out.print("Qual o valor do produto?: ");
        Integer valorProduto = scanner.nextInt();

        System.out.print("Qual a quantidade do produto?: ");
        Integer quantidadeDeProduto  = scanner.nextInt();

            Integer valorSubtotal = quantidadeDeProduto * valorProduto;

            Boolean quantidadeMaiorOuIgual = quantidadeDeProduto >= 10;
            Double porcentagemDeDesconto = 0.0;

                if (quantidadeMaiorOuIgual){
                    porcentagemDeDesconto = 10.0;
                }


        Double desconto = valorProduto * porcentagemDeDesconto / 100;
        Double valorTotalComDesconto = valorSubtotal - desconto;

        System.out.println("Valor Total: "+ valorTotalComDesconto);


        scanner.close();

    }
}

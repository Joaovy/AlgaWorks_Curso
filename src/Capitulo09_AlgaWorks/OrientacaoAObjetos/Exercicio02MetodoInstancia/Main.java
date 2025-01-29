package Capitulo09_AlgaWorks.OrientacaoAObjetos.Exercicio02MetodoInstancia;

public class Main {

    public static void main(String[] args) {
    Produto produto01 = new Produto();
    produto01.nome = "SmartPhone";
    produto01.quantidadeEstoque = 10;
    produto01.valor = 2300.0;

        if (produto01.necessarioReporEstoque()){
            System.out.println("Seu estoque esta em falta, faça a reposição! A quantidade minima é: "+ produto01.quantidadeMinima);
            System.out.println("A quantidade a atual do seu estoque é: "+ produto01.quantidadeEstoque);
        }else {
            System.out.println("Sua quantidade de produtos esta no esperado, adicione um desconto a compra, ( valor com desconto ): "+ produto01.obterValorDoProdutoComDesconto());
        }
    }
}

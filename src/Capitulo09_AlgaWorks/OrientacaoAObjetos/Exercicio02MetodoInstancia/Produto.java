package Capitulo09_AlgaWorks.OrientacaoAObjetos.Exercicio02MetodoInstancia;

public class Produto {

    static final int quantidadeMinima = 10; // Essa não é uma variavel e sim uma constante!!!!!
    String nome;
    double valor;
    int quantidadeEstoque;


    String obterNomeProduto(){

        return nome;
    }

    double obterValorDoProdutoComDesconto() {

        double porcentagemDeDesconto = 0.10;
        double valorComDescontoTotal = porcentagemDeDesconto * valor;

        return valorComDescontoTotal;
    }

    boolean necessarioReporEstoque(){
        if(quantidadeEstoque < Produto.quantidadeMinima){
            return true;
        }

        return false;
    }


}





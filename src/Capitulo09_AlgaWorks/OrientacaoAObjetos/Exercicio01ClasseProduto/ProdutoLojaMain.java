package Capitulo09_AlgaWorks.OrientacaoAObjetos.Exercicio01ClasseProduto;

public class ProdutoLojaMain {

    public static void main(String[] args) {
        ProdutoLoja produto = new ProdutoLoja();
        produto.nome = "Teclado Atack Shark";
        produto.quantidade = 9;
        produto.valor = 250.0;

        verificaAQuantidadeEstoque(produto);

    }

    static void verificaAQuantidadeEstoque(ProdutoLoja produtoLoja){

        if(produtoLoja.quantidade >= 10){
            System.out.println("Seu estoque esta na quantidade minima! "+ produtoLoja.quantidade + " unidades");
        }else {
            System.out.println("Seu etoque esta abaixo da quantidade esperada, por favor abasteça! "+ produtoLoja.quantidade +" unidades");
        }


    }

}

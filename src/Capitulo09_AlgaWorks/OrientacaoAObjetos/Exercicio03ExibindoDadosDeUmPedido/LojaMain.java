package Capitulo09_AlgaWorks.OrientacaoAObjetos.Exercicio03ExibindoDadosDeUmPedido;

public class LojaMain {

    public static void main(String[] args) {

        /* atividade de encapsulamento demonstrando como se aplica o get e set
        e retirando a variavel total mostrando que ela pode virar um metodo somente com
        o get e não sendo necessario o set.
         */
        Pedido pedido01 = new Pedido();
        pedido01.nome = "Monitor";
        pedido01.codigo = "#1234";
        pedido01.desconto = 5.0;
        pedido01.subtotal = 250.0;

        System.out.println("O "+ pedido01.getNome() +" esta com o codigo: "+ pedido01.getCodigo());
        System.out.println("O desconto do pedido ficou em: "+ pedido01.desconto +"% o subtotal ficou em: "+ pedido01.subtotal);
        System.out.println("O total do pedido ficou em: "+ pedido01.getTotal());



    }

}

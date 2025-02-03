package Capitulo09_AlgaWorks.OrientacaoAObjetos.Exercicio03ExibindoDadosDeUmPedido;

public class Pedido {

    String nome;
    String codigo;
    double subtotal;
    double desconto;
//    double total;
    // não é mais necessario

    String getNome(){
        return nome;
    }
    void setNome(){
        this.nome = nome;
    }

    String getCodigo(){
        return codigo;
    }
    void setCodigo(String codigo){
        this.codigo = codigo;
    }

    double getSubtotal(){
        return subtotal;
    }
    void setSubtotal(double subtotal){
        this.subtotal = subtotal;
    }

    double getDesconto(){
        return desconto;
    }
    void setDesconto(double desconto){
        this.desconto = desconto;
    }

    double getTotal(){
        return subtotal - desconto;
    }
    void setTotal(){
    }
}

package Atividade8;

public class Pedido {
    Produto produto;
    int quantidade;

    public Pedido(Produto produto, int quantidade){

        this.produto = produto;
        this.quantidade = quantidade;

    }

    public double totalValor(){

        return produto.ProdutoPreco() * quantidade;

    }


}

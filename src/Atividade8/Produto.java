package Atividade8;

public class Produto {

    String nome;
    Double preco;

    public Produto(String nome, Double preco){

        this.nome = nome;
        this.preco = preco;

    }

    public String ProdutoNome(){

        return nome;

    }

    public double ProdutoPreco(){

        return preco;

    }
}

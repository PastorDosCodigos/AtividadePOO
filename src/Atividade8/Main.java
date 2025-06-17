package Atividade8;

public class Main {
    public static void main(String[] args){
        Produto vinho = new Produto("São Braz", 10.0);
        Pedido pedido1 = new Pedido(vinho, 4);

        Produto quadrinho = new Produto("Invencivel", 34.0);
        Pedido pedido2 = new Pedido(quadrinho, 100);

        System.out.println("Pedido 1");
        System.out.println("Produto: " + vinho.nome);
        System.out.println("Preço: " + vinho.preco);
        System.out.println("Quantidade: " + pedido1.quantidade);
        System.out.println("Total a pagar: " + pedido1.totalValor());
        System.out.println(" ");
        System.out.println("Pedido 2");
        System.out.println("Produto: " + quadrinho.nome);
        System.out.println("Preço: " + quadrinho.preco);
        System.out.println("Quantidade: " + pedido2.quantidade);
        System.out.println("Total a pagar: " + pedido2.totalValor());


    }

}

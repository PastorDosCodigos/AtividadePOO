package Atividade7.lampada;

public class Lampada {
    private String tipo;
    private String cor;
    private int potencia;

    public Lampada() {
        this("LED", "Branca", 9);
    }

    public Lampada(String tipo, String cor, int potencia) {
        this.tipo = tipo;
        this.cor = cor;
        this.potencia = potencia;
    }

    public Lampada(String tipo, String cor, int potencia, boolean validarPotencia) {
        this.tipo = tipo;
        this.cor = cor;
        this.potencia = (validarPotencia && potencia < 0) ? 0 : potencia;
    }

    public void acender(){
        System.out.println("Lâmpada acesa.");
    }

    public void apagar(){
        System.out.println("Lâmpada apagada.");
    }

    public void esquentar(){
        System.out.println("Aquecendo...");
    }

    @Override
    public String toString() {
        return String.format("Lampada[tipo=%s, cor=%s, potência=%dW]", tipo, cor, potencia);
    }
}

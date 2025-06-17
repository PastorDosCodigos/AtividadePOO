package Atividade7.calculadora;

public class Calculadora {
    private String modelo;
    private String tipo;
    private String cor;

    public Calculadora() {
        this("Genérica", "Simples", "Preta");
    }

    public Calculadora(String modelo, String tipo, String cor) {
        this.modelo = modelo;
        this.tipo   = tipo;
        this.cor    = cor;
    }

    public Calculadora(String modelo, String tipo, String cor, boolean usarPadraoCientifica) {
        this.modelo = modelo;
        this.tipo   = usarPadraoCientifica ? "Científica" : tipo;
        this.cor    = cor;
    }

    public double multiplicar(double a, double b){
        return a * b;
    }

    public double subtrair(double a, double b){
        return a - b;
    }

    public double dividir(double a, double b){
        return b == 0 ? Double.NaN : a / b;
    }

    @Override
    public String toString() {
        return String.format("Calculadora[modelo=%s, tipo=%s, cor=%s]", modelo, tipo, cor);
    }
}

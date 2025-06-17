package Atividade7.carro;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;

    public Carro() {
        this("Desconhecido", "XXX-0000", 0);
    }

    public Carro(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public Carro(String modelo, String placa, int ano, boolean validarAno) {
        this.modelo = modelo;
        this.placa  = placa;
        this.ano = (validarAno && ano < 1886) ? 1886 : ano;
    }

    public void acelerar() { System.out.println(modelo + " acelerando"); }
    public void frear()    { System.out.println(modelo + " freando"); }
    public void buzinar()  { System.out.println("bibi"); }

    @Override
    public String toString() {
        return String.format("Carro[modelo=%s, placa=%s, ano=%d]", modelo, placa, ano);
    }
}


package Atividade7.carro;

public class Carroteste {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro("Onibus", "LaE‑2023", 2023);
        Carro c3 = new Carro("Fusca", "XYZ‑0001", 1800, true);

        for (Carro c : new Carro[]{c1,c2,c3}) {
            System.out.println(c);
            c.acelerar();
            c.frear();
            c.buzinar();
            System.out.println();
        }
    }
}

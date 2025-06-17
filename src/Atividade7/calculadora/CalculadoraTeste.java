package Atividade7.calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        Calculadora c2 = new Calculadora("HP", "Financeira", "Dourada");
        Calculadora c3 = new Calculadora("Casio", "Qualquer", "Cinza", true);

        for (Calculadora c : new Calculadora[]{c1,c2,c3}) {
            System.out.println(c);
            System.out.println("  6 × 7 = " + c.multiplicar(6,7));
            System.out.println("  9 − 2 = " + c.subtrair(9,2));
            System.out.println("  10 ÷ 0 = " + c.dividir(10,0));
            System.out.println();
        }
    }
}

package Atividade7.lampada;

public class LampadaTeste {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada("Fluorescente", "Amarela", 20);
        Lampada l3 = new Lampada("Incandescente", "Vermelha", -5, true);

        for (Lampada l : new Lampada[]{l1,l2,l3}) {
            System.out.println(l);
            l.acender();
            l.esquentar();
            l.apagar();
            System.out.println();
        }
    }
}

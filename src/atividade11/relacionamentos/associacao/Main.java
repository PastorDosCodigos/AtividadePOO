package atividade11.relacionamentos.associacao;

public class Main {

    public static void main(String[] args) {

        Professor prof = new Professor("Rebeca");
        Disciplina d1 = new Disciplina("POO");

        prof.lecionar(d1);
    }

}

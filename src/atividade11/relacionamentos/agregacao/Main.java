package atividade11.relacionamentos.agregacao;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Professor p1 = new Professor("Rebeca");
        Professor p2 = new Professor("Bonetti");

        Departamento dep = new Departamento("Tecnologia", Arrays.asList(p1, p2));
        dep.listarProfessores();
    }
}

package br.com.PastorTchola_on_twitter.atividade12.testePrivate.aluno;
import br.com.PastorTchola_on_twitter.atividade12.testePrivate.professor.Professor;

public class Main {
    public static void main (String[] args){

        Aluno a1 = new Aluno("xxxx", "xxx", 00 );
        a1.setIdade(19);
        a1.setNome("GuiGui");
        a1.setSemestre("Segundo Semestre");

        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());
        System.out.println(a1.getSemestre());

        System.out.println(" ")

        Professor p1 = new Professor("xxxx", "xxx", 00 );
        p1.setIdade(00);
        p1.setNome("Rebeca");
        p1.setDisciplina("POO");

        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getDisciplina());


    }
}

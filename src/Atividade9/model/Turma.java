package Atividade9.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    public String serieTurma;
    public Professor professor;
    public List<Aluno> alunos = new ArrayList<>();

    public Turma(String serieTurma, Professor professor, List<Aluno> alunos){

        this.serieTurma = serieTurma;
        this.professor = professor;
        this.alunos = alunos;

    }

    public List<Aluno> getAlunos(){

        return alunos;

    }


    public void adicionarAlunos(Aluno aluno){

        alunos.add(aluno);

    }

    @Override
    public String toString() {
        return "Turma{" +
                "Turma ='" + serieTurma + '\'' +
                ", professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }
}

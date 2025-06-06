package Atividade9.application;

import Atividade9.model.Aluno;
import Atividade9.model.Professor;
import Atividade9.model.Turma;
import Atividade9.service.CadastroTurma;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Professor professor = new Professor("Edson", "Psicologia", "010");
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(new Aluno("Pedro", 19, "024"));
        alunos.add(new Aluno("Edson", 20, "014"));
        alunos.add(new Aluno("Guigui", 19, "666"));
        alunos.add(new Aluno("Pastor", 19, "013"));

        CadastroTurma cadastroTurma = new CadastroTurma();
        Turma turma = cadastroTurma.criarTurma("segunda serie", professor, alunos);

        System.out.println(turma);


        
    }
    
}

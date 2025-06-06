package Atividade9.service;

import java.util.ArrayList;
import java.util.List;

import Atividade9.model.Aluno;
import Atividade9.model.Professor;
import Atividade9.model.Turma;

public class CadastroTurma {

    public Turma criarTurma(String serieTurma, Professor professor, List<Aluno> alunos){

        Turma novaTurma = new Turma(serieTurma, professor, alunos);
        return novaTurma;

    }



}

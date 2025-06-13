package atividade11.relacionamentos.agregacao;

import java.util.List;

public class Departamento {
    private String nome;
    private List<Professor> professores;

    public Departamento(String nome, List<Professor> professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void listarProfessores() {
        System.out.println("Professores do departamento " + nome + ":");
        for (Professor p : professores) {
            System.out.println("- " + p.getNome());
        }
    }
}

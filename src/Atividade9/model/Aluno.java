package Atividade9.model;

import java.util.List;

public class Aluno {

    public String nome;
    public int idade;
    public String matricula;

    public Aluno(String nome, int idade, String matricula){

        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;

    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nMatricula: " + matricula;
    }
}

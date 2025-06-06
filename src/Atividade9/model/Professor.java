package Atividade9.model;

public class Professor {

    public String nome;
    public String materia;
    public String cadastro;

    public Professor(String nome, String materia, String cadastro){

        this.nome = nome;
        this.materia = materia;
        this.cadastro = cadastro;

    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", materia='" + materia + '\'' +
                ", cadastro=" + cadastro +
                '}';
    }
}
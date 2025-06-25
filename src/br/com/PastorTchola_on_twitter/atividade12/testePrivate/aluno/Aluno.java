package br.com.PastorTchola_on_twitter.atividade12.testePrivate.aluno;

public class Aluno {
    private String nome;
    private String semestre;
    private int idade;

    public Aluno(String nome, String semestre, int idade){

        this.nome = nome;
        this.semestre = semestre;
        this.idade = idade;

    }

    public String getNome(){
        return nome;
    }
    public String getSemestre(){
        return semestre;
    }
    public int getIdade(){
        return idade;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
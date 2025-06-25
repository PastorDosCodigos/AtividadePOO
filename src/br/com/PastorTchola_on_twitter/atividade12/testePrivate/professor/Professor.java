package br.com.PastorTchola_on_twitter.atividade12.testePrivate.professor;

public class Professor {
    private String nome;
    private String disciplina;
    private int idade;

    public Professor(String nome, String disciplina, int idade){

        this.nome = nome;
        this.disciplina = disciplina;
        this.idade = idade;

    }

    public String getNome(){
        return nome;
    }
    public String getDisciplina(){
        return disciplina;
    }
    public int getIdade(){
        return idade;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

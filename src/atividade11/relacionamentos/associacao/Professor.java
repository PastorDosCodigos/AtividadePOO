package atividade11.relacionamentos.associacao;

public class Professor {
    private String nome;

    public Professor(String nome){

        this.nome = nome;

    }

    public void lecionar(Disciplina disciplina) {
        System.out.println(nome + " está lecionando " + disciplina.getNome());
    }

    public String getNome() {
        return nome;
    }

}

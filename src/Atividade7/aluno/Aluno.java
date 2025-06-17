package Atividade7.aluno;

public class Aluno {
    private String serie;
    private String nome;
    private int idade;

    public Aluno() {
        this("Sem série", "Sem nome", 0);
    }

    public Aluno(String serie, String nome, int idade) {
        this.serie = serie;
        this.nome  = nome;
        this.idade = idade;
    }

    public Aluno(String serie, String nome, int idade, boolean validarIdade) {
        this.serie = serie;
        this.nome  = nome;
        this.idade = (validarIdade && idade < 0) ? 0 : idade;
    }

    public void estudar() { System.out.println(nome + " estudando..."); }
    public void comer()   { System.out.println(nome + " comendo..."); }
    public void dormir()  { System.out.println(nome + " dormindo..."); }

    @Override
    public String toString() {
        return String.format("Aluno[nome = %s, série = %s, idade = %d]", nome, serie, idade);
    }
}

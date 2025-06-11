package atividade10;

public class Personagem {
    private String nome;
    private Equipamento equipamento;

    public Personagem(String nome, Equipamento equipamento){

        this.nome = nome;
        this.equipamento = equipamento;

    }

    public String descricao(){

        return "Personagem: " + nome + "\n" + equipamento.descricao();

    }


}

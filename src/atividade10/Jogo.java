package atividade10;
import java.util.ArrayList;

public class Jogo {
    private String nome;
    private ArrayList<Personagem> personagens;

    public Jogo(String nome) {

        this.nome = nome;
        this.personagens = new ArrayList<>();

    }

    public void addPersonagem(Personagem personagem) {

        personagens.add(personagem);

    }

    public void exibirPersonagens() {
        System.out.println("Jogo: " + nome);
        System.out.println("Personagens Cadastrados: ");
        for (Personagem p : personagens) {
            System.out.println(p.descricao());
            System.out.println("-----------------------------");
        }
    }
}

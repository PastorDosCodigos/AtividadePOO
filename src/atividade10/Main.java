package atividade10;

public class Main {
    public static void main(String[] args) {

        Jogo jogo = new Jogo("GTA 6");

        Personagem p1 = new Personagem("Jason", new Equipamento("AK47", "Colete nivel 1"));
        Personagem p2 = new Personagem("Lucia", new Equipamento("Desert Eagle", "Colete nivel 1"));
        Personagem p3 = new Personagem("Pastor", new Equipamento("Bastão", "Camisa do Vozão"));

        jogo.addPersonagem(p1);
        jogo.addPersonagem(p2);
        jogo.addPersonagem(p3);

        jogo.exibirPersonagens();
    }
}
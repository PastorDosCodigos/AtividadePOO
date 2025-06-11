package atividade10;

public class Equipamento {
    private String arma;
    private String armadura;

    public Equipamento(String arma, String armadura){

        this.arma = arma;
        this.armadura = armadura;

    }

    public String descricao(){

        return "Arma: " + arma + ", Armadura: " + armadura;

    }




}

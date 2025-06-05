import java.sql.SQLOutput;
import java.util.ArrayList;

public class Aluno {

    String nome;
    String serie;
    ArrayList<Double> notas = new ArrayList<>();


    public Aluno(String nome, String serie){

        this.nome = nome;
        this.serie = serie;

    }


    public void adicionarNotas (double nota){

        notas.add(nota);

    }




    public double media (){

        double soma = 0;

        for (double nota: notas){

            soma += nota;

        }
        double totalmedia = soma/notas.size();

        return(totalmedia);

    }

    public void informacoes(){

        System.out.println("Nome: " + nome);
        System.out.println("Serie: " + serie);
        System.out.println("Notas: " + notas);
        System.out.println("Media: " + media());

    }

}

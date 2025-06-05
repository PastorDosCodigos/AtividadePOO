package atividade4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Coloque o nome do aluno: ");
        String nome = ler.nextLine();
        System.out.println("Coloque a serie do aluno: ");
        String serie = ler.nextLine();
        System.out.println("Quantas notas o aluno possue?");
        int n = ler.nextInt();

        Aluno aluno = new Aluno(nome, serie);

        for(int i = 1; i <= n; i++ ){

            System.out.printf("Digite a nota %d\n", i);
            double nota = ler.nextDouble();
            aluno.adicionarNotas(nota);

        }
        aluno.informacoes();
        }
    }

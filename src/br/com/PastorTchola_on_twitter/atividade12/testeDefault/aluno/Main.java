package br.com.PastorTchola_on_twitter.atividade12.testeDefault.aluno;

import br.com.PastorTchola_on_twitter.atividade12.testeDefault.professor.Professor;

public class Main {
    public static void main(String[] args){

        Aluno a1 = new Aluno();
        a1.nome = "guigui";
        a1.semestre = "segundo semestre";
        a1.idade = 19;

        Professor p1 = new Professor();
        //p1.nome = "rebeca";
        //p1.disciplina = "POO";
        //p1.idade = 00;

        //Não funciona, pois os atributos da classe professor estão
        //encapsulados como default, o que permite o acesso apenas as classes de mesmo pacote.

    }
}

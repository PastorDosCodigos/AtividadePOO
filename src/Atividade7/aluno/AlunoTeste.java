package Atividade7.aluno;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno("3º Ano", "Lucas", 17);
        Aluno a3 = new Aluno("2º Semestre", "GuiGui", -4, true);

        for (Aluno a : new Aluno[]{a1,a2,a3}) {
            System.out.println(a);
            a.estudar();
            a.comer();
            a.dormir();
            System.out.println();
        }
    }
}

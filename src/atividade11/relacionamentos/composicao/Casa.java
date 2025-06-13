package atividade11.relacionamentos.composicao;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String endereco;
    private List<Comodo> comodos;

    public Casa(String endereco) {
        this.endereco = endereco;
        this.comodos = new ArrayList<>();
        criarComodos();
    }

    private void criarComodos() {
        comodos.add(new Comodo("Sala"));
        comodos.add(new Comodo("Cozinha"));
    }

    public void mostrarComodos() {
        System.out.println("Cômodos da casa no endereço: " + endereco);
        for (Comodo c : comodos) {
            System.out.println("- " + c.getNome());
        }
    }
}

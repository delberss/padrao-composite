package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends ItemArquivo {

    private List<ItemArquivo> itens;

    public Pasta(String nome) {
        super(nome);
        this.itens = new ArrayList<ItemArquivo>();
    }

    public void adicionarItem(ItemArquivo item) {
        this.itens.add(item);
    }

    public String getDetalhes() {
        String saida = "Pasta: " + this.getNome() + "\n";
        for (ItemArquivo item : itens) {
            saida += "  " + item.getDetalhes() + "\n";
        }
        return saida;
    }
}

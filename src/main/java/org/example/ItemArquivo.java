package org.example;

public abstract class ItemArquivo {

    private String nome;

    public ItemArquivo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getDetalhes();
}

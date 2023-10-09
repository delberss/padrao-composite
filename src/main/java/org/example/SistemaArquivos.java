package org.example;

public class SistemaArquivos {

    private ItemArquivo raiz;

    public void setRaiz(ItemArquivo raiz) {
        this.raiz = raiz;
    }

    public String getDetalhesSistema() {
        if (this.raiz == null) {
            throw new NullPointerException("Sistema de arquivos sem item raiz");
        }
        return this.raiz.getDetalhes();
    }
}
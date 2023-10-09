package org.example;

public class Arquivo extends ItemArquivo {

    private double tamanho; // tamanho em KB

    public Arquivo(String nome, double tamanho) {
        super(nome);
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getDetalhes() {
        return "Arquivo: " + this.getNome() + " - Tamanho: " + this.tamanho + "KB";
    }
}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaArquivosTest {
    @Test
    void deveRetornarDetalhesSistemaArquivos() {
        Pasta pastaRaiz = new Pasta("Documentos");

        Arquivo arquivo1 = new Arquivo("Anotacoes.docx", 500.0);
        pastaRaiz.adicionarItem(arquivo1);

        Pasta subPasta = new Pasta("Registros");
        Arquivo registro1 = new Arquivo("registro1.pdf", 2000.0);
        Arquivo registro2 = new Arquivo("registro2.pdf", 2500.0);
        subPasta.adicionarItem(registro1);
        subPasta.adicionarItem(registro2);
        pastaRaiz.adicionarItem(subPasta);

        SistemaArquivos sistema = new SistemaArquivos();
        sistema.setRaiz(pastaRaiz);

        assertEquals("Pasta: Documentos\n" +
                "  Arquivo: Anotacoes.docx - Tamanho: 500.0KB\n" +
                "  Pasta: Registros\n" +
                "  Arquivo: registro1.pdf - Tamanho: 2000.0KB\n" +
                "  Arquivo: registro2.pdf - Tamanho: 2500.0KB\n\n", sistema.getDetalhesSistema());
    }

    @Test
    void deveRetornarExcecaoSistemaSemItemRaiz() {
        try {
            SistemaArquivos sistema = new SistemaArquivos();
            sistema.getDetalhesSistema();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sistema de arquivos sem item raiz", e.getMessage());
        }
    }
}
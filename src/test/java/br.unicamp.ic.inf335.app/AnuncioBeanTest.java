package br.unicamp.ic.inf335.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AnuncioBeanTest {

    private ProdutoBean produto = new ProdutoBean("001", "Produto 1", "Jaqueta", 100.00, "Novo");
    private ArrayList<URL> fotosUrl;
    private AnuncioBean anuncio = new AnuncioBean(produto, fotosUrl, 0.10 );

    @Test
    @DisplayName("Deve retornar o valor do produto com desconto")
    public void getValor() {
        double expectedValue = (1-anuncio.getDesconto())*produto.getValor();
        assertEquals(expectedValue, anuncio.getValor());
    }
}
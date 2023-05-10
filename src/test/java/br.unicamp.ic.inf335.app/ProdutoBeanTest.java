package br.unicamp.ic.inf335.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoBeanTest {
    private ProdutoBean produto1 = new ProdutoBean("001", "Produto 1", "Jaqueta", 100.00, "Novo");
    private ProdutoBean produto2 = new ProdutoBean("002", "Produto 2", "Saia", 50.00, "Novo");
    private ProdutoBean produto3 = new ProdutoBean("003", "Produto 3", "Calça", 50.00, "Usado");


    @Test
    @DisplayName("Se o valor do produto for maior do que o comparado, deve retornar 1")
    public void produtoComMaiorValorQueOComparado() {
        assertEquals(1, produto1.compareTo(produto2));
    }

    @Test
    @DisplayName("Se o valor do produto for menor do que o comparado, deve retornar -1")
    public void produtoComMenorValorQueOComparado() {
        assertEquals(-1, produto2.compareTo(produto1));
    }

    @Test
    @DisplayName("Se o valor do produto for o mesmo do que o comparado, deve retornar 0")
    public void produtoComOMesmoValorQueOComparado() {
        assertEquals(0, produto2.compareTo(produto3));
    }
}
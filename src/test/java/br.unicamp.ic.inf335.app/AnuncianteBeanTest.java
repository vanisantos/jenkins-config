package br.unicamp.ic.inf335.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AnuncianteBeanTest {
    private ArrayList<URL> fotosUrl = new ArrayList();
    private ProdutoBean produto = new ProdutoBean("001", "Produto 1", "Jaqueta", 100.00, "Novo");
    private AnuncioBean anuncio1 = new AnuncioBean(produto, fotosUrl, 0.10 );
    private AnuncioBean anuncio2 = new AnuncioBean(produto, fotosUrl, 0.20 );
    private ArrayList<AnuncioBean> anuncios = new ArrayList();
    private AnuncianteBean anunciante = new AnuncianteBean("Joselito", "111.111.111-11", anuncios);

    @BeforeEach
    public void setupBeforeClass() {
        anuncios.add(anuncio1);
        anuncios.add(anuncio2);
    }

    @Test
    @DisplayName("Deve adicionar o anuncio a lista de anuncios")
    public void addAnuncio() {
        assertEquals(2,anuncios.size());
        anunciante.addAnuncio(anuncio1);
        assertEquals(3,anuncios.size());
    }

    @Test
    @DisplayName("Deve remover o anuncio a lista de anuncios")
    public void removeAnuncio() {
        assertEquals(2,anuncios.size());
        anunciante.removeAnuncio(1);
        assertEquals(1,anuncios.size());
    }

    @Test
    @DisplayName("Deve retornar a média dos valores dos anúncios")
    public void valorMedioAnuncios() {
        Double expectedValue = (anuncio1.getValor()+anuncio2.getValor())/anuncios.size();
        assertEquals(expectedValue, anunciante.valorMedioAnuncios());
    }
}
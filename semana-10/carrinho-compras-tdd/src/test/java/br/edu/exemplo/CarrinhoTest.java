package br.edu.exemplo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarrinhoTest {

    @Test
    void carrinhoVazioTemTotalZero() {
        assertEquals(new BigDecimal("0.00"), new Carrinho().getTotal());
    }

    @Test
    void deveAdicionarUmProduto() {
        Carrinho carrinho = new Carrinho();

        carrinho.adicionar(new Produto("Teclado", 100.00));

        assertEquals(new BigDecimal("100.00"), carrinho.getTotal());
    }

    @Test
    void deveSomarPrecosDeVariosProdutos() {
        Carrinho carrinho = new Carrinho();

        carrinho.adicionar(new Produto("Teclado", 100.00));
        carrinho.adicionar(new Produto("Mouse", 50.00));

        assertEquals(new BigDecimal("150.00"), carrinho.getTotal());
    }

    @Test
    void deveRemoverProdutoERecalcularTotal() {
        Carrinho carrinho = new Carrinho();
        Produto mouse = new Produto("Mouse", 50.00);
        carrinho.adicionar(new Produto("Teclado", 100.00));
        carrinho.adicionar(mouse);

        carrinho.remover(mouse);

        assertEquals(new BigDecimal("100.00"), carrinho.getTotal());
    }

    @Test
    void deveRecusarPrecoNegativoSemModificarCarrinho() {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(new Produto("Mouse", 50.00));

        assertThrows(IllegalArgumentException.class,
                () -> carrinho.adicionar(new Produto("Teclado", -100.00)));
        assertEquals(new BigDecimal("50.00"), carrinho.getTotal());
    }

    @Test
    void deveRecusarPrecosNaoFinitos() {
        Carrinho carrinho = new Carrinho();

        assertThrows(IllegalArgumentException.class,
                () -> carrinho.adicionar(new Produto("Inválido", Double.NaN)));
        assertThrows(IllegalArgumentException.class,
                () -> carrinho.adicionar(new Produto("Inválido", Double.POSITIVE_INFINITY)));
        assertEquals(new BigDecimal("0.00"), carrinho.getTotal());
    }

    @Test
    void permiteProdutoGratuito() {
        Carrinho carrinho = new Carrinho();
        Produto brinde = new Produto("Brinde", 0);

        carrinho.adicionar(brinde);

        assertEquals("Brinde", brinde.getNome());
        assertEquals(new BigDecimal("0.00"), carrinho.getTotal());
    }

    @ParameterizedTest
    @CsvSource({
            "499.99, 499.99",
            "500.00, 450.00",
            "500.01, 450.01",
            "600.00, 540.00"
    })
    void aplicaDescontoDeDezPorCentoAPartirDeQuinhentos(double subtotal, String esperado) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(new Produto("Teclado", 100.00));
        carrinho.adicionar(new Produto("Monitor", subtotal - 100.00));

        assertEquals(new BigDecimal(esperado), carrinho.getTotal());
    }
}

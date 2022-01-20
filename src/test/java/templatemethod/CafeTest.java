package templatemethod;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {
    @Test
    void deveRetornarCafe() {
        Cafe cafe = new Cafe();
        assertEquals("Café", cafe.getTipoBebida());
    }

    @Test
    void deveRetornarPreparoCafe() {
        Cafe cafe = new Cafe();
        assertEquals("Preparo do café", cafe.preparo());
    }

    @Test
    void deveRetornarIngredientesParaCafe() {
        Cafe cafe = new Cafe();
        assertEquals(Arrays.asList("3 xícaras de água",
                "3 colheres (sopa) cheias de açúcar",
                "3 colheres (sopa) de pó de café",
                "1 filtro de papel")
        , cafe.ingredientes());
    }

    @Test
    void deveRetornarReceitaParaCafe() {
        Cafe cafe = new Cafe();
        assertEquals("Café\n" +
                "3 xícaras de água\n" +
                "3 colheres (sopa) cheias de açúcar\n" +
                "3 colheres (sopa) de pó de café\n" +
                "1 filtro de papel\n" +
                "Preparo do café"
        , cafe.receita());
    }
}
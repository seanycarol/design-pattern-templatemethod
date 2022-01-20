package templatemethod;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ChaTest {
    @Test
    void deveRetornarCha() {
        Cha cha = new Cha();
        assertEquals("Chá", cha.getTipoBebida());
    }

    @Test
    void deveRetornarPreparoCha() {
        Cha cha = new Cha();
        assertEquals("Preparo do chá", cha.preparo());
    }

    @Test
    void deveRetornarIngredientesParaCha() {
        Cha cha = new Cha();
        assertEquals(Arrays.asList("2 colheres (sopa) de chá mate",
                "6 colheres (sopa) de açúcar",
                "1l de água")
        , cha.ingredientes());
    }

    @Test
    void deveRetornarReceitaParaCha() {
        Cha cha = new Cha();
        assertEquals("Chá\n" +
                "2 colheres (sopa) de chá mate\n" +
                "6 colheres (sopa) de açúcar\n" +
                "1l de água\n" +
                "Preparo do chá"
        , cha.receita());
    }
}
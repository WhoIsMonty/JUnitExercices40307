import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    Calculator calc;
    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("Teste Soma")
    public void testSoma() {
        int soma = calc.soma(1, 2);
        assertEquals(3, soma, "Soma errada");
    }

    @Test
    @DisplayName("Teste Diferença")
    public void testDiff() {
        int dif = calc.dif(1, 2);
        assertEquals(-1, dif, "Diferença errada");
        int result = -1;
        assertTrue(result==dif, "Diferença errada");
    }

    @Test
    @DisplayName("Teste Multiplicação")
    @Disabled
    public void testMult() {
        int mult = calc.mult(2, 2);
        assertEquals(4, mult, "Multiplicação errada");
    }

    @Test
    @DisplayName("Teste Divisão")
    public void testDiv() {
        int div = calc.div(4, 2);
        assertEquals(2, div, "Divisão errada");
    }

}

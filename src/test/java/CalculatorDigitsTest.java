import org.example.CalculatorDigits;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorDigitsTest {
    CalculatorDigits calc;
    @BeforeEach
    public void setUp() {
        calc = new CalculatorDigits();
    }

    @Test
    @DisplayName("Teste Média")
    public void testAvgDigits() {
        double avg = calc.avgDigits(123);
        assertEquals(2, avg, "Caso 1: Média errada");
        avg = calc.avgDigits(1234);
        assertEquals(2.5, avg, "Caso 2: Média errada");
        avg = calc.avgDigits(12345);
        assertEquals(3, avg, "Caso 3: Média errada");
    }
}

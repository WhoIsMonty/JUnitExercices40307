import org.example.CalculatorGeometry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorGeometryTest {
    CalculatorGeometry calc;
    @BeforeEach
    public void setUp() {
        calc = new CalculatorGeometry();
    }

    @Test
    @DisplayName("Teste Area")
    public void testArea() {
        int area = calc.area(3, 5);
        assertEquals(15, area, "Caso 1: Area errada");
        area = calc.area(5, 8);
        assertEquals(40, area, "Caso 2: Area errada");
        area = calc.area(2, 4);
        assertEquals(8, area, "Caso 3: Area errada");
    }

    @Test
    @DisplayName("Teste Perímetro")
    public void testPerimetro() {
        int perimetro = calc.perimetro(3, 5);
        assertEquals(16, perimetro, "Caso 1: Perimetro errado");
        perimetro = calc.perimetro(5, 8);
        assertEquals(26, perimetro, "Caso 2: Perimetro errado");
        perimetro = calc.perimetro(2, 4);
        assertEquals(12, perimetro, "Caso 3: Perimetro errado");
    }

    @Test
    @DisplayName("Teste Triângulo")
    public void testIsTriangle() {
        int isTriangle = calc.isTriangle(5, 2, 2);
        assertEquals(0, isTriangle, "Caso 1: Verificação de Triângulo Errada");
        isTriangle = calc.isTriangle(2, 2, 3);
        assertEquals(1, isTriangle, "Caso 2: Verificação de Triângulo Errada");
    }

}

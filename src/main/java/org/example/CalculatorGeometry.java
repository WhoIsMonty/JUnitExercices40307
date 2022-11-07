package org.example;

public class CalculatorGeometry {

    public int area(int base, int altura) {
        return base * altura;
    }

    public int perimetro(int base, int altura) {
        return 2 * (base + altura);
    }

    public int isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return 1;
        } else {
            return 0;
        }
    }
}

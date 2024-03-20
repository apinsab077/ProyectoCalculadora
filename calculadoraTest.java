import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void testSuma() {
        Calculadora calculadora = new Calculadora(5, 3);
        int resultado = calculadora.suma();
        assertEquals(8, resultado);
    }
    
    @Test
    void testResta() {
        Calculadora calculadora = new Calculadora(5, 3);
        int resultado = calculadora.resta();
        assertEquals(2, resultado);
    }
    
    @Test
    void testMultiplicacion() {
        Calculadora calculadora = new Calculadora(5, 3);
        int resultado = calculadora.multiplicacion();
        assertEquals(15, resultado);
    }
    
    @Test
    void testDivision() {
        Calculadora calculadora = new Calculadora(10, 2);
        double resultado = calculadora.division();
        assertEquals(5.0, resultado);
    }
    
    @Test
    void testDivisionByZero() {
        Calculadora calculadora = new Calculadora(10, 0);
        double resultado = calculadora.division();
        assertEquals(0.0, resultado);
    }
    
    @Test
    void testModulo() {
        Calculadora calculadora = new Calculadora(10, 3);
        double resultado = calculadora.modulo();
        assertEquals(1.0, resultado);
    }
    
    @Test
    void testModuloByZero() {
        Calculadora calculadora = new Calculadora(10, 0);
        double resultado = calculadora.modulo();
        assertEquals(0.0, resultado);
    }
}
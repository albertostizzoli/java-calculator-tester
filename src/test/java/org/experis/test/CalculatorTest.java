package org.experis.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        // inizializzo un nuovo oggetto Calculator con valori predefiniti
        calculator = new Calculator(0.0f, 0.0f);
    }

    @Test
    // Questo test ha un nome descrittivo che verrà visualizzato nell'output dei test
    @DisplayName("Test Addizione")
    public void testAdd(){
        // eseguo l'operazione di addizione
        float result = calculator.add(3.3f, 2.3f);
        float result2 = calculator.add(2.8f, 3.4f);
        // verifico  il risultato dell'operazione
        assertEquals(5.6f, result);
        assertEquals(6.2f, result2);
    }

    @Test
    @DisplayName("Test Sottrazione")
    public void testSubtract(){
        float result = calculator.subtract(3.0f, 2.0f);
        float result2 = calculator.subtract(7.5f, 3.4f);
        assertEquals(1.0f, result);
        assertEquals(4.1f, result2);
    }

    @Test
    @DisplayName("Test Moltiplicazione")
    public void testMultiply(){
        float result = calculator.multiply(3.0f, 3.0f);
        float result2 = calculator.multiply(8.0f, 4.0f);
        assertEquals(9.0f, result);
        assertEquals(32.0, result2);
    }

    @Test
    @DisplayName("Test Divisione")
    public void testDivide(){
        float result = calculator.divide(6.0f, 3.0f);
        float result2 = calculator.divide(10.0f, 2.0f);
        assertEquals(2.0f, result);
        assertEquals(5.0f, result2);
    }

    @Test
    @DisplayName("Test Divisione Per Zero")
    public void testDivideByZero(){
        // verifico se viene sollevata un'eccezione quando si cerca di dividere per zero
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5.0f, 0.0f));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(7.0f, 0.0f));
    }
}


package pro.sky.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.Calculator.exceptions.DivideByZeroException;
import pro.sky.Calculator.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testPlus() {
        int num1 = 10;
        int num2 = 10;
        int expected = 20;
        assertEquals(calculatorService.plus(num1, num2), expected);

        num1 = 13;
        num2 = 12;
        expected = 25;
        assertEquals(calculatorService.plus(num1, num2), expected);
    }

    @Test
    void testMinus() {
        int num1 = 15;
        int num2 = 10;
        int expected = 5;
        assertEquals(calculatorService.minus(num1, num2), expected);
        num1 = 13;
        num2 = 12;
        expected = 1;
        assertEquals(calculatorService.minus(num1, num2), expected);
    }

    @Test
    void testMultiply() {
        int num1 = 10;
        int num2 = 10;
        int expected = 100;
        assertEquals(calculatorService.multiply(num1, num2), expected);

        num1 = 20;
        num2 = 20;
        expected = 400;
        assertEquals(calculatorService.multiply(num1, num2), expected);
    }

    @Test
    void testDivide() {
        int num1 = 100;
        int num2 = 10;
        int expected = 10;
        assertEquals(calculatorService.divide(num1, num2), expected);

        num1 = 222;
        num2 = 2;
        expected = 111;
        assertEquals(calculatorService.divide(num1, num2), expected);
    }

    @Test
    void testDivideByZero() {
        assertThrows(DivideByZeroException.class, () -> calculatorService.divide(10, 0));
    }


}

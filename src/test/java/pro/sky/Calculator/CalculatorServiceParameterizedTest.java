package pro.sky.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.Calculator.exceptions.DivideByZeroException;
import pro.sky.Calculator.service.CalculatorService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParameterizedTest {
    private final CalculatorService calculatorService = new CalculatorService();
    @ParameterizedTest
    @MethodSource("provideParamsForPlus")
    void plusTest (int num1, int num2, int expected){
        assertEquals(calculatorService.plus(num1,num2),expected);

    }
    static Stream<Arguments> provideParamsForPlus(){
        return Stream.of(
                Arguments.of(10,10,20),
                Arguments.of(15,15,30),
                Arguments.of(10,5,15)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMinus")
    void minusTest (int num1, int num2, int expected){
        assertEquals(calculatorService.minus(num1,num2),expected);

    }
    static Stream<Arguments> provideParamsForMinus(){
        return Stream.of(
                Arguments.of(10,10,0),
                Arguments.of(15,15,0),
                Arguments.of(10,5,5)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMultiply")
    void multiplyTest (int num1, int num2, int expected){
        assertEquals(calculatorService.multiply(num1,num2),expected);

    }
    static Stream<Arguments> provideParamsForMultiply(){
        return Stream.of(
                Arguments.of(5,5,25),
                Arguments.of(2,2,4),
                Arguments.of(6,6,36)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForDivide")
    void divideTest (int num1, int num2, int expected){
        assertEquals(calculatorService.divide(num1,num2),expected);

    }
    static Stream<Arguments> provideParamsForDivide(){
        return Stream.of(
                Arguments.of(5,5,1),
                Arguments.of(8,2,4),
                Arguments.of(66,6,11)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForDivideByZero")
    void divideByZeroTest (int num1, int num2){
        assertThrows(DivideByZeroException.class, () -> calculatorService.divide(num1,num2));

    }
    static Stream<Arguments> provideParamsForDivideByZero(){
        return Stream.of(
                Arguments.of(5,0),
                Arguments.of(8,0)

        );
    }
}

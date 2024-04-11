package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String welcomeCalculator() {
        return "<i>Добро пожаловать в калькулятор!</i>";
    }

    public int plus(int num1, int num2) {
        return num1 + num2;

    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;

    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
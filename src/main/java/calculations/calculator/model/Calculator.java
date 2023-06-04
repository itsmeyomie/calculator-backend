/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculations.calculator.model;

import java.io.IOException;

/**
 *
 * @author yomie
 */
public class Calculator {

    private static Calculator instance;

    private Calculator() {
    }

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    public int add(int one, int two) {
        return one + two;
    }

    public int subtract(int one, int two) {
        return one - two;
    }

    public int multiply(int one, int two) {
        return one * two;
    }

    public int divide(int one, int two) throws IOException {
        if (two == 0) {
            throw new IOException("You cannot divide by Zero");
        }
        return one / two;

    }
}

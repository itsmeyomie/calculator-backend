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

    private int one;
    private int two;

    public Calculator(int one, int two) {
        this.one = one;
        this.two = two;
    }

    public Calculator() {
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int add() {
        return this.one + this.two;
    }

    public int subtract() {
        return this.one - this.two;
    }

    public int multiply() {
        return this.one * this.two;
    }

    public int divide() throws IOException {
        if (this.two == 0) {
            throw new IOException("You cannot divide by Zero");
        }
        return this.one /this.two;

    }
}

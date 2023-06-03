/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculations.calculator.controller;

import calculations.calculator.model.Calculator;
import java.io.IOException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    Calculator calc = new Calculator();

    @GetMapping("/add")
    public int add(@RequestParam int numOne, @RequestParam int numTwo) {
        calc.setOne(numOne);
        calc.setTwo(numTwo);
        return calc.add();
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int numOne, @RequestParam int numTwo) {
        calc.setOne(numOne);
        calc.setTwo(numTwo);
        return calc.subtract();
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int numOne, @RequestParam int numTwo) {
        calc.setOne(numOne);
        calc.setTwo(numTwo);
        return calc.multiply();
    }

    @GetMapping("/divide")
    public int divide(@RequestParam int numOne, @RequestParam int numTwo) throws IOException {
        calc.setOne(numOne);
        calc.setTwo(numTwo);
        return calc.divide();
    }

}

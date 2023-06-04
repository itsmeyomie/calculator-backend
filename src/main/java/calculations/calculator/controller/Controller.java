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

    Calculator calc=Calculator.getInstance();
    
     

    @GetMapping("/add")
    public int add(@RequestParam int numOne, @RequestParam int numTwo) {
       
        return calc.add(numOne, numTwo);
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int numOne, @RequestParam int numTwo) {
        return calc.subtract(numOne, numTwo);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int numOne, @RequestParam int numTwo) {
        return calc.multiply(numOne, numTwo);
    }

    @GetMapping("/divide")
    public float divide(@RequestParam int numOne, @RequestParam int numTwo) throws IOException {
        return  calc.divide(numOne, numTwo);
    }

}

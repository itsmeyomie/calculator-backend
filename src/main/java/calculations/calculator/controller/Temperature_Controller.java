/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculations.calculator.controller;

import calculations.calculator.model.TemperatureConverter;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@CrossOrigin()
@RestController

public class Temperature_Controller {

    TemperatureConverter temperatureConverter = TemperatureConverter.temperatureInstance();

    @GetMapping("/value")
    public double c2f(@RequestParam int value) {

        return temperatureConverter.c2f(value);
    }

}

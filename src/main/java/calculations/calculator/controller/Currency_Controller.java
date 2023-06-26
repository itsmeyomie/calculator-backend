/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculations.calculator.controller;

import calculations.calculator.model.CurrencyConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@CrossOrigin()
@RestController

public class Currency_Controller {
    
  CurrencyConverter currencyConverter=CurrencyConverter.currencyInstance();
  
  @GetMapping("/currency")
  public double convertCurrency(@RequestParam int currency){
   return currencyConverter.convert_usd_to_ksh(currency);
  }
  
    
}

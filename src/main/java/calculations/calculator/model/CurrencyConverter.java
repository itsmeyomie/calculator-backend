/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculations.calculator.model;

/**
 *
 * @author yomie
 */
public class CurrencyConverter {

    private static CurrencyConverter instance;

    public int convert_usd_to_ksh(int currency) {

        return currency * 140;
    }

    private CurrencyConverter() {
    }

   public static CurrencyConverter currencyInstance() {
     if(instance==null){
     instance=new CurrencyConverter();
     }
     return instance;
    }

}

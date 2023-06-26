/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculations.calculator.model;

/**
 *
 * @author yomie
 */
public class TemperatureConverter {

     private static TemperatureConverter instance;

    public double c2f(int value) {
        return value * 1.8 + 32;
    }

    private TemperatureConverter() {
    }

   public  static TemperatureConverter temperatureInstance() {
        if (instance == null) {
            return instance = new TemperatureConverter();
        }
        return instance;
    }

}

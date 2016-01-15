/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.converter;
import javax.swing.JOptionPane;
/**
 *
 * @author Michael
 */
public class TemperatureConverter {    
    public static void main(String[] args) {
        TemperatureConverter TC = new TemperatureConverter();
        for(;;)
        {
            String Temp1 = JOptionPane.showInputDialog("What temperature are you converting from: Celsius, Fahrenheit, or Kelvins?");
            String Temp2 = JOptionPane.showInputDialog("What temperature are you converting to: Celsius, Fahrenheit, or Kelvins?");

            if(Temp1.equalsIgnoreCase("Celsius") && Temp2.equalsIgnoreCase("Fahrenheit"))
            {
                TC.CelsiusToFahrenheit();
            }
            else if(Temp1.equalsIgnoreCase("Fahrenheit") && Temp2.equalsIgnoreCase("Celsius"))
            {
                TC.FahrenheitToCelsius();
            }
            else if(Temp1.equalsIgnoreCase("Celsius") && Temp2.equalsIgnoreCase("Kelvins"))
            {
                TC.CelsiusToKelvins();
            }
            else if(Temp1.equalsIgnoreCase("Fahrenheit") && Temp2.equalsIgnoreCase("Kelvins"))
            {
                TC.FahrenheitToKelvins();
            }
            else if(Temp1.equalsIgnoreCase("Kelvins") && Temp2.equalsIgnoreCase("Fahrenheit"))
            {
                TC.KelvinsToFahrenheit();
            }
            else if(Temp1.equalsIgnoreCase("Kelvins") && Temp2.equalsIgnoreCase("Celsius"))
            {
                TC.KelvinsToCelsius();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "One or more entries is invalid");
            }
        }
    }
    
    void FahrenheitToCelsius()
    {     
       String Fahrenheit = JOptionPane.showInputDialog("Enter temperature in Fahrenheit");
       
       double doubleFahrenheit = Double.parseDouble(Fahrenheit);
       
       double Celsius = (doubleFahrenheit -32) * 5/9;
       
       JOptionPane.showMessageDialog(null, doubleFahrenheit + " degrees Fahrenheit is " + Celsius + " degrees Celsius");
    }
    
    void CelsiusToFahrenheit()
    {
       String Celsius = JOptionPane.showInputDialog("Enter temperature in Celsius");
        
       double doubleCelsius = Double.parseDouble(Celsius);
       
       double Fahrenheit = doubleCelsius * 9/5 + 32;
       
       JOptionPane.showMessageDialog(null, doubleCelsius + " degrees Celsius is " + Fahrenheit + " degrees Fahrenheit");
    }
    
    void CelsiusToKelvins()
    {
       String Celsius = JOptionPane.showInputDialog("Enter temperature in Celsius");
        
       double doubleCelsius = Double.parseDouble(Celsius);
       
       double Kelvins = doubleCelsius + 273.15;
       
       JOptionPane.showMessageDialog(null, doubleCelsius + " degrees Celsius is " + Kelvins + " degrees Kelvins");
    }
    
    void FahrenheitToKelvins()
    {
       String Fahrenheit = JOptionPane.showInputDialog("Enter temperature in Fahrenheit");
       
       double doubleFahrenheit = Double.parseDouble(Fahrenheit);
       
       double Kelvins = (doubleFahrenheit + 459.67) * 5/9;
       
       JOptionPane.showMessageDialog(null, doubleFahrenheit + " degrees Fahrenheit is " + Kelvins + " degrees Kelvins");
    }
    
    void KelvinsToFahrenheit()
    {
       String Kelvins = JOptionPane.showInputDialog("Enter temperature in Kelvins");
        
       double doubleKelvins = Double.parseDouble(Kelvins);
       
       double Fahrenheit = doubleKelvins * 9/5 - 459.67;
       
       JOptionPane.showMessageDialog(null, doubleKelvins + " degrees Kelvins is " + Fahrenheit + " degrees Fahrenheit");
    }
    
    void KelvinsToCelsius()
    {
       String Kelvins = JOptionPane.showInputDialog("Enter temperature in Kelvins");
        
       double doubleKelvins = Double.parseDouble(Kelvins);
       
       double Celsius = doubleKelvins - 273.15;
       
       JOptionPane.showMessageDialog(null, doubleKelvins + " degrees Kelvins is " + Celsius + " degrees Celsius");
    }
}
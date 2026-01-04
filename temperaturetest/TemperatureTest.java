
package temperaturetest;

import java.util.Scanner;

/**
 *
 * @author Ranim
 */
public class TemperatureTest {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Temperature temp = new Temperature();

        System.out.print("Enter the Fahrenheit temperature :");
        temp.setFahrenheit(input.nextDouble());
        
        System.out.printf("The temperature in Celsius = %.3f .\n", temp.getCelsius());
        System.out.printf("The temperature in Kelvin = %.3f .\n", temp.getKelvin());

        
    }
    
}

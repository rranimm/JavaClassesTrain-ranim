
package temperaturetest;

/**
 *
 * @author Ranim
 */
public class Temperature {
    //fields 
    private double ftemp;
    
    // constructors 
    public Temperature(double fte){
        ftemp = fte;
    }
     public Temperature(){
        ftemp = 0;
    }
    
     // mutators
     public void setFahrenheit(double fte){
         ftemp = fte;
     }
     
     // accessors 
     // Returns the value of the ftemp field, as a Fahrenheit temperature
     public double getFahrenheit(){
         return ftemp;
     }
     // requierd methods
     // Returns the value of the ftemp field converted to Celsius
     public double getCelsius(){  
//       double r = ftemp - 32;
//       double s = 5.0/9.0;
         return (5.0/9.0*(ftemp-32));
//           return r*s ;
     }
     
     
     public double getKelvin(){
         return((5.0/9.0*(ftemp-32))+273);
     }

}

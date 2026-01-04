
package circletest;

/**
 *
 * @author Ranim
 */
public class Circle {
    //fields
    private double radius;
    private final double PI = Math.PI;
    
    //constructor
    public Circle(double rad){
    radius = rad;
    }
    
    public Circle(){
    radius = 0;
    }
    
    //mutators 
    public void setRadius(double rad){
    radius = rad;
    }
    
    //accessors
    public double getRadius(){
        return radius;
    }
     
    //requierd methods
    
    // calculating the area
    public double getArea(){
        return(PI*Math.pow(radius, 2));
    }
    
    // calculating the diameter
    public double getDiameter(){
        return (radius*2);
    }
    
    // calculating the circumference
    public double getCircumference(){
        return(2*PI*radius);
    }
    
}

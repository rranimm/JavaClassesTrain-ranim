
package circletest;

import java.util.Scanner;

/**
 *
 * @author Ranim
 */
public class CircleTest {

    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        
        System.out.print("Enter the circle's radius : ");
        circle.setRadius(input.nextDouble());
        
        System.out.printf("The circle's area = %.3f cm^2.\n" ,circle.getArea());
        System.out.printf("The circle's diameter = %.3f cm.\n" , circle.getDiameter());
        System.out.printf("The circle's circumference = %.3f cm.\n", circle.getCircumference());
    }
    
}

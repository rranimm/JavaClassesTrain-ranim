
package leapyear;

import java.util.Scanner;

/**
 *
 * @author Ranim
 */
public class LeapYear {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Enter month(1-12): ");
         int a = input.nextInt();
         
        if(a>12){
            System.out.println("Invalid input");
         }
         
        System.out.println("Enter year: ");
        int b = input.nextInt();
        
        MonthDays monthDays = new MonthDays(a,b);
        System.out.println(monthDays.getNumberOfDays()+" days. ");


       
    }
    
}

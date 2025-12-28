
package employee;

import java.util.Scanner;

/**
 *
 * @author RANIM
 */
public class Employee {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Payroll payroll = new Payroll("Ranim","1234-5678");
        payroll.setPayRate(100);
        payroll.setHoursWorked(20);
        
        System.out.println("Enter the employee's name: ");
        String employeeName = input.next();
        
        System.out.println("Enter the employee's ID: ");
        String employeeID = input.next();
        
        if (employeeName.equalsIgnoreCase(payroll.getName())&&employeeID.equalsIgnoreCase(payroll.getID())){
            System.out.println(" The amount of gross pay earned :"+ payroll.grossPay()+"$");
        }else {
            System.out.println("Invalid input");
        }
       
        
    }
    
}

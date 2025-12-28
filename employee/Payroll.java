
package employee;

/**
 *
 * @author RANIM
 */
public class Payroll {
    //fields
    private String name;
    private String ID;
    private int payRate;
    private int hoursWorked;
    
    //constructor
    public Payroll(String na, String id){
        name = na;
        ID = id;
    }
    
    //mutators
    public void setName(String na){
        name = na;
    }
    
    public void setID(String id){
        ID = id;
    }
    
    public void setPayRate(int pay){
        payRate = pay;
    }
    public void setHoursWorked(int hours){
        hoursWorked = hours;
    }
    //accessors
    
    public String getName(){
    return name;
    }
    
    public String getID(){
    return ID;
    }
    
    public int getPayRate(){
    return payRate;
    }
    
    public int getHoursWorked(){
    return hoursWorked;
    }
    
    //another requierd methods
    public int  grossPay(){
    return payRate*hoursWorked;
    }
    
    
}

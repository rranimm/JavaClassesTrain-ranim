
package leapyear;

/**
 *
 * @author Ranim
 */
public class MonthDays {
    //fields
    private int month;
    private int year;

    
    // constructor
    public MonthDays(int mon, int ye){
       month = mon;
       year = ye;
    }
    public int getNumberOfDays(){
        
        if(year%100==0&&year%400==0){
            
         switch(month){
             case 1,3,5,7,8,10,12 :
                 return 31;
             case 4,6,9,11:
                 return 30;
             case 2:
                 return 29;
             default:
                 return 0 ;
         }
         
        }else if (year%100!=0){
                 if(year%4==0){
                    switch(month){
             case 1,3,5,7,8,10,12 :
                 return 31;
             case 4,6,9,11:
                 return 30;
             case 2:
                 return 29;
             default:
                 return 0 ;
         }   
                 }
        
        }
          switch(month){
             case 1,3,5,7,8,10,12 :
                 return 31;
             case 4,6,9,11:
                 return 30;
             case 2:
                 return 28;
             default:
                 return 0 ;                 
         }
        
        }
        
    } 
    


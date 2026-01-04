
package cartest;

public class Car {
    private int yearModle; 
    private String make; 
    private int speed = 0; 
    
    public Car (int year, String ma, int spe){
        //fields
        yearModle = year ;
        make = ma ;
        speed = spe ;       
    }
    //mutators
    
    public void setYearModel(int year){
        yearModle = year ;
    }
    public void setMake(String ma){
        make = ma ;
    }
    public void setSpeed(int spe){
        speed = spe ;
    }
    //accessors
    public int getYearModle(){
        return yearModle;
    }
     public String getMake(){
        return make;
    }
      public int getSpeed(){
        return speed;
    }
      // another requierd methods 
      public void accelerate (){
          speed+=5;
      }
      public void brake(){
          speed-=5;
          if(speed<0){
          speed = 0 ;
          }
      }
}

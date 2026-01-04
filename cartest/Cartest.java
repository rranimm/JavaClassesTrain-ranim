
package cartest;

/**
 *
 * @author RANIM
 */
public class Cartest {

    public static void main(String[] args) {
        // TODO code application logic here
        int answer;
        
        Car car = new Car(2000,"KIA",90);

        for(int i =0;i<5;i++){
            car.accelerate();
            System.out.println("The speed :"+ car.getSpeed());
        }
        
        System.out.println("The speed after the acceleration ="+car.getSpeed());
        
        
          for(int i =0;i<5;i++){
            car.brake();
        }
        
        System.out.println("The speed after the brake ="+car.getSpeed());
    }
    
}

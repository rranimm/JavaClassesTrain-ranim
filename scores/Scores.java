
package scores;

import java.util.Scanner;

/**
 *
 * @author RANIM
 */
public class Scores {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        TestScores score = new TestScores();
        
        System.out.println("Enter score 1: ");
        score.setScore1(input.nextDouble());
        
         System.out.println("Enter score 2: ");
        score.setScore2(input.nextDouble());
        
         System.out.println("Enter score 3: ");
        score.setScore3(input.nextDouble());
       
        System.out.println("The average is :"+score.average());
        
    }
    
}

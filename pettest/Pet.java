
package pettest;

public class Pet {
    private String name ;
    private String animal ;
    private int age ;
    
//  public Pet(String na, String ani, int ag){
//      name = na ;
//      animal = ani ;
//      age = ag ;
//  }
  
   public void setName(String na){
      name = na;
  }
  
  public void setAnimal(String ani){
      animal = ani ;
  }
  
  public void setAge(int ag){
      age = ag ;
  }
   
  public String getName(){
      return name ;
  } 
  public String getAnimal(){
      return animal ;
  } 
    public int getAge(){
      return age ;
  } 
    
    
    
}

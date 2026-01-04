
package pettest;

public class Pettest {

    public static void main(String[] args) {
        // TODO code application logic here
        Pet pet = new Pet();
        

        pet.setName("Luna");
        pet.setAnimal("Cat");
        pet.setAge(3);
        
        System.out.println("The name of the animal :" + pet.getName());
        System.out.println("The kind of the animal :" + pet.getAnimal());
        System.out.println("The age of the animal :" + pet.getAge());
    }
    
}

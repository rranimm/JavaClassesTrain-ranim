
package store;

/**
 *
 * @author RANIM
 */
public class Item {
    //fields
    private String description;
    private int unitsOnHand;
    private double price;
    
    //constructor
    public Item(String desc, int units, double pri){
        description = desc;
        unitsOnHand = units;
        price = pri;
        }
    // mutators
     public void setDescription(String desc){
     description = desc;
     }
     
     public void setUnitsOnHand(int units){
     unitsOnHand = units;
     }
     
     public void setPrice(double pri){
     price = pri;
     }
     //accessors
     public String getDescription(){
     return description;
     }
     
     public int getUnitsOnHand(){
     return unitsOnHand;
     }
     
     public double getPrice(){
     return price;
     }
    
}

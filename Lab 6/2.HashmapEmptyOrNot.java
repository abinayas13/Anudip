
package hashmapemptyornot;
import java.util.HashMap;
public class HashmapEmptyOrNot {

    public static void main(String[] args) {
      //Creating a Empty HashMap 
      HashMap<String, Integer>map=new HashMap<>();
      
      //Checking if the map is empty
      if(map.isEmpty()){
          System.out.println("The HashMap is empty.");
      }else{
          System.out.println("The HashMap is not empty."); 
      }
      
      //Adding some key-value mapping to the map
      map.put("Apple",3);
      map.put("Mango",5);
      map.put("Grapes",7);
      
      //Checking if the map contains any key-value mapping after adding entries
      if(!map.isEmpty()){
          System.out.println("The HashMap contains key-value mappings.");    
      }else{
          System.out.println("The HashMap does not contain any key-value mappings.");
      }
      
      //Checking if a specific key-value pair exists in the map
      if(map.containsKey("Mango")&&map.containsValue(5)){
          System.out.println("The map contains the key 'Mango' with value 5.");
      }else{
          System.out.println("The map does not contains the key 'Mango' with value 5.");
      }
    }
    
}

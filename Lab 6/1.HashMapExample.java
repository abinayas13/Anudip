
package hashmapexample;
import java.util.HashMap;
public class HashMapExample {

    public static void main(String[] args) {
      //Creating a HashMap to store key-value pairs
      HashMap<String, Integer>map=new HashMap<>();
      
      //Associating a key with a value
      map.put("Apple",3);
      map.put("Mango",5);
      map.put("Grapes",7);
      
      //Printing the HashMap
      System.out.println("HashMap content :"+map);
      
      //Accessing a value using a key
      String key="Mango";
      int value=map.get(key);
      
      //Printing the value associated with the key
      System.err.println("Value associated with key"+key+":"+value);
    }
    
}

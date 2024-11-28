
package hashset;
import java.util.HashSet;
public class HashSetExample {

    public static void main(String[] args) {
     
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add some initial elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Print the HashSet before adding the new element
        System.out.println("HashSet before adding the element: " + set);

        // Specify the element to append
        String newElement = "Mango";

        // Append the new element to the HashSet
        set.add(newElement);

        // Print the HashSet after adding the new element
        System.out.println("HashSet after adding the element: " + set);
    }
}


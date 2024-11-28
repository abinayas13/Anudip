
package reversestring;
import java.util.*;
public class ReverseString {

    public static void main(String[] args) {
       // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");

        // Display the original list
        System.out.println("Original List: " + strings);

        // Reverse the list
        Collections.reverse(strings);

        // Display the reversed list
        System.out.println("Reversed List: " + strings);
    }
}


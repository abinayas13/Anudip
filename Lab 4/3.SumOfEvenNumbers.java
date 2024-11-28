
package sumofevennumbers;
import java.util.ArrayList;
public class SumOfEvenNumbers {

    public static void main(String[] args) {
       
        // Create and initialize the ArrayList with integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(28);
        numbers.add(34);
        numbers.add(43);
        numbers.add(50);
        numbers.add(63);

        // Calculate the sum of even numbers
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        // Print the result
        System.out.println("Sum of even numbers: " + sum);
    }
    
}

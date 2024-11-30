
package cricketerscores;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CricketerScores {

    public static void main(String[] args) {
     //Create a Map to store cricketer names as keys and their scores as values
     Map<String,Integer>cricleterScores=new HashMap<>();
     
     //Add some cricketers and their scores to the Map
     cricleterScores.put("Virat Kohli",92);
     cricleterScores.put("MS Dhoni",97);
     cricleterScores.put("Rohit Sharma",85);
     cricleterScores.put("Sachin",96);
     cricleterScores.put("Shubman Gill",82);
     
     //Scanner for user input
     Scanner scanner=new Scanner(System.in);
     
     //Ask the user to input a batsman's name to search for
     System.out.print("Enter the cricketer's name to search:");
     String batsmanName=scanner.nextLine();
     
     //Search for the batsman's score in the Map
     if(cricleterScores.containsKey(batsmanName)){
         int score=cricleterScores.get(batsmanName);
         
         //Get the score of the batsman
         System.out.println(batsmanName+" score is:"+score);
     }else{
        System.out.println("No record found for"+batsmanName);
     }
     
     //Close the scanner
     scanner.close();
        
     }
    }
    


package studentsrecords;
import java.util.Scanner;
        class Student {
    int rollNo;
    String name;
    // Constructor to initialize the student record
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }   
    // Method to display student details
    void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}
public class StudentRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10]; // Array to store 10 students
        int index = 0;
        while (true) {
            try {
                if (index >= students.length) {
                    System.out.println("All student records are full.");
                    break;
                }
                // Get student details from the user
                System.out.print("Enter Roll No: ");
                int rollNo = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                // Create a new Student object and store it in the array
                students[index] = new Student(rollNo, name);
                index++; // Increment the index

                // Ask the user if they want to enter more student records
                System.out.print("Do you want to enter another record? (yes/no): ");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("no")) {
                    break;
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: You have reached the maximum number of students (10).");
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
        // Display all student records
        System.out.println("\nStudent Records:");
        for (int i = 0; i < index; i++) {
            students[i].displayStudentDetails();
        }
        scanner.close();
    }
}

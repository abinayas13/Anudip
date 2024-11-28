    
package vaccination;
// Abstract class Vaccine
abstract class Vaccine {
    int age;
    String nationality;

    // Constructor to initialize age and nationality
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method for first dose
    public void firstDose() {
        if (nationality.equals("Indian") && age >= 18) {
            System.out.println("You are eligible for the first dose.");
            System.out.println("Pay 250 Rs for the first dose.");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    // Concrete method for second dose
    public void secondDose(boolean isFirstDoseCompleted) {
        if (isFirstDoseCompleted) {
            System.out.println("You are eligible for the second dose.");
        } else {
            System.out.println("You must complete the first dose before taking the second dose.");
        }
    }

    // Abstract method for booster dose
    public abstract void boosterDose();
}

// Implementation class VaccinationSuccessful
class VaccinationSuccessful extends Vaccine {

    // Constructor to initialize age and nationality
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    // Implementing the abstract method boosterDose
    @Override
    public void boosterDose() {
        if (age >= 18 && nationality.equals("Indian")) {
            System.out.println("You are eligible for the booster dose.");
        } else {
            System.out.println("You are not eligible for the booster dose.");
        }
    }
}

// Main class Vaccination

public class Vaccination {

    public static void main(String[] args) {
     
        // Create an instance of VaccinationSuccessful
        VaccinationSuccessful user1 = new VaccinationSuccessful(20, "Indian");

        // Scenario 1: User takes the first dose
        user1.firstDose();

        // After paying 250 for the first dose, user becomes eligible for second dose
        boolean isFirstDoseCompleted = true;

        // Scenario 2: User can take second dose if first dose is completed
        user1.secondDose(isFirstDoseCompleted);

        // Scenario 3: User can take booster dose after completing both doses
        user1.boosterDose();   
    }
    
}

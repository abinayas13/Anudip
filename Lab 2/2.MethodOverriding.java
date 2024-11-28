
package methodoverriding;
    
    // Superclass Animal
class Animal {
    // Method that will be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog that overrides makeSound
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat that overrides makeSound
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class to test the program
public class MethodOverriding {

    public static void main(String[] args) {
        // Creating objects of Animal, Dog, and Cat
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        // Displaying the sounds made by each animal
        System.out.println("Animal sound:");
        myAnimal.makeSound();  // Calls Animal's makeSound

        System.out.println("\nDog sound:");
        myDog.makeSound();  // Calls Dog's makeSound (method overriding)

        System.out.println("\nCat sound:");
        myCat.makeSound();  // Calls Cat's makeSound (method overriding)
    }
}
  
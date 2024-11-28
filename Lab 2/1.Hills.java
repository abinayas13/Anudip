
package hills;

    // Superclass
class HillStations {
    // Method to get location
    public void location() {
        System.out.println("Hill stations are located in the mountains.");
    }

    // Method to get famous things
    public void famousFor() {
        System.out.println("Hill stations are known for their scenic beauty and cool weather.");
    }
}

// Subclass Manali
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh, India.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for adventure sports and its picturesque landscapes.");
    }
}

// Subclass Mussoorie
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand, India.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its colonial architecture and pleasant weather.");
    }
}

// Subclass Gulmarg
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu & Kashmir, India.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for its skiing slopes and lush green meadows.");
    }
}

public class Hills {

    
    public static void main(String[] args) {
        // Calling methods using the superclass reference (polymorphism)
        HillStations hillStation;

        // Creating objects of subclasses
        hillStation = new Manali();
        System.out.println("Calling from Manali object:");
        hillStation.location();  // calls the Manali version of location()
        hillStation.famousFor();  // calls the Manali version of famousFor()

        System.out.println("\n");

        hillStation = new Mussoorie();
        System.out.println("Calling from Mussoorie object:");
        hillStation.location();  // calls the Mussoorie version of location()
        hillStation.famousFor();  // calls the Mussoorie version of famousFor()

        System.out.println("\n");

        hillStation = new Gulmarg();
        System.out.println("Calling from Gulmarg object:");
        hillStation.location();  // calls the Gulmarg version of location()
        hillStation.famousFor();  // calls the Gulmarg version of famousFor()
        
        System.out.println("\n");

        // Calling methods directly from subclass instances
        Manali manali = new Manali();
        manali.location();   // Manali's version of location
        manali.famousFor();  // Manali's version of famousFor()

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();   // Mussoorie's version of location
        mussoorie.famousFor();  // Mussoorie's version of famousFor()

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();   // Gulmarg's version of location
        gulmarg.famousFor();  // Gulmarg's version of famousFor()
    }
}
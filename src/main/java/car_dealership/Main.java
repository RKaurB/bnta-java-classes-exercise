package car_dealership;

// Main class
public class Main {

    // Main method
    public static void main(String[] args) {

        // Create new instance of Car object, from Car class
        Car mercedes = new Car(Manufacturer.MERCEDES, 10_000.00, EngineType.HYBRID);
        // Print mercedes Car object
        System.out.println(mercedes);
        // Test getters
        System.out.println(mercedes.getManufacturer());
        System.out.println(mercedes.getPrice());
        System.out.println(mercedes.getEngineType());

    }
}

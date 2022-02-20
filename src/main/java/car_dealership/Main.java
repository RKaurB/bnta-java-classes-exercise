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

        // Test setters
        // Double newPrice = mercedes.getPrice() / 2;
        // mercedes.setPrice(newPrice);
        // System.out.println(mercedes.getPrice());
        mercedes.setPrice(mercedes.getPrice() / 2);
        System.out.println("New price: " + mercedes.getPrice());

        // Create new instance of carDealership object, called "Car Dealership, with maximum number of cars set at 10
        CarDealership dealership = new CarDealership("Car Dealership", 10);

    }
}

package car_dealership;

import java.util.Arrays;

// Main class
public class Main {

    // Main method
    public static void main(String[] args) {

        // Create new instance of Car object, from Car class
        Car mercedes = new Car(Manufacturer.MERCEDES, 10_000.00, EngineType.HYBRID);
        // Print mercedes Car object
        System.out.println(mercedes);

        // Test getters
        System.out.println("Manufacturer: " + mercedes.getManufacturer());
        System.out.println("Price: " + mercedes.getPrice());
        System.out.println("Engine type: " + mercedes.getEngineType());

        // Test setters
        // Double newPrice = mercedes.getPrice() / 2;
        // mercedes.setPrice(newPrice);
        // System.out.println(mercedes.getPrice());
        mercedes.setPrice(mercedes.getPrice() / 2);
        System.out.println("New price: " + mercedes.getPrice());

        // Create new instance of carDealership object, called "Car Dealership, with maximum number of cars set at 10
        CarDealership dealership = new CarDealership("Car Dealership", 10);
        // Print array of cars in stock in dealership
        System.out.println("Cars in stock: " + Arrays.toString(dealership.getCarsInStock()));
        // Call the countCarsInDealership method and print total number of cars in dealership
        System.out.println("Number of cars in stock: " + dealership.countCarsInDealership());

        // Test addCarToDealership the method in Main, by counting the number of cars, adding a new car, then counting again to make sure number has increased by 1
        dealership.addCarToDealership(mercedes);
        System.out.println("Updated number of cars in stock: " + dealership.countCarsInDealership());
    }
}

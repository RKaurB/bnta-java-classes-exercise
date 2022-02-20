package car_dealership;

// Class to represent a car dealership
// Contains the business logic
public class CarDealership {

    // Properties
    private String name;
    private int maxCars;
    private Car[] carsInStock;

    // Constructor
    public CarDealership() {}

    public CarDealership(String name, int maxCars) {
        this.name = name;
        this.maxCars = maxCars;
        // Use maxCars value to create an empty array with that number of spaces
        this.carsInStock = new Car[maxCars];


    }
}

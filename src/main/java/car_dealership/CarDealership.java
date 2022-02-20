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

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCars() {
        return maxCars;
    }

    public void setMaxCars(int maxCars) {
        this.maxCars = maxCars;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void setCarsInStock(Car[] carsInStock) {
        this.carsInStock = carsInStock;
    }


}

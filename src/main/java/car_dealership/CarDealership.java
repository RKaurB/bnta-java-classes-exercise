package car_dealership;

import java.util.Arrays;
import java.util.Objects;

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

    // toString, equals, and hashCode methods
    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", maxCars=" + maxCars +
                ", carsInStock=" + Arrays.toString(carsInStock) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDealership that = (CarDealership) o;
        return maxCars == that.maxCars && name.equals(that.name) && Arrays.equals(carsInStock, that.carsInStock);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, maxCars);
        result = 31 * result + Arrays.hashCode(carsInStock);
        return result;
    }

    // Write a method that counts number of cars in the Dealership
    // Doesn't need to take any parameters, and should return an int
    public int countCarsInDealership() {
        // Initialise counter variable
        int countCars = 0;
//        // For(i) loop to iterate through the array of cars in stock
//        // (carsInStock.fori)
//        for (int i = 0; i < carsInStock.length; i++) {
//            // If array element at index(i) is not null
//            if (this.carsInStock[i] != null) {
//                // Then add to the count of cars in stock
//                // Increment car count
//                count++;
//            }
        // Enhanced for loop to iterate through the array of cars in stock
        // (carsInStock.for)
        for (Car car : this.carsInStock) {
            // If array element at index(i) is not null
            if (car != null) {
                // Then add to the count of cars in stock
                // Increment car count
                countCars++;
            }
        }
        // Return the total count
        return countCars;
    }

    // Write another method to add a car to the dealership
    // The method should hava a Car parameter, and doesn't need to return anything
    public void addCarToDealership(Car car) {
        // For each slot (element) in the array
        for (int i = 0; i < carsInStock.length; i++) {
            // If its value is null, i.e. empty
            if (this.carsInStock[i] == null) {
                // Then add the car to that slot
                this.carsInStock[i] = car;
                // Break out of the loop once car added
                break;
            }
        }
        // Test the method in Main, by counting the number of cars, adding a new car, then counting again to make sure number has increased by 1
    }

}

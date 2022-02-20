package car_dealership;

import java.util.Objects;

public class Car {

    // Properties
    private Manufacturer manufacturer;
    private Double price;
    private EngineType engineType;

    // Constructors
    public Car() {}

    public Car(Manufacturer manufacturer, Double price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    // Getters & Setters
    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return this.engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    // toString method
    @Override
    public String toString() {
        return "Car{" +
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", engineType=" + engineType +
                '}';
    }

    // Equals & hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufacturer == car.manufacturer && price.equals(car.price) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, engineType);
    }
}

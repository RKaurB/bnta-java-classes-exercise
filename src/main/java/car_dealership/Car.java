package car_dealership;

// Car class
public class Car {

    // Properties
    Manufacturer manufacturer;
    Double price;
    EngineType engineType;

    // Constructors
    public Car() {
    }

    public Car(Manufacturer manufacturer, Double price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    // Getters & Setters
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

}

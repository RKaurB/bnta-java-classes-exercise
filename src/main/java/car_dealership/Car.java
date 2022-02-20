package car_dealership;

public class Car {

    // Properties
    Manufacturer manufacturer;
    Double price;
    EngineType engineType;

    // Constructors
    public Car() {}

    public Car(Manufacturer manufacturer, Double price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

}

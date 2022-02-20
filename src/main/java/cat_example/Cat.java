package cat_example;

// Define a class to describe a pet cat with a name property
public class Cat {

    // Properties
    private String name;

    // Constructor
    public Cat(String name) {
        this.name = name;
    }

    // Write a getter for name, and use it to print the value in Main
    public String getName() {
        return this.name;
    }
}

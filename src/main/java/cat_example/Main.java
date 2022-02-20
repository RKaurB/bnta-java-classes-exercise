package cat_example;

// Main class
public class Main {

    // Main method
    public static void main(String[] args) {

        // Create new instance of Cat object from Cat class, passing in name property
        Cat cat = new Cat("Larry");

        // Use Getter to get cat name, and store name in the catName variable
        String catName = cat.getName();

        // Print cat name
        System.out.println(catName);

    }

}

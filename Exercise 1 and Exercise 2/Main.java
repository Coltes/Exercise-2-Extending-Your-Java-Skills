public class Main {
    public static void main(String[] args) {

        // Create a Car object
        Car myCar = new Car();

        // Set the make and model using setters
        myCar.setMake("Subaru");
        myCar.setModel("WRX");

        // Display car details
        System.out.println("Initial Details:");
        myCar.displayDetails();

        // Modify car details using setters
        myCar.setMake("BMW");
        myCar.setModel("M4");

        // Display updated details
        System.out.println("Updated Details:");
        myCar.displayDetails();
    }
}
public class Car {

    // Attributes
    private String make;  // Car manufacturer
    private String model; // Car model

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
    }
}
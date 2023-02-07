package Vehicle;

public class Vehicle {
    private String model;
    private String make;
    private int numberOfWheels;
    private int topSpeed;

    public Vehicle(String model, String make, int numberOfWheels, int topSpeed) {
        this.model = model;
        this.make = make;
        this.numberOfWheels = numberOfWheels;
        this.topSpeed = topSpeed;
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    
}

package Bike;
import Vehicle.Vehicle;

public class Bike extends Vehicle{
    private String engine;

    public Bike(String model, String make, int numberOfWheels, int topSpeed, String engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void accelerate(){
        System.out.println("Accelerate...");
    }

    public void Break(){
        System.out.println("Break...");
    }

}

package Truck;
import Vehicle.Vehicle;

public class Truck extends Vehicle{
    private boolean hasAC;
    private boolean hasHandBrake;
    private String sound;
    private String engine;
    private String container;
    
    public Truck(String model, String make, int numberOfWheels, int topSpeed, boolean hasAC, boolean hasHandBrake,
            String sound, String engine, String container) {
        super(model, make, numberOfWheels, topSpeed);
        this.hasAC = hasAC;
        this.hasHandBrake = hasHandBrake;
        this.sound = sound;
        this.engine = engine;
        this.container = container;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public boolean isHasHandBrake() {
        return hasHandBrake;
    }

    public void setHasHandBrake(boolean hasHandBrake) {
        this.hasHandBrake = hasHandBrake;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public void accelerate(){
        System.out.println("Accelerate...");
    }

    public void Handreak(){
        System.out.println("Hand Break...");
    }

    public void openContainer(){
        System.out.println("Open Container...");
    }
}

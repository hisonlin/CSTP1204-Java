import Car.Car;
import Vehicle.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        Car hatchback = new Car("Corolla", "Toyota", 4, 150, true, true, "quiet", "1.6L");
        Car sedan = new Car("Camry", "Toyota", 4, 150, true, false, "quiet", "2.0L");

        
        hatchback.getInfo();
        hatchback.accelerate();
        hatchback.Break();
        hatchback.Handbreak();
        sedan.getInfo();
        sedan.accelerate();
        sedan.Break();
        sedan.Handbreak();

    }
}

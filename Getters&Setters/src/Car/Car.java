package Car;

public class Car {

    //The Properties of a car!
    private String model;
    private String make;
    private int manufactureYear;
    private int currentSpeed;
    private String driverName;
    private boolean isEngineOn;



    //Constructor
    //Default Contructor
    public Car(){
        this.make = "BMW";
        this.model = "3 Series";
        this.currentSpeed = 10;
        this.manufactureYear = 2023;
        this.driverName = "John Doe";
        this.isEngineOn = true;

    }


    //Parameterized Constructor
    public Car(String model, String make, int manufactureYear, int currentSpeed, String driverName, boolean isEngineOn){

    //this keyword is referring to the current Class called as Car
    this.model = model;
    this.make = make;
    this.manufactureYear = manufactureYear;
    this.currentSpeed = currentSpeed;
    this.driverName = driverName;
    this.isEngineOn = isEngineOn;
    
    }

    public void starEngine(){
        System.out.println("Engine is starting ... Have a safe drive");
        this.isEngineOn = true;
        this.currentSpeed = 0;
    }

    public void stopEngine(){
        System.out.println("Engine is stopping ... Hope you had a safe drive");
        this.isEngineOn = false;
        this.currentSpeed = 0;
    }

    public void getCarInformation(){
        System.out.println("Following is the car Details: ");
        System.out.println("Drive Name: " + this.driverName);
        System.out.println("Car Make: " + this.make);
        System.out.println("Car Model: " + this.model);
        System.out.println("Car Year: " + this.manufactureYear);
        System.out.println("Car current Speed: " + this.currentSpeed);

    }

    //Getters and Setters
    //Setters are to update the value

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


    public int getManufactureYear() {
        return manufactureYear;
    }


    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }


    public int getCurrentSpeed() {
        return currentSpeed;
    }


    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }


    public String getDriverName() {
        return driverName;
    }


    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }


    public boolean isEngineOn() {
        return isEngineOn;
    }


    public void setEngineOn(boolean isEngineOn) {
        this.isEngineOn = isEngineOn;
    }





}




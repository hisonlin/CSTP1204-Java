public class Elevator {
    private int floors;
    private int numberOfPeopleAllowed;
    private double weightAllowed;
    private double height;
    private int currentFloor;
    private String direction;

    public Elevator(int floors, int numberOfPeopleAllowed, double weightAllowed, double height, int currentFloor, String direction) {
        this.floors = floors;
        this.numberOfPeopleAllowed = numberOfPeopleAllowed;
        this.weightAllowed = weightAllowed;
        this.height = height;
        this.currentFloor = currentFloor;
        this.direction = direction;
    }

    public void goUpElevator() {
        if (currentFloor < floors) {
            currentFloor++;
            System.out.println("Elevator going up to floor " + currentFloor);
        } else {
            System.out.println("Elevator is already at the top floor.");
        }
    }

    public void goDownElevator() {
        if (currentFloor > 1) {
            currentFloor--;
            System.out.println("Elevator going down to floor " + currentFloor);
        } else {
            System.out.println("Elevator is already at the ground floor.");
        }
    }
}



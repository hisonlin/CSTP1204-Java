public class NegativeException extends Exception {

    private String message;

    public NegativeException(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return "Hey Man, this is your custom exception message :" + message;
    }
}
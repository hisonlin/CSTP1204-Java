public class Number {
   private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int factorial(int num) throws NegativeException{
        if (num < 0){
            throw new NegativeException("Negative Number is not allowed! Please enter a whole number.");

        }
        
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

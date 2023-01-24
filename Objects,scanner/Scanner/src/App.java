import java.util.Scanner;
import java.util.Random;
import java.util.*; //import alll the classes inside the util package

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);//System.in is a way to convey that we want to take an input using input stream

        //system.in--->This menas we are trying to take input from outside the program
        //system.out--->output from inside the program
        System.out.println("Please enter you name: ");
        String username = sc.next();//It is used to take an input from the user in the form of strings
        System.out.println("You entered your name as: " + username);

        int userAge = sc.nextInt();
        System.out.println("You entered your name as: " + username + " and your age is: " + userAge);

        Random random = new Random();

        int randomNumber = random.nextInt(20);//This will produce a integer within 20
        System.out.println(randomNumber);

        double randomDouble = random.nextDouble(25);//This will produce a double within 25
        System.out.println(randomDouble);

    }
}

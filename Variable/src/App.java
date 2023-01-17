//Classes are blurprints, which wrap your entire code
//Public mrans accessible to all
//App means name of the class, for example it can also be People
public class App {

    //Method whose name is main
    //It is also of type public, which means accessible to all
    //viod, this viod means this method doesn't return anything
    //Exception its a situation whish gets executed when your program breaks
    public static void main(String[] args) throws Exception {

        //This is for printing on the consoles, just like console.log in js
        System.out.println("Hello, World!");

        //This variable is of type string
        String userName = "Hison";

        //This variable is of type integer
        int age = 32;

        System.out.println(userName + " is " + age + " years old");

        boolean isCool = true;

        //Implicit TypeCasting
        short num = 20;
        int num2 = num;

        System.out.println(num2);

        //Explicit TypeCasting
        int num3 = 20;
        short num4 = (short) num3;

        System.out.println(num4);
    }
}

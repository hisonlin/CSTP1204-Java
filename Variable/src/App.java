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

        //Arithmetic Operations
        //+
        int number1 = 20;
        int number2 =40;
        int total = number1 + number2;

        System.out.println(total);

        //-
        int subtractedValue = number2 - number1;
        System.out.println(subtractedValue);

        // /
        int divideValue = number2/number1;
        System.out.println(divideValue);

        // *
        int multipliedValue = number2*number1;
        System.out.println(multipliedValue);

        // %
        int remainder = number2%number1;
        System.out.println(remainder);

        // ++
        number1++;
        System.out.println(number1);

        // --
        number2--;
        System.out.println(number2);

        //Asignment Operations

        int a = 4;
        a += 10; // a = a + 10;
        a -= 10; // a = a - 10;
        a /= 10; // a = a / 10;
        a *= 10; // a = a * 10;
        a %= 10; // a = a % 10;

        //Logical Operatiors
        int danielAge = 25;
        if(danielAge > 18 && danielAge <60){
            System.out.println("You are not eligible for Retirement Funds!");
        }

        //&& and
        int n1 = 10;
        int n2 = 20;
        if(n1 > 5 && n2 > 15){
            System.out.println("Both Conditions satisfy!");
        }
        else{
            System.out.println("Something Wrong!");
        }

        //|| or
        int hisonAge = 25;
        if(hisonAge < 18 || hisonAge < 60){
            System.out.println("I went in if");
        }
        else{
            System.out.println("I went in else");
        }

        //Ternary Operators
        //condition? Expression 1 (If) : Expression 2 (else)

        int marks = 65;
        String output = marks == 90 ? "I rocked!" : "I am shocked!";

        System.out.println(output);

        String output1 = marks > 60 && marks <= 70 ? "You got a C" : marks > 70 && marks <= 80 ? "You got a B": "You are fail";

        System.out.println(output1);
    }
}

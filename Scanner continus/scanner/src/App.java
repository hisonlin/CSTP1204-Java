import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        //Formating
        System.out.println(Math.PI);
        System.out.printf("%4.2f",Math.PI);//3.14, 4 width and 2 decimal 
        System.out.println();
        System.out.printf("%4.4f",Math.PI);//3.1416
        System.out.println();
        System.out.printf("%4.1f",Math.PI);// 3.1 ,having a space at the begining
        System.out.println();
        System.out.printf("%3d%4d",100,200);//100 200 //having a space between them because 200 have 4width
        //with a negative flag
        System.out.println();
        System.out.printf("%-20.2f",Math.PI);//space on the left
    }
}


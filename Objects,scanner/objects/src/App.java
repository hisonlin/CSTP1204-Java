//Java imports the packages by default like java.lang
import java.lang.String;//This is already imported
public class App {
    public static void main(String[] args) throws Exception {
        
        //New keyword will create an instance
        String str = new String("Hello world!");
        //String str = new java.lang.String("Hello world!");

        System.out.println(str.length());

        System.out.println(str);

        String student1Name = new String("Daniel");
        String student2Name = new String("Mike");

        //.equals()
        //check if student1Name === student2Name
        System.out.println(student1Name.equals(student2Name));//false

        if(student1Name.equals(student2Name)){
            System.out.println("Both of the students have similar name!");
        }else{
            System.out.println("Both of them dont have a similar name");
        }

        //index of

        System.out.println(student1Name.indexOf("Dan"));//0
        System.out.println(student1Name.indexOf("ni"));//2
        System.out.println(student1Name.indexOf("l"));//5
        System.out.println(student1Name.indexOf("mike"));//-1
        System.out.println(student1Name.indexOf("Daniels"));//-1

        //Note - hwen we are talking about indexes, and if that value doesnt exist, or the index doesnt exist, it will return -1

        //To upper/lower case
        String name = new String("Hison");
        String nameInCaps = new String("HISON");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //trim
        String college = new String("   VCC   ");
        System.out.println("My college is : " + college.trim() + " which is in Vancouver");//Trim, it removes th useless space

        //Substring
        String fruit = new String("Mangoes");
        String extractedFruit = fruit.substring(2,4);//4 is not included
        System.out.println(extractedFruit);//ng
        




    }
}

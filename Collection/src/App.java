import java.util.ArrayList;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        //Arrays using the regular way
        String[] veggies ={"Carrot", "Celery", "Onion"};//It has contagious block of memory
        System.out.println(veggies);
        displayVeggies(veggies);

        List <String> fruitsList= new ArrayList<>();//This is dynamic array
        List <String> smallFruitsList= new ArrayList<>();

        smallFruitsList.add("grapes");
        smallFruitsList.add("cherry");

        //Adding elements in the last index
        fruitsList.add("Mango");
        fruitsList.add("Apple");
        fruitsList.add("Oranges");
        //Adding element in the given index
        fruitsList.add(1, "Kiwi");

        //adding an array into an array
        fruitsList.addAll(smallFruitsList);
        System.out.println(fruitsList);
        displayFruits(fruitsList);

        System.out.println("Is empty? " + fruitsList.isEmpty());



    }
    public static void displayFruits(List<String>fruits){
        for(String item : fruits){
            System.out.println(item);
        }
    }

    public static void displayVeggies(String[]veggie){
        for(String item : veggie){
            System.out.println(item);
        }
    }
}

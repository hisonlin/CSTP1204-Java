import java.util.*;
import java.util.Queue;
public class App {
    public static void main(String[] args) throws Exception {
    //     int[] num = {1,2,3,4,5};// Static Array

    //     //Alternative to it was Dynamic Array

    // List <String> fruitsList = new ArrayList<>();

    // fruitsList.add("Apple");

    //fruitsList = ["Apple"];

    //Linked list
    LinkedList1 list1 = new LinkedList1();
    list1.addNode(10);
    list1.addNode(20);
    list1.addNode(30);
    list1.addNode(40);
    list1.addNode(50);
    list1.printList();

    LinkedList<String> fruitsList = new LinkedList<>();
    fruitsList.add("Apple");
    fruitsList.add("Mango");
    fruitsList.add("Bananas");

    //Stacks
    Stack<String> books = new Stack<>();
    books.push("ABC");
    books.push("DEF");
    books.push("HIJ");

    //Prrks helps you to get the value from the top of the stack
    String topBook = books.peek();
    System.out.println(topBook);
    
    //remove the top
    String remove = books.pop();
    System.out.println(remove);

    String topBook2 = books.peek();
    System.out.println(topBook2);
    
    books.pop();
    books.pop();
    System.out.println(books.empty());
    
    //Queue
    Queue queueList = new LinkedList<>();

    queueList.add("First");
    queueList.add("Second");
    queueList.add("Third");

    System.out.println(queueList);
        
    }
}

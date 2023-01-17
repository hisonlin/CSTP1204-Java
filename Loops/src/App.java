public class App {
    public static void main(String[] args) throws Exception {
        

        //While Loop!

        int num = 5;

        while(num > 0){
            System.out.println("Hi");
            num--;
        }

        int num1 = 0;
        while(num1 != 5){
            System.out.println(num1);
            num1++;
        }

        String val = "";
        while(val.length() != 10){
            System.out.println(val);
            val += "*";
        }


        //do while loop
        //at least do once
        int count = 20;
        do{
            System.out.println(count);
            count--;
        }while(count >= 3);

        //For loops
        int value1 = 10;
        for (int i = 0; i < value1; i++){
            System.out.println(i);
        }

        //For each loop Java
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int item: numbers){
            System.out.println("Hi>>>>" + item);
        }

        //Nested Loops
        for (int i = 0; i < 5 ; i++){
            for(int j = 0 ; j < 5; j++){
                System.out.println(i + "  " +j);
            }
        }
    }
}

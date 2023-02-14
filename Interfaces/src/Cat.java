public class Cat implements Animal{

    public static int numberOflegs = 4;
    public static void run(){
        System.out.println("Running");

        //We can not do it since eat method is not static
        //Cat.eat()
        Cat.sleep();
    }

    public static void sleep(){
        System.out.println("Sleeping");
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }

    @Override
    public void sound(){
        System.out.println("Sound");
        
    }

    @Override
    public void walk(){
        System.out.println("Walking");

    }
    
}

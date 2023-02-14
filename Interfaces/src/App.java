public class App {
    public static void main(String[] args) throws Exception {
        Cat persian = new Cat();
        persian.eat();
        persian.walk();
        persian.sound();

        //persian.run();//can not run since static

        Cat.run();//static
        System.out.println(Cat.numberOflegs);//static
    }
}

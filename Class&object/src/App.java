import Fruit.Fruit;
import Square.Square;
public class App {
    public static void main(String[] args) throws Exception {
        Fruit apple = new Fruit();

        Fruit mango = new Fruit("yellow", "mango", true, 20, true);
        apple.removeSkin();
        apple.eat();
        mango.eat();

        System.out.println(mango.color);

        Square square1 = new Square(20);
        System.out.println(square1.getArea());
        System.out.println(square1.getParameter());



    }
}

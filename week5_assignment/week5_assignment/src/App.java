import Circle.Circle;
import Cylinder.Cylinder;

public class App {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle(7);
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Parameter of Circle: " + circle.getParameter());

        Cylinder cylinder = new Cylinder(10, 5);
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());
    }
}

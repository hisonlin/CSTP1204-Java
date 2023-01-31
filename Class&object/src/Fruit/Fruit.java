package Fruit;

public class Fruit {
    //Fields/properties of a fruit
    public String color;
    public String name; //default value is null
    public boolean hasPeel;//default value is false
    public int weight;//defauly value is 0
    public boolean isTasty;
    
    //Default constructor where there are no perameters
    
    public Fruit(){

    }
    //Parametrized constructor
    public Fruit(String color, String name, boolean hasPeel, int weight, boolean isTasty){
        this.color = color;
        this.name = name;
        this.hasPeel = hasPeel;
        this.weight = weight;
        this.isTasty = isTasty;

    }

    //Methods in fruit class
    public void eat(){
        System.out.println("Eating.............");
    }

    public void removeSkin(){
        System.out.println("Peeling the fruit....removed");
    }
}

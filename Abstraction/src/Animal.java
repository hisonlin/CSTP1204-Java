abstract public class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    //Abstract Method
    public abstract void sound();

    //Regular Methods
    public void walking(){
        System.out.println("The animal is walking");
    }
    
}

package Animal;

public class Animal {
    private int height;
    private double weight;
    private String type;
    
   

    public Animal(){
        this.height = 0;
        this.weight = 0;
        this.type = "Hi";
    
    }

    public Animal(int height, double weight, String type) {
        this.height = height;
        this.weight = weight;
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}


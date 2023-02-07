package Reptile;
import Animal.Animal;

public class Reptile extends Animal{
    private String skinType;
    private String eggType;

    public Reptile(){

    }
    
    public Reptile(int height, double weight, String type, String skinType, String eggType) {
        super(height, weight, type);//We have to invoke the parent class's constructor by using super method
        this.skinType = skinType;
        this.eggType = eggType;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    public void getInfo(){
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Height: " + this.getHeight());
        System.out.println("Skin Type: " + this.getSkinType());
        System.out.println("Egg Type: " + this.getEggType());

    }
    
}

package Bird;
import Animal.Animal;

public class Bird extends Animal{
    private boolean hasFeathers, canFly;

   

    public Bird(int height, double weight, String type, boolean hasFeathers, boolean canFly) {
        super(height, weight, type);
        this.hasFeathers = hasFeathers;
        this.canFly = canFly;
    }

    public Bird(boolean hasFeathers, boolean canFly) {
        this.hasFeathers = hasFeathers;
        this.canFly = canFly;
    }


    public boolean isHasFeathers() {
        return hasFeathers;
    }

    public void setHasFeathers(boolean hasFeathers) {
        this.hasFeathers = hasFeathers;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public void getInfo(){
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Height: " + this.getHeight());
        System.out.println("hasFeathers: " + this.isHasFeathers());
        System.out.println("canFly: " + this.isCanFly());

    }

    
    
}

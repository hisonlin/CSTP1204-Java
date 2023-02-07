package HardDisk;

public class HardDisk {
    private int memory;
    private boolean isDur;
    private String brand;
    public HardDisk(int memory, boolean isDur, String brand) {
        this.memory = memory;
        this.isDur = isDur;
        this.brand = brand;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public boolean isDur() {
        return isDur;
    }
    public void setDur(boolean isDur) {
        this.isDur = isDur;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
   
    
}

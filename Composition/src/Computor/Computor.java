package Computor;

import HardDisk.HardDisk;
import Processor.Processor;

//HardDisk and Processor become a datatype
public class Computor {
    private String monitor;
    private String keyboard;
    private String mouse;
    private boolean hasCoolingFan;
    private String ram;
    private HardDisk hd;
    private Processor processor;

    public Computor(){
        this.processor = new Processor("Intel", , keyboard)
    }


    public Computor(String monitor, String keyboard, String mouse, boolean hasCoolingFan, String ram, HardDisk hd,
            Processor processor) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.hasCoolingFan = hasCoolingFan;
        this.ram = ram;
        this.hd = hd;
        this.processor = processor;
    }



    public String getMonitor() {
        return monitor;
    }
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
    public String getKeyboard() {
        return keyboard;
    }
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
    public String getMouse() {
        return mouse;
    }
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
    public boolean isHasCoolingFan() {
        return hasCoolingFan;
    }
    public void setHasCoolingFan(boolean hasCoolingFan) {
        this.hasCoolingFan = hasCoolingFan;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public HardDisk getHd() {
        return hd;
    }
    public void setHd(HardDisk hd) {
        this.hd = hd;
    }
    public Processor getProcessor() {
        return processor;
    }
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void getInfo(){
        System.out.println("Following are your computer's specs: ");
        System.out.println("Monitor: " + this.getMonitor());
        System.out.println("Keyboard: " + this.getKeyboard());
        System.out.println("Mouse: " + this.getMouse());
        System.out.println("Cooling Fan: " + this.isHasCoolingFan());
        System.out.println("Processor Brand: " + this.processor.getProcessorBrand());
        System.out.println("Processor Generation: " + this.processor.getProcessGeneration());
        System.out.println("Harddisk Memory: " + this.hd.getMemory());
        System.out.println("Harddisk is Dur" + this.hd.isDur());
        System.out.println("Harddisk brand" + this.hd.getBrand());



    }
    
}

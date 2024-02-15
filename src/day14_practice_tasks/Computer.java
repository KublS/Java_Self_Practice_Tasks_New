package day14_practice_tasks;

public abstract class Computer extends Device{

    private int sizeOfDisplay;

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery,
                    boolean hasPowerButton, int sizeOfDisplay) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
        this.sizeOfDisplay = sizeOfDisplay;
    }

    public int getSizeOfDisplay() {
        return sizeOfDisplay;
    }

    public void setSizeOfDisplay(int sizeOfDisplay) {
        this.sizeOfDisplay = sizeOfDisplay;
    }

    public void modifyPC(){
        System.out.println("Your desktop has been modified");
    }
    public abstract void formatComputer();


}

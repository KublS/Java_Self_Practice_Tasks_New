package day14_practice_tasks;

public class Desktop extends Computer{
    public Desktop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, int sizeOfDisplay) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton, sizeOfDisplay);
    }

    @Override
    public void formatComputer() {
        System.out.println("Desktop " + getBrand() + " " + getModel() + " will be formatted!");
    }

    @Override
    public void turnOn() {
        System.out.println("Device is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Device is turned OFF");
    }
}

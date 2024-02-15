package day14_practice_tasks;

public class Samsung extends Phone implements  AndroidApps, Downloadable{
    public Samsung(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Device is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Device is turned OFF");
    }

    @Override
    public void downloadApp() {
        System.out.println(AppStoreName + " is downloading from the Apple Store. This is full compatible for "
                + OS + " operating system");

    }
}

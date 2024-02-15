package day14_practice_tasks;

public class Iphone extends Phone implements AppleApps, Downloadable{
    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(AppStoreName + " is downloading from the Apple Store. This is full compatible for "
        + OS + " operating system");
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
    public void call(long phoneNumb) {
        System.out.println(getBrand() + getModel() + " is calling " + phoneNumb);
    }

    @Override
    public void text(long phoneNumb) {
        System.out.println(getBrand() + getModel() + " is texting " + phoneNumb);
    }

}

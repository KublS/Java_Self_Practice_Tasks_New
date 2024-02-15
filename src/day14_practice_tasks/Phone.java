package day14_practice_tasks;

public abstract class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }



    public void call(long phoneNumb){
        System.out.println("Call phone number " + phoneNumb);
    }

    public void text (long phoneNumb){
        System.out.println("Text phone number " + phoneNumb);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

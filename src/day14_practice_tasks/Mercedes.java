package day14_practice_tasks;

public class Mercedes extends Car implements AutoPark{
    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " is starting right now");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has auto park feature");

    }

}

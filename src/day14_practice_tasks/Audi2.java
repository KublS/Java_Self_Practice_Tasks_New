package day14_practice_tasks;

public class Audi2 extends Car2{
    public Audi2(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public boolean isEligibleForRecall(){
        return (year >= 2015 && year <= 2019);
    }
}

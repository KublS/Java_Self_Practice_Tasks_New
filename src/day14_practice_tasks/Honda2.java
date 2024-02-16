package day14_practice_tasks;

public class Honda2 extends Car2 {

    public Honda2(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
    @Override
    public boolean isEligibleForRecall(){
        return (year >=2010 && year <= 2011);
    }
}

package day14_practice_tasks;

public class Tesla2 extends Car2{
    public Tesla2(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public boolean isEligibleForRecall() {
        return (year == 2015 || year == 2016);
    }
}

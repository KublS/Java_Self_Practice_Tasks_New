package day14_practice_tasks;

public abstract class Car2 {

    String model, color;
    int year;
    double price;
    public boolean isValidString(String str) {
        return str != null && !str.isEmpty();
    }

    public Car2(String model, String color, int year, double price) {
        if(!isValidString(model)){
            throw new RuntimeException("Model value cannot be null and empty");
        }
        this.model = model;
        if(!isValidString(color)){
            throw new RuntimeException("Color value cannot be null and empty");
        }
        this.color = color;
        if(year < 2009){
            throw new RuntimeException("Year cannot be less then 2009");
        }
        this.year = year;
        if (price < 0 ){
            throw new RuntimeException("Price cannot be less then 0");
        }
        this.price = price;
    }

    public abstract boolean isEligibleForRecall();

    @Override
    public String toString() {
        return  getClass().getSimpleName() +"{ Model: " + model + ", Color: " + color +
                ", Year: " + year + ", Price: " + price + " }";
    }
}

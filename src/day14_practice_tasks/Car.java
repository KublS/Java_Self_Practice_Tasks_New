package day14_practice_tasks;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make == null || make.isBlank() || make.isEmpty()){
            throw new RuntimeException("Make cannot be null, empty or blank: " + getMake());
        }
        if (model == null || model.isBlank() || model.isEmpty()){
            throw new RuntimeException("Model cannot be null, empty or blank: " + getModel());
        }
        if(year < 1886){
            throw new RuntimeException("Year must not be less than 1886.");
        }
        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new RuntimeException("Invalid input: Price");
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color == null){
            throw new RuntimeException("Color can not be null!");
        }
        if (color.isEmpty()|| color.isBlank()){
            throw new RuntimeException("Color can not be Empty or Blank!");
        }
        this.color = color;
    }


    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println(make + " " + model + " is stopping");
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + " { " +
                "Make: " + make + ", Model: " + model + ", Year: " + year +
                ", Price: $" + price + ", Color: " + color + " }";
    }
}

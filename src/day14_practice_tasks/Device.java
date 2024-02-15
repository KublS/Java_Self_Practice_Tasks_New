package day14_practice_tasks;

public abstract class Device {

    private final String brand, model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery,
                  boolean hasPowerButton) {
        if (brand == null){
            throw new RuntimeException("Brand cannot be null");
        }
        if ( brand.isBlank() || brand.isEmpty()){
            throw new RuntimeException("Brand cannot be Blank or Empty");
        }

        if (model == null){
            throw new RuntimeException("Model cannot be null");
        }
        if ( model.isBlank() || model.isEmpty()){
            throw new RuntimeException("Model cannot be Blank or Empty");
        }

        if (size == null){
            throw new RuntimeException("Size cannot be null");
        }
        if ( size.isBlank() || size.isEmpty()){
            throw new RuntimeException("Size cannot be Blank or Empty");
        }

        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setPrice(double price) {
        if (price <=0 ){
            throw new RuntimeException("Price can not be negative or zero!");
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color == null){
            throw new RuntimeException("Color cannot be null");
        }
        if ( color.isBlank() || size.isEmpty()){
            throw new RuntimeException("Color cannot be Blank or Empty");
        }
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                " Brand:" + brand + ", Model: " + model + ", Price: $" + price +
                ", Color " + color + ", Size " + size + ", hasBattery: " + hasBattery +
                ", hasPowerButton: " + hasPowerButton +
                '}';
    }
}


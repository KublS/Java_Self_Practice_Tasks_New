package day13_practice_tasks;

public class Samsung {
    private String brand, model, size;
    private double price;
    private String color;

    public Samsung(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getSize() {
        return size;
    }
    public double getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        if (brand == null){
            throw new RuntimeException("Wrong input in the: BRAND");
        }
        if (brand.isEmpty() || brand.isBlank()){
            throw new RuntimeException("Wrong input in the: BRAND");
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null){
            throw new RuntimeException("Wrong input in the: MODEL");
        }
        if (model.isEmpty() || model.isBlank()){
            throw new RuntimeException("Wrong input in the: MODEL");
        }
        this.model = model;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw new RuntimeException("Price can not be negative or 0!");
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color == null){
            throw new RuntimeException("Wrong input in the: COLOR");
        }
        if (color.isEmpty() || color.isBlank()){
            throw new RuntimeException("Wrong input in the: COLOR");
        }
        this.color = color;
    }

    public void call(){
        System.out.println("calling the number +0987654321");
    }
    public void text(){
        System.out.println("texting to the number +0987654321");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"\n" +
                "Brand: " + brand +
                ", Model: " + model  +
                ", Size: " + size  +
                ", Price: " + price +
                ", Color: " + color;

    }
}

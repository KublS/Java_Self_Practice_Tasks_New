package day12_practice_tasks;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setQuantity(int quantity) {
        if (quantity < 1){
            System.out.println("Quantity of candy cannot be negative or zero");
            System.exit(1);
        }
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        if (price < 0){
            System.out.println("Price of candy cannot be negative");
            System.exit(1);
        }
        this.price = price;
    }
    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {
        if (price == 0){
            return "Candy brand: " + brand + ". Quantity: " + quantity + ". Price: Free" +
                    ". Has Peanuts: " + hasPeanuts;
        } else {
            return "Candy brand: " + brand + ". Quantity: " + quantity + ". Price: " + price +
                    ". Has Peanuts: " + hasPeanuts;
        }
    }
}

package day12_practice_tasks;
public class Item {

    private String name;
    private double untPrice;
    private int quantity;

    public Item(String name, double untPrice, int quantity) {
        setName(name);
        setUntPrice(untPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }
    public double getUntPrice() {
        return untPrice;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()){
            System.err.println("Section Name is blank or empty");
            System.exit(1);
        }
        for (int i = 0; i < name.toCharArray().length; i++) {
            if (!Character.isLetterOrDigit(name.charAt(i)) && !Character.isSpaceChar(name.charAt(i))){
                System.err.println("Inappropriate character");
                System.exit(1);
            } else if (!Character.isLetter(name.charAt(0))){
                System.err.println("First symbol needs to be letter");
                System.exit(1);
            }
        }
        this.name = name;
    }
    public void setUntPrice(double untPrice) {
        if (untPrice < 1){
            System.err.println("Unit Price can not be negative!");
            System.exit(1);
        }
        this.untPrice = untPrice;
    }
    public void setQuantity(int quantity) {
        if (quantity < 1){
            System.err.println("Quantity can not be negative!");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double totalCost(){
        double finalAmount = quantity * untPrice;
        return finalAmount;
    }

    @Override
    public String toString() {
        return "Item name: " + name + ". Price per unit: " + untPrice +
                ". Quantity: " + quantity + ". Total Price: $" + totalCost();
    }
}

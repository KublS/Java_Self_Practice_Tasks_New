package day07_practice_tasks;

public class Item {

    public String itemName;
    public double unitPrice;
    public int quantity;


    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total=" + unitPrice * quantity +
                '}';
    }
}


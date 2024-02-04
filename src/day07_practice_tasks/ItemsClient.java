package day07_practice_tasks;

public class ItemsClient {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "Apple";
        item1.unitPrice = 3.79;
        item1.quantity = 4;

        System.out.println(item1);
        System.out.println("-------------------");

        Item item2 = new Item ();
        item2.itemName = "Chicken";
        item2.unitPrice = 6.99;
        item2.quantity = 2;

        System.out.println(item2);
    }
}

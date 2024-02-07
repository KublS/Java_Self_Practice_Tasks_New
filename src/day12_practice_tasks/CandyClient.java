package day12_practice_tasks;

public class CandyClient {
    public static void main(String[] args) {

        Candy candy1 = new Candy("KitKat", 10, 4.99, false);
        System.out.println(candy1);

        System.out.println("---------------------------------");

        Candy candy2 = new Candy("Twix", 5, 0, false);
        System.out.println(candy2);

        System.out.println("---------------------------------");

        Candy candy3 = new Candy("Kinder", 1, 9.99, true);
        System.out.println(candy3);


    }
}

package day11_practice_tasks;

public class CarpetClient {
    public static void main(String[] args) {
        Carpet carpetClient1 = new Carpet(2.5, 13.6, 11.0, true);
        System.out.println("Your price is: $" + carpetClient1.cost);
        System.out.println(carpetClient1);

        Carpet carpetClient2 = new Carpet(2.5, 13.6, 11.0, false);
        System.out.println("Your price is: $" + carpetClient2.cost);
        System.out.println(carpetClient2);

        Carpet carpetClient3 = new Carpet(10.5, 8.6, 17.0, true);
        System.out.println("Your price is: $" + carpetClient3.cost);
        System.out.println(carpetClient3);

    }
}

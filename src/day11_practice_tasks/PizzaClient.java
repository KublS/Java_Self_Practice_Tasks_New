package day11_practice_tasks;

public class PizzaClient {
    public static void main(String[] args) {

        Pizza pizzaOrder1 = new Pizza("small", 2, 5);
        System.out.println("Your total is: $" + pizzaOrder1.cost);
        System.out.println(pizzaOrder1);
        System.out.println("----------------------------------");

        Pizza pizzaOrder2 = new Pizza("Medium");
        System.out.println("Your total is: $" + pizzaOrder2.cost);
        System.out.println(pizzaOrder2);
        System.out.println("----------------------------------");

        Pizza pizzaOrder3 = new Pizza("Large", 4);
        System.out.println("Your total is: $" + pizzaOrder3.cost);
        System.out.println(pizzaOrder3);
        System.out.println("----------------------------------");

        Pizza pizzaOrder4 = new Pizza();
        System.out.println("Your total is: $" + pizzaOrder4.cost);
        System.out.println(pizzaOrder4);







    }
}

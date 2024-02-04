package day07_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your order (Product, Price, Quantity, your Name)");
        String productName = input.nextLine();
        double productPrice = input.nextDouble();
        int productQuantity = input.nextInt();
        String firstName = input.next();
        input.close();
        double totalPrice = productPrice * productQuantity;
        System.out.println(firstName + ", your order " + productQuantity + " " +
                productName + " has been placed. Your total is $" + totalPrice);

    }
}

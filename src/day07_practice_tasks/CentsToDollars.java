package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cents: ");

        int amountOfCents = input.nextInt();
        int a = amountOfCents / 100;
        int b = amountOfCents - a * 100;
        input.close();
        System.out.println(amountOfCents + " cents is equal to " + a + " dollars and " + b + " cents");

    }
}

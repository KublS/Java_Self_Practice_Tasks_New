package day07_practice_tasks;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the miles");
        double miles = input.nextDouble();
        double kilometers = miles * 1.609;
        input.close();
        System.out.println("----------------------");
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers");

    }


}

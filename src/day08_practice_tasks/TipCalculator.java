package day08_practice_tasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Split or No Split?");
        String answerSplitNoSplit = input.next();
        System.out.println("Enter the number of people");
        int amountOfPeople = input.nextInt();
        System.out.println("Enter the check amount");
        double checkAmount = input.nextDouble();
        System.out.println("Service Quality");
        String serviceQuality = input.next();
        input.close();

        double totalTip = 0;
        if (serviceQuality.equals("Poor")){
                totalTip = checkAmount * 0.05;
        } else if (serviceQuality.equals("Fair")) {
                totalTip = checkAmount * 0.10;
        } else if (serviceQuality.equals("Good")){
                totalTip = checkAmount * 0.15;
        } else if (serviceQuality.equals("Great")){
                totalTip = checkAmount * 0.20;
        } else if (serviceQuality.equals("Excellent")) {
                totalTip = checkAmount * 0.25;
        } else {
                System.err.println("Invalid input, check amount must be greater than 0");
        }
        double totalAmount = checkAmount + totalTip;

        if (answerSplitNoSplit.equals("Yes")){
            double totalPerPerson = totalAmount / amountOfPeople;
            double tipPerPerson = totalTip / amountOfPeople;
            System.out.println("Number of people entered: " + amountOfPeople);
            System.out.println("Total to pay: " + totalAmount);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: " + tipPerPerson);
        } else if (answerSplitNoSplit.equals("No")) {
            String noSplit = "You are not splitted this check";
            System.out.println("Number of people entered: " + amountOfPeople);
            System.out.println("Total to pay: " + totalAmount);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + noSplit);
            System.out.println("Tip per person: " + noSplit);
        }
    }

}

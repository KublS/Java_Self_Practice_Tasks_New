package day08_practice_tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please, provide first name");
        String firstName = input.next();
        System.out.println("Please, provide your last name");
        String lastName = input.next();
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        String capitalFirstName = firstName.substring(0,1);
        capitalFirstName = capitalFirstName.toUpperCase();
        String capitalLastName = lastName.substring(0,1);
        capitalLastName = capitalLastName.toUpperCase();
        firstName = capitalFirstName + firstName.substring(1);
        lastName = capitalLastName + lastName.substring(1);
        System.out.println("Output: " + firstName + " " + lastName);

    }
}

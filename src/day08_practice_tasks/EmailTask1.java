package day08_practice_tasks;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please,input your email");
        String email = input.nextLine();
        if (email.contains("_")){
            int emailUnderScore = email.indexOf("_") ;
            int emailAt = email.indexOf("@");
            email = email.substring(0,emailUnderScore) + email.substring(emailUnderScore,emailAt);
            email = email.substring(emailUnderScore + 1,emailAt) + "_" + email.substring(0,emailUnderScore) + "@gmail.com";
            System.out.println("Output: " + email);
        } else {
            System.out.println("Output: " + email);
        }
    }
}
/*
4. Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

 */

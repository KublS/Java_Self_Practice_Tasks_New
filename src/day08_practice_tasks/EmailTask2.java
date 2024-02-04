package day08_practice_tasks;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, provide your email");
        String email = input.nextLine();
        if (email.contains("_")) {
            int underScore = email.indexOf("_");
            int emailAt = email.indexOf("@");
            int dotCom = email.indexOf(".com");
            String firstName = email.substring(0, underScore);
            String lastName = email.substring(underScore + 1, emailAt);
            String domain = email.substring(emailAt + 1, dotCom);
            String capitalFirstName = firstName.substring(0,1);
            capitalFirstName = capitalFirstName.toUpperCase();
            String capitalLastName = lastName.substring(0,1);
            capitalLastName = capitalLastName.toUpperCase();

            System.out.println("First Name: " + capitalFirstName + firstName.substring(1));
            System.out.println("Last Name: " + capitalLastName + lastName.substring(1));
            System.out.println("Domain: " + domain);
        } else {
            System.err.println("Wrong email!");
        }


    }
}

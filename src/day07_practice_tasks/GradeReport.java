package day07_practice_tasks;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int grade = input.nextInt();

        if (grade <= 0 || grade > 100) {
            System.err.println("Invalid Score");
        } else if (grade < 60) {
            System.out.println("Your grade is F");
        } else if (grade < 70) {
            System.out.println("Your grade is D");
        } else if (grade < 80) {
            System.out.println("Your grade is C");
        } else if (grade < 90) {
            System.out.println("Your grade is B");
        } else {
            System.out.println("Your grade is A");
        }
        input.close();
    }
}

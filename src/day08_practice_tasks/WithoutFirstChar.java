package day08_practice_tasks;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, input your first word");
        String firstWord = input.next();
        System.out.println("Please, input your second word");
        String secondWord = input.next();
        firstWord = firstWord.substring(1);
        secondWord = secondWord.substring(1);
        System.out.print("Output: " + firstWord + secondWord);

    }
}

package day08_practice_tasks;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, input your first word");
        String firstWord = input.next();
        System.out.println("Please, input your second word");
        String secondWord = input.next();
        if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)) {
            secondWord = secondWord.substring(1);
            System.out.println("Output: " + firstWord + secondWord);
        } else {
            System.out.println("Output: " + firstWord + " " + secondWord);
        }

    }
}

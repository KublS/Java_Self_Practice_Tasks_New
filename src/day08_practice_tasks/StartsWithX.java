package day08_practice_tasks;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a word");
        String inputWord = input.next();
        if (inputWord.charAt(0) == 'x'){
            inputWord = inputWord.replaceFirst("x","a");
            System.out.println("Output: " + inputWord);
            return;
        }System.out.println("Output: " + inputWord);

    }
}

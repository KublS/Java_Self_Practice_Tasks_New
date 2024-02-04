package day10_practice_tasks;


import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd',
                '@', '!', '3', '4'));
        ArrayList<Character>list2 = new ArrayList<>();

        for (Character eachCharacter : list) {
            if (Character.isDigit(eachCharacter) || !Character.isLetterOrDigit(eachCharacter)){
                list2.add(eachCharacter);
            }
        }System.out.println(list2);

    }
}


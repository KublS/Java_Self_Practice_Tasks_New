package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David",
                "Lan", "Abida", "Ebrahim", "Farida"));
        ArrayList<String> list2 = new ArrayList<>();
        for (String eachElement : list) {
            ArrayList<String> list3 = new ArrayList<>(Arrays.asList(eachElement));
            for (String eachSymbol : list3) {
                if (!(eachSymbol.toLowerCase().charAt(0) == eachSymbol.toLowerCase().charAt(eachSymbol.length()-1))){
                   list2.addAll(list3);
                }
            }
        }
        System.out.println(list2);
    }
}

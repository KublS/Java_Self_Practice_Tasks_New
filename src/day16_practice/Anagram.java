package day16_practice;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

        Set<Character> set1 = new LinkedHashSet<>();
        for (char each : str1.toCharArray()) {
            set1.add(each);
        }

        Set<Character> set2 = new LinkedHashSet<>();
        for (char each : str2.toCharArray()) {
            set2.add(each);
        }

        boolean anagram = set1.equals(set2);
        System.out.println("Is this an anagram? " + anagram);


    }
}

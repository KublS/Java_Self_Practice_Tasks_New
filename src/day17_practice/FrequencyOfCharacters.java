package day17_practice;

import java.sql.Array;
import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        Map<Character, Integer> map = new LinkedHashMap<>();

        ArrayList<Character> list = new ArrayList<>();

        for (char eachChar : str.toCharArray()) {
            list.add(eachChar);
            int count = Collections.frequency(list, eachChar);
            map.put(eachChar,count);

        }
        System.out.println(map);

    }

}

package day17_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MultiplyOdds {
    public static void main(String[] args) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        System.out.println(map);


        for (Character eachKey : map.keySet()) {
            if (eachKey % 2 != 0 ){
                map.put(eachKey, map.get(eachKey)*2);
            }
        }
        System.out.println("Output: " + "\n" + map);


    }
}

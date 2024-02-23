package day17_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MergeMaps {
    public static void main(String[] args) {

        Map<Character, Integer> map1 = new LinkedHashMap<>();
        map1.put('A', 10);
        map1.put('B', 20);

        Map<Character, Integer> map2 = new LinkedHashMap<>();
        map2.put('B', 30);
        map2.put('C', 40);


        for (Character eachKey : map2.keySet()) {
            if (map1.containsKey(eachKey)){
                map1.put(eachKey, map1.get(eachKey) + map2.get(eachKey));
            } else {
                map1.put(eachKey, map2.get(eachKey));
            }

        }
        System.out.println(map1);


    }

}

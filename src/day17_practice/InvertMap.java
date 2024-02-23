package day17_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "\"a\"");
        map.put(2, "\"b\"");
        map.put(3, "\"c\"");
        System.out.println(map);

        Map<String, Integer> invertMap = new LinkedHashMap<>();

        for (Integer eachKey : map.keySet()) {
            invertMap.put(map.get(eachKey), eachKey );
        }
        System.out.println(invertMap);
    }
}

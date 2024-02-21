package day16_practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CommonElements {

    public static void main(String[] args) {

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(10, 8, 11, 20, 5, 0));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));

        Set<Integer> set3 = new TreeSet<>();

        for (Integer eachElement : set1) {
            if (set2.contains(eachElement)){
                set3.add(eachElement);
            }
        }
        System.out.println(set3);
    }
}

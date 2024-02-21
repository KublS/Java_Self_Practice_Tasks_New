package day16_practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {

        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 5));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(2, 3, 4));

        for (Integer each : set2) {
            if (set1.contains(each)){
                set1.remove(each);
            }
        }
        System.out.println(set1);
    }
}

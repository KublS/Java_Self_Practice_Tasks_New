package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!list2.contains(list.get(i))){
                list2.add(list.get(i));
            }
        }
        System.out.println(list2);


    }
}

package day16_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeLists {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        for (Integer each : list2) {
           if (!list3.contains(each)){
               list3.add(each);
           }
        }
        System.out.println(list3);



    }



}

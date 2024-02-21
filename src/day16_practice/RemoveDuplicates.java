package day16_practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(20,15,10,20,30,10,20,15,0));

        Set<Integer> listUnique = new TreeSet<>(list);

        System.out.println(listUnique);
    }



}
/*
Second Way
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(20,15,10,20,30,10,20,15,0));

        Set<Integer> listUnique = new TreeSet<>();

        for (Integer eachElement : list) {
            if(!listUnique.contains(eachElement)){
                listUnique.add(eachElement);
            }
        }

        System.out.println(listUnique);

 */

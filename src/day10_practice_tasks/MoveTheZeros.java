package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MoveTheZeros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        Collections.sort(list);
        Collections.rotate(list, 4);
        System.out.println(list);
    }
}

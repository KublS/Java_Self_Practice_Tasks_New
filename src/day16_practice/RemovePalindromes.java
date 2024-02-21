package day16_practice;

import java.util.*;

public class RemovePalindromes {
    public static void main(String[] args) {
        //NOT FINISHED

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam")
        );

        ArrayList<String> list2 = new ArrayList<>();

        for (String eachElement : list) {
            ArrayList<Character> flow = new ArrayList<>();
            for (int i = 0; i < eachElement.toCharArray().length; i++) {
                flow.add(eachElement.charAt(i));
            }
            ArrayList<Character> reverseFlow = new ArrayList<>();
            for (int i = eachElement.toCharArray().length - 1; i >= 0; i--) {
                reverseFlow.add(eachElement.charAt(i));
            }

            if (!flow.equals(reverseFlow)){
                list2.add(eachElement);
            }
            list = list2;

        }
        System.out.println(list);
    }


}
/*
for (int i = 0; i < eachElement.toCharArray().length; i++) {
                Stack<Character> stack1 = new Stack<>();
                stack1.push(e)

            }
            for (int i = eachElement.toCharArray().length - 1; i >= 0; i--) {

            }
            list.remove(eachElement);
 */
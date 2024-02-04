package day09_practice_tasks;

import java.util.Arrays;

public class StudentGrade {
    public static void main(String[] args) {
        String[] names = {"Melinda", "Tom", "Julia", "Douglas", "Jessica"};
        int[] scores = {90, 75, 80, 63, 90};

        char[] grades = new char[5];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 100 || scores[i] < 1) {
                continue;
            }
            if (scores[i] < 60) {
                grades[i] = 'F';
            } else if (scores[i] < 70){
                grades[i] = 'D';
            } else if (scores[i] < 80){
                grades [i] = 'C';
            } else if (scores[i] < 90){
                grades [i] = 'B';
            } else {
                grades[i] = 'A';
            }
        }
        System.out.println(Arrays.toString(grades));
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "'s" + " score is " + scores[i] + ", and grade is " + grades[i]);
        }

    }

}


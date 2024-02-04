package day04_practice_tasks;

public class Task5Grade {
    public static void main(String[] args) {
        char grade = 'C';
        if (grade == 'A') {
            System.out.println("Exvellent!");
        } else if (grade == 'B') {
            System.out.println("Great job!");
        } else if (grade == 'C') {
            System.out.println("Good");
        } else if (grade == 'D') {
            System.out.println("Passed");
        } else if (grade == 'F') {
            System.out.println("Failed");
        } else {
            System.out.println("Invalid Grade");
        }
    }
}

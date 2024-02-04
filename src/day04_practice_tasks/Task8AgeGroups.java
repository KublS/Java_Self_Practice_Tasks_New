package day04_practice_tasks;

public class Task8AgeGroups {
    public static void main(String[] args) {

        int age = 56;
        if ( age>0 & age<150) {
            if (age >= 0 & age <= 20) {
                System.out.println("Teenager");
            } else if (age >= 21 & age <= 55) {
                System.out.println("Adult");
            } else if (age > 55) {
                System.out.println("Senior");
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}

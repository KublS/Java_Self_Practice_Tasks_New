package day04_practice_tasks;

public class Task6GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel = 19;
        if (gradeLevel >= 1 && gradeLevel <= 5){
            System.out.println("Elementary School");
        } else if (gradeLevel >= 6 && gradeLevel <= 8){
            System.out.println("Middle School");
        } else if (gradeLevel >= 9 && gradeLevel <= 12){
            System.out.println("High School");
        } else if (gradeLevel >= 13 && gradeLevel <= 16){
            System.out.println("College");
        } else if (gradeLevel >= 17 && gradeLevel <= 18){
            System.out.println("Grad School");
        } else {
            System.out.println("Invalid grade level");
        }


    }
}

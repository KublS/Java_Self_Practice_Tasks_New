package day06_practice_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {
        double income = salary(45,40);
        System.out.println("Your income is = " + income);
    }

    public static double salary (double hourlyRate, int hours){
        double salary = hourlyRate * hours;
        return salary;
    }
}

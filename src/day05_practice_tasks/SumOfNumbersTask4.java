package day05_practice_tasks;

public class SumOfNumbersTask4 {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers : " + sum);
    }
}

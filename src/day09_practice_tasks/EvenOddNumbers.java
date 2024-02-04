package day09_practice_tasks;

public class EvenOddNumbers {
    public static void main(String[] args) {

        int[] numbers = {2, 2, 0, 4, 5, 6, 8};
        int Even = counter(numbers);
        int Odd = numbers.length - counter(numbers);

        System.out.println("The array has " + Odd + " numbers and " + Even + " Even numbers.");
    }
    public static int counter(int[] numbers) {
        int counterEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 || numbers[i] == 0) {
                counterEven++;
            }
        }return counterEven;
    }
}

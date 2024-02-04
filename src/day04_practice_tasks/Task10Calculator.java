package day04_practice_tasks;

public class Task10Calculator {
    public static void main(String[] args) {
        double n1 = 4.434;
        double n2 = -1.56;
        char mathOperator = '*';
        switch (mathOperator){
            case '+' -> System.out.println(n1 + n2);
            case '-' -> System.out.println(n1-n2);
            case '*' -> System.out.println(n1*n2);
            case '/' -> System.out.println(n1 / n2);
            default -> System.out.println("Invalid operator");
        }
    }
}

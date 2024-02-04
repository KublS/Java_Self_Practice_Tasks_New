package day06_practice_tasks;

public class MathUtility {
    public static void main(String[] args) {
        int resultI = calculate(15, '+', 16);
        System.out.println(resultI);
        double resultD = calculate(15.4, '+',6.8);
        System.out.println(resultD);
        System.out.println(square(10));
        System.out.println(square(8.78));
        System.out.println(cube(4));
        System.out.println(cube(8.23));
    }
    public static int calculate (int num1, char mathOperator, int num2 ){
        int result;
        switch (mathOperator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> result = 0;
        }
        return result;
    }
    public static double calculate (double num1, char mathOperator, double num2 ){
        double result;
        switch (mathOperator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> result = 0;
        }
        return result;
    }
    public static int square (int x){
        return x * x;
    }
    public static double square (double x){
        return x * x;
    }
    public static int cube (int x){
        return x * x * x;
    }
    public static double cube (double x){
        return x * x * x;
    }

}

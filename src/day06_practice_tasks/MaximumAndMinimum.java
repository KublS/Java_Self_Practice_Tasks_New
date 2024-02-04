package day06_practice_tasks;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int maxA = max(33,48);
        System.out.println("maxA = " + maxA);
        double maxB = max(233.5, 1223.51);
        System.out.println("maxB = " + maxB);
        int minA = min(9, 22);
        System.out.println("minA = " + minA);
        double minB = min (11.1,11.2);
        System.out.println("minB = " + minB);
    }
    public static int max (int num1, int num2){
        if (num1>num2){
            return num1;
        } else{
            return num2;
        }
    }
    public static double max (double num1, double num2){
        if (num1>num2){
            return num1;
        } else{
            return num2;
        }
    }
    public static int min (int num1, int num2){
        if (num1<num2){
            return num1;
        } else{
            return num2;
        }
    }
    public static double min (double num1, double num2){
        if (num1<num2){
            return num1;
        } else{
            return num2;
        }

    }

}

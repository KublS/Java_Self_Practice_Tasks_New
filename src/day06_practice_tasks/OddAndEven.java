package day06_practice_tasks;

public class OddAndEven {

    public static void main(String[] args) {
        boolean result = isOdd(16);
        System.out.println(result);

        result = isEven(88);
        System.out.println(result);
    }
    public static boolean isOdd (int num){
        if (num%2!=0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isEven (int num){
        if (num%2==0){
            return true;
        } else {
            return false;
        }
    }
}

package day05_practice_tasks;

public class FactoriaNumberTask5 {
    public static void main(String[] args) {
        int num = 4;
        int mul = 1;
        if (mul != 1){
            System.out.println("Invalid");
        } else if ( mul == 1 ){
            for (int i = num; i >= 1 ; i--) {
                mul *= i;
            }
            System.out.println(mul);
        }

    }
}

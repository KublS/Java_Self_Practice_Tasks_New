package day04_practice_tasks;

public class Task2OxygenTank {
    public static void main(String[] args) {
        int oxygen = 61;

        if (oxygen >= 90){
            System.out.println("Your tank is full");
        } else if (oxygen <= 89 & oxygen >= 80) {
            System.out.println("Still okay");
        } else if (oxygen <= 79 & oxygen >= 70) {
            System.out.println("Don't go too far");
        } else if (oxygen <= 69 & oxygen >= 60){
            System.out.println("Start to head back");
        } else if (oxygen <= 59 & oxygen >= 50){
            System.out.println("Be careful, you're at 50%");
        } else {
            System.out.println("You are on a critical level");
        }
    }
}

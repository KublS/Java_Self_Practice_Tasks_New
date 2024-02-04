package day04_practice_tasks;

public class Task7CrewAndPassenger {
    public static void main(String[] args) {

        int total = 100;
        if ( total == 50){
            System.out.println("20 crew, 30 passengers");
        } else if (total == 75) {
            System.out.println("25 crew, 50 passengers");
        } else if (total == 100 ){
            System.out.println("30 crew, 70 passengers");
        } else {
            System.out.println("Invalid number!");
        }
    }
}

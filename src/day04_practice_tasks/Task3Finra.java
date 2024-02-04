package day04_practice_tasks;

public class Task3Finra {
    public static void main(String[] args) {

        int number = 25;

        if ((number%5==0)&(number%3==0)) {
            System.out.println("FINRA");
        } else {
            if (number % 3 == 0) {
                System.out.println("FIN");
            } else if (number % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println("Number doesn't fit");
            }
        }
            }
        }






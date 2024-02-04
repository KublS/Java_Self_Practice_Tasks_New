package day04_practice_tasks;

public class Task4MedianNumber {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int c = 10;
        int median = (a+b+c) / 3;
        if (a==b){
            System.out.println("Invalid");
        } else if (a==c){
            System.out.println("Invalid");
        } else if (b==c){
            System.out.println("Invalid");
        } else {
            System.out.println(median +" is the median number");
        }

        }
    }


package day05_practice_tasks;

public class AlphabetsTask8 {
    public static void main(String[] args) {
        char capital = 'A';
        char lower = 'a';
        for (capital = 'A' ; capital <= 'Z'; capital++) {
            System.out.println();
            for (lower = 'a'; lower < 'z'; lower++) {
                System.out.print(capital + "" + lower + " ");
            }

        }
    }
}

package day09_practice_tasks;

public class ArrayElements {
    /*
   1.Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
     */
    public static void main(String[] args) {
        int[] lengthOf100 = new int [100];
        for (int i = 0; i < lengthOf100.length; i++) {
            lengthOf100[i] = i + 1;
            System.out.print(lengthOf100[i] + " ");
        }
        System.out.println();

        /*int[] reversedLengthOf100 = new int[lengthOf100.length];
        for (int i = lengthOf100.length - 1, j = 0; i >= 0; i--, j++) {
            reversedLengthOf100[j] = lengthOf100[i];
            System.out.print(reversedLengthOf100[j] + " ");
        }

         */
        for (int i = lengthOf100.length - 1; i >= 0; i--) {
            System.out.print(lengthOf100[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < lengthOf100.length; i++) {
            if (lengthOf100[i] % 5 == 0){
                System.out.print(lengthOf100[i] + " ");
            }
        }




    }


}
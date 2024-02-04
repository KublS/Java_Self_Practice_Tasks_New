package day09_practice_tasks;

import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        int[] result = reversedArray(arr1);
        System.out.println(Arrays.toString(result));
        }

        public static int[] reversedArray(int[] array){
            int[] arr2 = new int[array.length];
            for (int i = array.length - 1, j= 0; i >= 0; i--, j++) {
                arr2[j] = array[i];
            }
            return arr2;
        }
    }




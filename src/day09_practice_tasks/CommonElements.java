package day09_practice_tasks;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {8, 12, 45, 0, 33};
        int[] arr2 = {9, 13, 44, 1, 32};

        commonElements(arr1,arr2);
    }
    public static int commonElements( int[] array1, int[] array2){
        int common = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    common = array1[i];
                    System.out.println(common);
                }
            }

        }return common;
    }

}

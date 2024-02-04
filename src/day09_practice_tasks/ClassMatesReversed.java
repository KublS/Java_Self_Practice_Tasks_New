package day09_practice_tasks;

public class ClassMatesReversed {
    public static void main(String[] args) {
        String[] classMates= {"John Johnson", "Jack Miller", "Henry Garcia", "Frank Wilson", "Garry Kepp",
                "Melinda Jenkins", "Tom Ford", "Julia Roberts", "Douglas Miller", "Jessica Stevens"};

        reverseArray(classMates);

    }

    private static String[] reverseArray(String[] array) {
        String[] reversedClassMates = new String[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            reversedClassMates[j] = array[i];
            System.out.println(reversedClassMates[j]);
        }
        return reversedClassMates;
    }
}

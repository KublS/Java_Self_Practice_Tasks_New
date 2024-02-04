package day09_practice_tasks;

public class ClassMatesInitials {
    public static void main(String[] args) {

        String[] classMatesNames = {"John Johnson", "Jack Miller", "Henry Garcia", "Frank Wilson", "Garry Kepp",
                "Melinda Jenkins", "Tom Ford", "Julia Roberts", "Douglas Miller", "Jessica Stevens"};
        for (int i = 0; i < classMatesNames.length; i++) {
            classMatesNames[i] = classMatesNames[i].charAt(0) + "." + classMatesNames[i].charAt(classMatesNames[i].indexOf(' ')+ 1) + ".";
            System.out.println(classMatesNames[i]);
        }
    }
}

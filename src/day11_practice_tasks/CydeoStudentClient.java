package day11_practice_tasks;

public class CydeoStudentClient {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Sam", 24, 4308, 33, 12, 'A');
        System.out.println(student1.isStudying());
        System.out.println(student1.isAttendingLiveSession());
        System.out.println(student1.schoolName);
        System.out.println(student1.programmingLanguage);
        System.out.println(student1);

        System.out.println("--------------------------------");
        
        CydeoStudent student2 = new CydeoStudent("Jill", 20, 3434, 33, 01, 'A');
        System.out.println(student2.isStudying());
        System.out.println(student2.isAttendingLiveSession());
        System.out.println(student2.schoolName);
        System.out.println(student2.programmingLanguage);
        System.out.println(student2);

        System.out.println("--------------------------------");

        CydeoStudent student3 = new CydeoStudent("Jack", 28, 1200, 33, 15, 'A');
        System.out.println(student3.isStudying());
        System.out.println(student3.isAttendingLiveSession());
        System.out.println(student3.schoolName);
        System.out.println(student3.programmingLanguage);
        System.out.println(student3);




        
        
        

    }
}

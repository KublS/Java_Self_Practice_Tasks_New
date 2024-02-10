package day13_practice_tasks;

public class StudentClients {
    public static void main(String[] args) {

        GraduateStudent graduateStudent = new GraduateStudent("John", 21, "Male",
                "S2341", "Chemistry", 'A', "Community College");
        System.out.println(graduateStudent);
        graduateStudent.study();
        graduateStudent.walking();
        System.out.println(graduateStudent.getGender());

        System.out.println("---------------------------------------");

        UnderGraduateStudent underGraduateStudent = new UnderGraduateStudent("Tom", 18, "Male",
                "A543", "Management", 'F', "State College");
        System.out.println(underGraduateStudent);
        System.out.println(underGraduateStudent.getStudentId());
        underGraduateStudent.skipClasses();
        underGraduateStudent.study();
        underGraduateStudent.riskZone();

        System.out.println("---------------------------------------");

        CydeoStudent cydeoStudent = new CydeoStudent("Sam", 24, "Male", "C010",
                "SDET", 'A', "Cydeo", 33,
                12, "Java");
        System.out.println(cydeoStudent);
        cydeoStudent.study();
        System.out.println(cydeoStudent.getBatchNumber());
        cydeoStudent.writingHomeWork();
        System.out.println(cydeoStudent.getName());


    }
}

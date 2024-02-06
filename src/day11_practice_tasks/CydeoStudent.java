package day11_practice_tasks;

public class CydeoStudent {
    public String name;
    public int age, id, batchNumber, groupNumber;
    public char grade;
    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";


    public CydeoStudent(String name, int age, int id, int batchNumber, int groupNumber, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public String isStudying (){
        String studyProcess = name + " is studying";
        return studyProcess;
    }

    public String isAttendingLiveSession (){
        String studentisAttendingLiveSession = name + " is attending the live class.";
        return studentisAttendingLiveSession;
    }
    

    public String toString() {
        return "Student name: " + name + ", age: " + age +
                ". Id number: " + id + ". Batch Number: " + batchNumber +
                ". Group Number: " + groupNumber + ". Student score: " + grade;
    }
}

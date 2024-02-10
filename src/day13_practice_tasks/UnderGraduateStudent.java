package day13_practice_tasks;

public class UnderGraduateStudent extends Student1{

    public UnderGraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public void riskZone(){
        if (getAge() < 21){
            System.out.println(getName() + " ID Number: " + getStudentId() + " the main contact of this student should" +
                    "be notified of bad results" );
        }
    }
    @Override
    public void study(){
        System.out.println(getName() + " is studying in " + getSchoolName());
    }

    public void skipClasses (){
        System.out.println(getName() + " " +getStudentId() + " doesn't attend college classes");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

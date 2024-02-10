package day13_practice_tasks;

public class Student1 extends Student{
    private String studentId, fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student1(String name, int age, String gender, String studentId, String fieldOfStudy
                    , char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }


    public String getStudentId() {
        return studentId;
    }
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
    public char getGrade() {
        return grade;
    }
    public String getSchoolName() {
        return schoolName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName() + " is studying in " + getSchoolName());
    }

    @Override
    public String toString() {
        return super.toString() +
                " studentId: " + studentId +
                ", FieldOfStudy: " + fieldOfStudy +
                ", Grade: " + grade +
                ", SchoolName: " + schoolName;

    }
}

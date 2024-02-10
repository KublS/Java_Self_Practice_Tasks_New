package day13_practice_tasks;

public class CydeoStudent extends Student1{
    public CydeoStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName,
                        int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }
    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public int getBatchNumber() {
        return batchNumber;
    }
    public int getGroupNumber() {
        return groupNumber;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void study() {
        super.study();
    }

    public void writingHomeWork(){
        System.out.println("Student " + getName() + " from group - " +  getGroupNumber() +
                " working on homework now");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", BatchNumber: " + batchNumber +
                ", GroupNumber: " + groupNumber +
                ", ProgrammingLanguage: " + programmingLanguage;
    }
}

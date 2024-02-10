package day13_practice_tasks;
public class Teacher extends Employee{
    {
        System.out.println("If this teacher is a substitute teacher, request the last months time sheet");
    }
    public Teacher(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is teaching");
    }

}

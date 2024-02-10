package day13_practice_tasks;
import static java.lang.Math.*;
public class Tester extends Employee{
    public Tester(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    public void salaryRate(){
        if (getSalary() < 80_000){
            double percentage =(getSalary() - 80_000) / 80_000;
            System.out.println("Your salary rate " + percentage + " % below than average compensation in your area." +
                    " You need to work more on your skills to improve your salary");
        } else if (getSalary() >= 80_000){
            double percentage = (getSalary() - 80_000)/80_000;
            System.out.println("Your salary rate " + percentage + " % above than average compensation in your area.");

        }
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }

}

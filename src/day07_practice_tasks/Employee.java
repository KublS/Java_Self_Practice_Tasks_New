package day07_practice_tasks;

public class Employee {

    public String name, jobTitle;
    public int age;
    public char gender;
    public double salary;

    public void work (){
        System.out.println(jobTitle + name + "is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary= $" + salary +
                '}';
    }
}

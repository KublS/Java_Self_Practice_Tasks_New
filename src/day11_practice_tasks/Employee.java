package day11_practice_tasks;

public class Employee {

    public String name, jobTitle;
    public int age;
    public char gender;
    public double salary;

    public String workingStatus;

    public Employee() {
        System.out.println("No valid info!");
    }

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.workingStatus = isWorking(name, jobTitle);
    }

    public Employee(String name, String jobTitle, double salary) {
        this(name, jobTitle);
        this.salary = salary;
        this.workingStatus = isWorking(name, jobTitle);
    }

    public Employee(String name, String jobTitle, int age, double salary) {
        this(name, jobTitle, salary);
        this.age = age;
        this.workingStatus = isWorking(name, jobTitle);
    }

    public Employee(String name, String jobTitle, int age, char gender, double salary) {
        this(name, jobTitle, age, salary);
        this.gender = gender;
        this.workingStatus = isWorking(name, jobTitle);
    }

    public String isWorking (String name, String jobTitle){
        String result = "";
        result = jobTitle + " " + name + " is working.";
        return result;
    }

    public String toString() {
        return "Employee name: "+ name + ", job title: " + jobTitle + ", age: " + age +
                ", gender: " + gender + ", salary: $" + salary;
    }
}

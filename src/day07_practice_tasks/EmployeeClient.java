package day07_practice_tasks;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "John ";
        employee1.jobTitle = "Administrator ";
        employee1.age = 24;
        employee1.gender = 'M';
        employee1.salary = 70_000;

        employee1.work();
        System.out.println(employee1);

        System.out.println("----------------------");
        
        Employee employee2 = new Employee();
        employee2.name = "Maria ";
        employee2.jobTitle = "Developer ";
        employee2.age = 29;
        employee2.gender = 'F';
        employee2.salary = 135_000;

        employee2.work();
        System.out.println(employee2);

        System.out.println("----------------------");

        Employee employee3 = new Employee();
        employee3.name = "Jack ";
        employee3.jobTitle = "SDET ";
        employee3.age = 25;
        employee3.gender = 'M';
        employee3.salary = 120_000;

        employee3.work();
        System.out.println(employee3);

    }
}

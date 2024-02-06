package day11_practice_tasks;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee employee1 = new Employee ("Sam", "SDET");
        System.out.println(employee1.workingStatus);
        System.out.println(employee1);

        System.out.println("--------------------------------------");

        Employee employee2 = new Employee ("John", "Developer", 30, 140_000);
        System.out.println(employee2.workingStatus);
        System.out.println(employee2);

        System.out.println("--------------------------------------");

        Employee employee3 = new Employee ("Sara", "Product Manager", 30, 'W' , 110_000);
        System.out.println(employee3.workingStatus);
        System.out.println(employee3);

        System.out.println("--------------------------------------");

        Employee employee4 = new Employee ();
        System.out.println(employee4.workingStatus);
        System.out.println(employee4);
    }
}

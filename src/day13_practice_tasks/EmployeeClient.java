package day13_practice_tasks;

public class EmployeeClient {
    public static void main(String[] args) {

        Tester tester = new Tester("Sam", 24, "Male", "A111",
                "SDET", 113_000, "Oracle");
        System.out.println(tester);
        tester.work();
        System.out.println(tester.getAge());
        tester.salaryRate();
        System.out.println(tester.getCompanyName());

        System.out.println("-----------------------");

        Developer developer = new Developer("Jimmy", 32, "Male", "D54B7",
                "Software Engineer", 190_000, "Cisco", "C#" );
        System.out.println(developer);
        developer.work();
        System.out.println(developer.getProgrammingLanguage());

        System.out.println("-----------------------");

        Teacher teacher = new Teacher("Anna", 29, "Female", "DB43",
                "Substitute Teacher", 50_000, "Elementary School");
        System.out.println(teacher);
        teacher.work();
        System.out.println(teacher.getEmployeeId());

        System.out.println("-----------------------");

        Driver driver = new Driver("Peter", 18, "Male", "ID133098",
                "Local Driver", 70_000, "H&K Transport", "Yes");
        System.out.println(driver);
        driver.work();
        System.out.println(driver.getGender());
        driver.carInsuranceRate();
        System.out.println(driver.getName());


    }
}

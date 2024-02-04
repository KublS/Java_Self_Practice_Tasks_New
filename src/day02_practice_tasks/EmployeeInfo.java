package day02_practice_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {
        /* Example:
                employeeName = "Shay";
				age = 24;
				gender = 'F';
				companyName = "Apple Inc";
				jobTitle = "SDET";
				yearsOfExperience = 2.5;
				salary = 120_000;
				isFullTime = true;
				isMarried = false;
				employeeId = "B101";

         */
        String employeeName = "Shay";
        int age = 24;
        char char1 = 70;
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        double salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";

        System.out.println("Employee Name: " + employeeName );
        System.out.println("Gender: " + char1);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company Name: " + companyName);
        System.out.println("Full Time: " + isFullTime);
        System.out.println("Years of work experience: " + yearsOfExperience + " years" );
        System.out.println("Salary: $" + salary);
        System.out.println("Married: " + isMarried);

    }
}

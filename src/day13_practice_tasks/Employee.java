package day13_practice_tasks;

public class Employee extends Person{

    private String employeeId, jobTitle;
    private double salary;
    private String companyName;

    public Employee(String name, int age, String gender, String employeeId, String jobTitle,
                    double salary, String companyName) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }


    public String getEmployeeId() {
        return employeeId;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public double getSalary() {
        return salary;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is working now");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", EmployeeId: " + employeeId +
                ", JobTitle: " + jobTitle +
                ", Salary: " + salary +
                ", CompanyName: " + companyName;

    }
}

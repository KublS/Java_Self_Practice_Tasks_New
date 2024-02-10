package day13_practice_tasks;

public class Driver extends Employee {

    public Driver(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName
    , String carLoan) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
        setCarLoan(carLoan);
    }
    private String carLoan;

    public String getCarLoan() {
        return carLoan;
    }
    public void setCarLoan(String carLoan) {
        this.carLoan = carLoan;
    }

    public void carInsuranceRate(){
        if (getAge() < 21 ){
            if (getCarLoan().equalsIgnoreCase("yes")){
                System.out.println("You must increase your coverage up to 25%");
            } else if (getCarLoan().equalsIgnoreCase("no")) {
                System.out.println("You must increase your coverage up to 15%");
            } else {
                System.out.println("Incorrect input in Car Loan section! Try: Yes/No");
            }
        } else if (getAge() < 25){
            if (getCarLoan().equalsIgnoreCase("yes")){
                System.out.println("You must increase your coverage up to 15%");
            } else if (getCarLoan().equalsIgnoreCase("no")) {
                System.out.println("Your insurance is good");
            } else {
                System.out.println("Incorrect answer! Try: Yes/No");
            }
        } else if (getAge() > 75){
            if (getCarLoan().equalsIgnoreCase("yes")){
                System.out.println("You must increase your coverage up to 25%");
            } else if (getCarLoan().equalsIgnoreCase("no")) {
                System.out.println("You must increase your coverage up to 15%");
            } else {
                System.out.println("Incorrect answer! Try: Yes/No");
            }

        }
    }


    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is driving");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Car Loan='" + carLoan;

    }
}

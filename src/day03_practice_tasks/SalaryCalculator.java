package day03_practice_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 100;
        int weeklyHours = 55;
        double stateTaxRate = 0.07;
        double federalTaxRate = 0.22;

        double salaryBeforeTax = (hourlyRate * weeklyHours)* 48;
        double stateTax = stateTaxRate * salaryBeforeTax;
        double federalTax = federalTaxRate * (hourlyRate * weeklyHours)* 48;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = ((hourlyRate * weeklyHours)* 48) - totalTax;

        System.out.println("Gross pay is:   $" + ((hourlyRate * weeklyHours)* 48));
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is:   $" + stateTax);
        System.out.println("Total tax is:   $" + totalTax);
        System.out.println("Net income is:  $" + salaryAfterTax);

    }
}

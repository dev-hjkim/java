public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        double tot = salaryManager.getMonthlySalary(20000000);
        System.out.println(tot);
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = (double)yearlySalary / 12.0;
        double dedTax = calculateTax(monthlySalary);
        double dedPension = calculateNationalPension(monthlySalary);
        double dedHealth = calculateHealthInsurance(monthlySalary);

        double deducted = dedTax + dedPension + dedHealth;

        monthlySalary -= deducted;
        return monthlySalary;
    }

    public double calculateTax(double monthSalary) {
        double calTax = monthSalary * 0.125;
        System.out.println(calTax);
        return calTax;
    }

    public double calculateNationalPension(double monthlySalary) {
        double calPension = monthlySalary * 0.081;
        System.out.println(calPension);
        return calPension;
    }

    public double calculateHealthInsurance(double monthSalary) {
        double calHealth = monthSalary * 0.135;
        System.out.println(calHealth);
        return calHealth;
    }
}
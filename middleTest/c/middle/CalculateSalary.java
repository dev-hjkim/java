package c.middle;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calculateSalary = new CalculateSalary();
        calculateSalary.calculateSalaries();
    }

    public long getSalaryIncrease(Employee employee) {
        long salary = employee.getSalary();

        int empType = employee.getType();
        double increaseRate = 0;

        switch(empType) {
            case 1:
                increaseRate = EmployeeType.OWNER.getRate();
                break;
            case 2:
                increaseRate = EmployeeType.MANAGER.getRate();
                break;
            case 3:
                increaseRate = EmployeeType.DESIGNER.getRate();
                break;
            case 4:
                increaseRate = EmployeeType.ARCHITECT.getRate();
                break;
            case 5:
                increaseRate = EmployeeType.DEVELOPER.getRate();
                break;
        }

        salary *= (1+increaseRate);
        return (long)salary;
    }

    public void calculateSalaries() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("LeeDaeRi", 1, 1000000000L);
        employees[1] = new Employee("KimManager", 2, 100000000L);
        employees[2] = new Employee("WhangDesign", 3, 70000000L);
        employees[3] = new Employee("ParkArchi", 4, 80000000L);
        employees[4] = new Employee("LeeDevelop", 5, 60000000L);

        for (Employee emp : employees) {
            System.out.println(emp.getName() + "=" + getSalaryIncrease(emp));
        }
    }

    public enum EmployeeType {
        OWNER(1, -0.95),
        MANAGER(2, 0.1),
        DESIGNER(3, 0.2),
        ARCHITECT(4, 0.3),
        DEVELOPER(5, 1);

        private int value;
        private double rate;
        EmployeeType(int value, double rate) {
            this.value = value;
            this.rate = rate;
        }

        public double getRate() {
            return rate;
        }
    }
}
package c.middle;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calculateSalary = new CalculateSalary();
        calculateSalary.calculateSalaries();
    }

    public long getSalaryIncrease(Employee employee) {
        long salary = employee.getSalary();
        double increaseRate = EmployeeType(employee.getType()).getRate();
        return salary * (1+increaseRate);
    }

    public void calculateSalaries() {
        Employee[] employees = new Employee[5];
        employees[0] = Employee("LeeDaeRi", 1, 1000000000L);
        employees[1] = Employee("KimManager", 2, 100000000L);
        employees[2] = Employee("WhangDesign", 3, 70000000L);
        employees[3] = Employee("ParkArchi", 4, 80000000L);
        employees[4] = Employee("LeeDevelop", 5, 60000000L);

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
        EmployeeType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public double getRate() {
            return rate;
        }
    }
}
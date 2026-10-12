class Employee {
    protected int employeeId;
    protected String employeeName;
    private double salary;

    static int employeeCount = 0;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        employeeCount++;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary rejected: " + salary);
        }
    }

    double calculateBonus() {
        return 0;
    }

    void displayEmployee() {
        System.out.println("ID: " + employeeId
                + " | Name: " + employeeName
                + " | Salary: " + salary);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName,
               double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    @Override
    double calculateBonus() {
        return getSalary() * 0.05;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("   Role: Pharmacist | License: "
                + licenseNo);
    }
}

class StoreManager extends Employee {
    private int teamSize;

    StoreManager(int employeeId, String employeeName,
                 double salary, int teamSize) {
        super(employeeId, employeeName, salary);
        this.teamSize = teamSize;
    }

    @Override
    double calculateBonus() {
        return getSalary() * 0.10 + teamSize * 500;
    }

    void displayStoreManager() {
        displayEmployee();
        System.out.println("   Role: Store Manager | Team Size: "
                + teamSize);
    }
}

class PharmacySystem {
    void displayAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Pharmacist) {
                ((Pharmacist) employees[i]).displayPharmacist();
            } else if (employees[i] instanceof StoreManager) {
                ((StoreManager) employees[i]).displayStoreManager();
            }

            System.out.println(
                    "   Bonus: " + employees[i].calculateBonus());
        }

        System.out.println("Total employees: " + Employee.employeeCount);
    }

    void displayTotalPayout(Employee[] employees) {
        double total = 0;

        for (int i = 0; i < employees.length; i++) {
            total = total + employees[i].getSalary()
                    + employees[i].calculateBonus();
        }

        System.out.println("Total payout (salary + bonus): " + total);
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Pharmacist(
                1, "Neha", 40000, "PH-4521");

        employees[1] = new Pharmacist(
                2, "Rahul", 42000, "PH-7788");

        employees[2] = new StoreManager(
                3, "Anita", 60000, 8);

        employees[0].setSalary(-1);

        PharmacySystem system = new PharmacySystem();

        system.displayAllEmployees(employees);
        system.displayTotalPayout(employees);
    }
}
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;

    static int employeeCount = 0;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary rejected: " + salary);
        }
    }

    void displayEmployee() {
        System.out.println("ID: " + employeeId
                + " | Name: " + name
                + " | Age: " + age
                + " | Salary: " + salary);
    }
}

class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int employeeId,
           double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("   Role: Doctor | Specialization: "
                + specialization);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int age, int employeeId,
               double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("   Role: Pharmacist | License: "
                + licenseNo);
    }
}

class StaffManager {
    void displayAllStaff(Employee[] staff) {
        double totalSalary = 0;

        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Doctor) {
                ((Doctor) staff[i]).displayDoctor();
            } else if (staff[i] instanceof Pharmacist) {
                ((Pharmacist) staff[i]).displayPharmacist();
            } else {
                staff[i].displayEmployee();
            }

            totalSalary = totalSalary + staff[i].getSalary();
        }

        System.out.println("Total employees (static count): "
                + Employee.employeeCount);

        System.out.println("Total salary: " + totalSalary);
    }

    void displayHighSalaryStaff(Employee[] staff, double limit) {
        System.out.println("Staff with salary above " + limit + ":");

        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getSalary() > limit) {
                System.out.println(" - " + staff[i].getName());
            }
        }
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Doctor(
                "Dr. Sharma", 42, 101, 90000, "Cardiology");

        staff[1] = new Pharmacist(
                "Neha", 30, 201, 40000, "PH-4521");

        staff[2] = new Doctor(
                "Dr. Rao", 38, 102, 85000, "Neurology");

        staff[1].setSalary(-100);

        StaffManager manager = new StaffManager();

        manager.displayAllStaff(staff);
        manager.displayHighSalaryStaff(staff, 50000);
    }
}
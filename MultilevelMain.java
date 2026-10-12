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

    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    protected int getEmployeeId() {
        return employeeId;
    }
}

class Manager extends Employee {
    private int teamSize;

    Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    void displayManager() {
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Team Size  : " + teamSize);
    }
}

public class MultilevelMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Anita", 45, 501, 12);

        manager.displayManager();
    }
}
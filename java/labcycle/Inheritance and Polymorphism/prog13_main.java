class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    
    void displayDetails() {
        System.out.println("\n--- Manager Details ---");
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    
    void displayDetails() {
        System.out.println("\n--- Developer Details ---");
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Tester extends Employee {
    String testingTool;

    Tester(int id, String name, double salary, String testingTool) {
        super(id, name, salary);
        this.testingTool = testingTool;
    }

    
    void displayDetails() {
        System.out.println("\n--- Tester Details ---");
        super.displayDetails();
        System.out.println("Testing Tool: " + testingTool);
    }
}

public class prog13_main {
    public static void main(String[] args) {

        Manager manager = new Manager(
            101, "Alice", 75000, "Human Resources"
        );

        Developer developer = new Developer(
            102, "Bob", 65000, "Java"
        );

        Tester tester = new Tester(
            103, "Charlie", 55000, "Selenium"
        );

        manager.displayDetails();
        developer.displayDetails();
        tester.displayDetails();
    }
}

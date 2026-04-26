class Employee {

    private int id;
    private String name;
    private double baseSalary;
    private String dept;

    public Employee(int id, String name, double baseSalary, String dept) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary < 0 ? 0 : baseSalary;
        this.dept = dept;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Department: " + dept);
        System.out.println("Base Salary: " + baseSalary);
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public double applyBonus(double salary) {
        if (salary < 5000) {
            return salary * 0.10;
        }
        return 0;
    }
    

    public double finalSalary() {
        double salary = this.baseSalary + calculateSalary();
        return salary + applyBonus(salary);
    }
    public void salaryBreakdown(){


    }
}
class Developer extends Employee {

    private int overtimeHours;

    public Developer(int id, String name, double baseSalary, int overtimeHours, String dept) {
        super(id, name, baseSalary, dept);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return (overtimeHours * (getBaseSalary() / 30));
    }

    @Override
    public double applyBonus(double salary) {
        if (salary < 5000) {
            return salary * 0.10;
        }
        return 0;
    }

}
class Manager extends Employee {

    private int year;
    private double yearlyBonus = 1500;

    public Manager(int id, String name, double baseSalary, int year, String dept) {
        super(id, name, baseSalary, dept);
        this.year = year;
    }

    @Override
    public double calculateSalary() {
        return (year * yearlyBonus);
    }

    @Override
    public double applyBonus(double salary) {
        if (salary < 5000) {
            return salary * 0.20;
        }
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {

        Developer dev = new Developer(1, "Sude", 3000, 1, "Software");
        Manager mgr = new Manager(2, "Ali", 4000, 2, "IT");

        System.out.println("Developer Final Salary: " + dev.finalSalary());
        dev.salaryBreakdown();
        System.out.println("Manager Final Salary: " + mgr.finalSalary());
    }
}
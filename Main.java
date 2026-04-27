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

    public void salaryBreakdown(){
        double extra = calculateSalary();
        double total = this.baseSalary + extra;
        double bonus = applyBonus(total);

        System.out.println("Base salary: " + getBaseSalary());
        System.out.println("Extra: " + extra);
        System.out.println("Salary Before Bonus: " + total);
        System.out.println("Bonus: " + bonus);
        System.out.println("Final Salary: " + (total + bonus));

    }
    

    public double finalSalary() {
        double salary = this.baseSalary + calculateSalary();
        return salary + applyBonus(salary);
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

    Employee[] employees = new Employee[3];

    employees[0] = new Developer(1, "Sude", 3000, 1, "Software");
    employees[1] = new Manager(2, "Ali", 4000, 2, "IT");
    employees[2] = new Developer(3, "Mehmet", 3500, 2, "Software");

    double maxSalary = employees[0].finalSalary();
    double minSalary = employees[0].finalSalary();
    int count = 0;
    int maxCount = 0;
    int minCount = 0;

    for(Employee employee : employees){
        if(employee.finalSalary() > maxSalary){
            maxSalary = employee.finalSalary();
            maxCount = count;
        }
        if(employee.finalSalary() < minSalary){
            minSalary = employee.finalSalary();
            minCount = count;
        }
        count++;
    }

    System.out.println("Hight salary: " + employees[maxCount].finalSalary());
    employees[maxCount].showInfo();

    System.out.println("Less salary: " + employees[minCount].finalSalary());
    employees[minCount].showInfo();


    }
}
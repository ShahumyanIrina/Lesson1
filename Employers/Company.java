import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private double moneyInBank;
    public List<Employee> employees;

    public Company(String name, double moneyInBank) {
        this.name = name;
        this.moneyInBank = moneyInBank;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean canAffordEmployees() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return moneyInBank >= totalSalary;
    }
}

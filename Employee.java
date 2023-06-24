public class Employee {
    private int yearsOfExperience;
    private double salary;

    public Employee(int yearsOfExperience, double salary) {
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

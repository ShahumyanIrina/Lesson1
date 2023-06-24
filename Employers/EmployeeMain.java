public class EmployeeMain{
	public static void main(String[] args){
	 Company company = new Company("Burunduk Company",1500000);
	 Employee emp1 = new Employee("Poxos Petrosyan", 4000);
	 Employee emp2 = new Employee("Petros Poxosyan", 5000);
	 Employee emp3 = new Employee("Irina Shahumyan", 1491000);

	 company.addEmployee(emp1);
	 company.addEmployee(emp2);
	 company.addEmployee(emp3);

	 System.out.println("Can the company afford the employees? " + company.canAffordEmployees());


	}
}




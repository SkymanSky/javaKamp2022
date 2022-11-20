package inheritance;

public class Main {

	public static void main(String[] args) {
		// Inheritance Yapısını Anlamak
		Customer customer= new Customer();
		Employee employee= new Employee();
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		employeeManager.BestEmployee();

	}

}

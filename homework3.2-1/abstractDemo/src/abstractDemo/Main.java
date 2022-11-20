package abstractDemo;

public class Main {

	public static void main(String[] args) {
		// 41 Demo - Abstract Sınıfları Pekiştirmek
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager= new MysqlDatabaseManager();
		customerManager.getCustomers();
		
		
		
	}

}

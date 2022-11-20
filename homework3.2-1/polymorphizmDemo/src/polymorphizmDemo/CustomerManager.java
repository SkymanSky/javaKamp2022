package polymorphizmDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	//Constructor ekleyelim.
	public CustomerManager(BaseLogger logger) {
		this.logger=logger;
	}
	
	public void add() {
		System.out.println("Müşteri eklendi.");
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.Log("Log mesajı.");
		this.logger.log("Log mesajı");
		
		
	}
}

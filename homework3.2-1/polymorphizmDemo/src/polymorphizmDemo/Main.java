package polymorphizmDemo;

public class Main {

	public static void main(String[] args) {
		//38-Gerçek hayatta polymorphizm ile çalışmak
		//EmailLogger logger = new EmailLogger();
		//logger.Log("Log mesajı.");
		
		//BaseLogger[] loggers =new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new ConsoleLogger(),new FileLogger()};
		//for (BaseLogger logger : loggers) {
		//	logger.Log("Log mesajı");
		//}
		
		//CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
		CustomerManager customerManager= new CustomerManager(new FileLogger());
		customerManager.add();
		
		
	}

}

package interfaces;

public class Main {

	public static void main(String[] args) {
		// 42 : Interfaceler ile Çalışmak, 43 : Interface ile Polymorphism
		
		//ICustomerDal customerDal = new MySqlCustomerDal();
		//customerDal.add();
							
		CustomerManager customerManager= new CustomerManager(new OracleCustomerDal());
		//Strateji tasarım deseni
		//customerManager.customerDal= new MySqlCustomerDal();
		customerManager.add();
	}

}

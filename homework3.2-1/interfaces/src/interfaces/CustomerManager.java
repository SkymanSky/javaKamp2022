package interfaces;

public class CustomerManager {
	//Strateji tasarım deseni
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	public void add() {
		//İş kodları burada yazılır. Doğrulama ya da kural kodları anlamında iş kodları.
		customerDal.add();
		
		
	}

}

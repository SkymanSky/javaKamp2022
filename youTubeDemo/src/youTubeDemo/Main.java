package youTubeDemo;

public class Main {

	public static void main(String[] args) {
		/*
		 * CreditManager creditmanager = new CreditManager(); creditmanager.Calculate();
		 * creditmanager.Calculate(); creditmanager.Save();
		 * 
		 * Customer customer = new Customer(); customer.setId(1);
		 * customer.setCity("Ankara");
		 * 
		 * 
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.Save(); customerManager.Delete();
		 * 
		 * Company company = new Company(); company.taxnumber="10000";
		 * company.compnayName="Arçelik"; company.id=100;
		 * 
		 * CustomerManager customerManager2= new CustomerManager(new Person());
		 * 
		 * 
		 * Person person = new Person(); person.firstName="";
		 * person.nationalIdentity="";
		 * 
		 * Customer c1=new Customer(); Customer c2=new Person(); Customer c3=new
		 * Company();
		 */

		// IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.giveCredit();

	}

}

class CreditManager {

	public void calculate() {

		System.out.println("Hesaplandı.");

	}

	public void save() {
		System.out.println("Kredi verildi.");
	}

}

interface ICreditManager {
	 void calculate();

	 void save();
}

abstract  class BaseCreditManager implements ICreditManager {
	public abstract void calculate();

	public void save() {
		System.out.println("Kaydedildi.");
	}

}

class TeacherCreditManager extends BaseCreditManager {

	@Override
	public void calculate() {
		// hesaplamalar
		System.out.println("Öğretmen Kredisi hesaplandı");

	}

}

class MilitaryCreditManager extends BaseCreditManager {

	@Override
	public void calculate() {
		System.out.println("Asker Kredisi hesaplandı.");

	}

}

class CarCreditManager extends BaseCreditManager{

	@Override
	public void calculate() {
		System.out.println("Araba kredisi hesaplandı.");

	}

}

// SOlID
class Customer {

	public Customer() {
		System.out.println("Müşter başlatıldı.");
	}

	int id;

	String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

class Person extends Customer {

	String firstName;
	String lastName;
	String nationalIdentity;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

}

class Company extends Customer {

	public String compnayName;
	public String taxnumber;
}

// Katmanlı Mimari

class CustomerManager {

	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}

	public void save() {
		System.out.println("Müşteri kaydedildi.");
	}

	public void delete() {
		System.out.println("Müşteri silindi.");
	}

	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Kredi verildi.");
		_creditManager.save();
	}
}

package homework1;

public class Main {

	public static void main(String[] args) {
		/*
		 * int number1 = 10; int number2 = 20; number1 = number2; // değerini ata
		 * demektir System.out.println(number1); // değer tip
		 * 
		 * System.out.println("*********");
		 * 
		 * int[] numbers1 = new int[] { 1, 2, 3 }; int[] numbers2 = new int[] { 10, 20,
		 * 30 }; numbers1 = numbers2; // adresini ata demektir. n2'nin adresi n1'e
		 * eşittir numbers2[0] = 1000; // adresteki değerin sıfırıncı elemanı 1000 yap.
		 * 
		 * System.out.println(numbers2[0]); // 1000 referans tip
		 */

		/*
		 * CreditManager creditManager = new CreditManager(); creditManager.Calculate();
		 * creditManager.Save();
		 * 
		 * Customer customer = new Customer(); // örneğini oluşturmak, instance creation
		 * customer.id=1;
		 * 
		 * //customer.nationalIdentity="1454564"; customer.city="Bursa";
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.Save(); customerManager.Delete();
		 * 
		 * Company company = new Company(); company.taxNumber="100000";
		 * company.companyName="Arçelik"; company.id=10;
		 * 
		 * //CustomerManager customerManager2 = new CustomerManager(new Company());
		 * 
		 * Person person = new Person(); person.nationalIdentity="45545";
		 * 
		 * Customer customer1 = new Customer(); Customer customer2 = new Company();
		 * Customer customer3 = new Person(); //customer3'ün yaptığı şey heapte personun
		 * ref numarasını tutabilmektir
		 */

		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.GiveCredit();
	}

}

class CreditManager {
	public void Calculate() {
		System.out.println("Calculated");
	}

	public void Save() {
		System.out.println("Saved");
	}

}

interface ICreditManager {
	void Calculate();

	void Save();
}

abstract class BaseCreditManager implements ICreditManager {
	
	public abstract void Calculate(); // ortak değil. her yerde değişken. o yüzden abstract olarak bırakıldı.
	
	public void Save() {
		System.out.println("Saved");
	}
}

class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		System.out.println("Teacher credit is calculated");

	}

	@Override
	public void Save() {
		Save();
	}
}

class MilitaryCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		System.out.println("Military credit is calculated");
	}

	@Override
	public void Save() {
		System.out.println("Saved");
	}

}

class Customer {

	public Customer() {
		System.out.println("The customer object started");
	}

	public int id;
	public String city;

}

class Person extends Customer {
	public String firstName;
	public String lastName;
	public String nationalIdentity;
}

class Company extends Customer {
	public String companyName;
	public String taxNumber;

}

class CustomerManager {
	
	//public void Save(int id, String firstName, String lastName, String nationalIdentity){}
	//methodun yukarıdaki gibi tek tek parametreler almaması gerekir. Yeni bir parametre daha eklendiğinde methodun kullanıldığı yerler patlayacaktır.
	//Burada ENCAPSULATION devreye girer.
	
	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}

	public void Save() {
		System.out.println("Saved");
	}

	public void Delete() {
		System.out.println("Customer deleted ");
	}

	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Credit gived");
	}

}

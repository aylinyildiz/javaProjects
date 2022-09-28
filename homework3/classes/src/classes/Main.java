package classes;

public class Main {

	public static void main(String[] args) {
		// reference type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		// 9.satırdaki işlem sonrasında customermanager'ın referans numarası =
		// customermanager2'nin def numarası oldu
		// Herhangi bir referansı tutan kimse olmazsa (customer man ilk referansı gibi)
		// garbagge collector devreye girer.
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2);

		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]); //10 olur. diziler reference tiptir. aynı adresi gösterirler

	}

}
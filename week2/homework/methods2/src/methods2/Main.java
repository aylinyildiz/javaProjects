package methods2;

public class Main {

	public static void main(String[] args) {
		String newMessage = getCity();
		System.out.println(newMessage);
		int number = sum(2, 5);
		System.out.println(number);
		int total = sum2(2,3,4,5,6);		
		System.out.println(total);
	}

	public static void add() {
		System.out.println("Added.");
	}

	public static void delete() {
		System.out.println("Deleted.");
	}

	public static void update() {
		System.out.println("Updated.");
	}

	public static String getCity() {
		return "Ankara";
	}
	
	public static int sum(int number1, int number2) {
		return number1 + number2;
	}
	
	
	//variables argument ...
	//variables argument aslında bir int array göndermişiz gibi çalışır.
	public static int sum2(int... numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum+=number;
		}
		return sum;
	}

}

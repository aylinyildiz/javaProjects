package miniProjectPrimeNumber;

public class Main {

	public static void main(String[] args) {
		int number = 2;
		boolean IsPrimeNum = true;

		if(number==1) {
			System.out.println("Number is not prime");
			return;
		}
		if(number<2) {
			System.out.println("invalid count");
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				IsPrimeNum = false;
			}
		}
		if (IsPrimeNum) {
			System.out.println("Prime number");
		} else {
			System.out.println("Number is not prime.");
		}

	}

}

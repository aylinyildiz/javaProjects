package miniProjectPerfectNumber;

public class Main {

	public static void main(String[] args) {
		// 6 ->1,2,3
		int number = 29;
		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			System.out.println("Perfect number");
		} else {
			System.out.println("Not the perfect number");
		}

	}

}
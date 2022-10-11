package methods;

public class Main {

	public static void main(String[] args) {

		findNumber();
	}

	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int searchNumber = 5;
		boolean isFind = false;

		for (int number : numbers) {
			if (number == searchNumber) {
				isFind = true;
			}
		}

		if (isFind) {
			sendMessage("number is in the numbers array : " + searchNumber);
		} else {
			sendMessage("number is not in the array: " + searchNumber);
		}
	}

	public static void sendMessage(String message) {
		System.out.println(message);

	}

}

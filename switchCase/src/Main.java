
public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Excellent : You passed");
			break;
		case 'B':
			//System.out.println("Very Good : You passed");
			//break;
		case 'C':
			System.out.println("Good : You passed");
			break;
		case 'D':
			System.out.println("Not bad : You passed");
		case 'F':
			System.out.println("Failed.");
			break;
		default:
			System.out.println("You entered an invalid grade.");
		}

	}

}

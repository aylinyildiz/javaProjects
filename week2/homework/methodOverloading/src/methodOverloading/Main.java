package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();

		System.out.println(fourOperations.sum(5, 3));
		fourOperations.sum(5, 1, 2);

	}

}

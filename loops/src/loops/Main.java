package loops;

public class Main {

	public static void main(String[] args) {
		//For
		for(int i=1 ; i<10 ; i++) {
			System.out.println(i);
		}
		System.out.println("Loop is finished");
		
		int i=1;
		//While
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While loop is finished");
		
		//Do While
		int j=20;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do While loop is finished");

	}

}

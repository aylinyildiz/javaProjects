package miniProjectFindNumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[]{1,2,5,7,9,0};
		int findNumber = 5;
		boolean isFind=false;
		
		for(int number : numbers) {
			if(number == findNumber) {
				isFind = true;
			}
		}
		
		if(isFind) {
			System.out.println("number is in the numbers array.");
		}else {
			System.out.println("number is not in the array.");
		}

	}

}
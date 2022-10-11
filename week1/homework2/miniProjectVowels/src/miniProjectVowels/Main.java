package miniProjectVowels;

public class Main {

	public static void main(String[] args) {
		char letter = 'Ö';
		char[] backVowel = { 'A', 'I', 'O', 'U' };
		char[] frontVowel = { 'E', 'İ', 'Ö', 'Ü' };

		for (int x : backVowel) {
			if (x == letter) {
				System.out.println("Letter is backvowel");
			}
		}

		for (int x : frontVowel) {
			if (x == letter) {
				System.out.println("Letter is frontVowel");
			}
		}

		// HOCANIN KODU
/*
		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
		}
		*/

	}

}

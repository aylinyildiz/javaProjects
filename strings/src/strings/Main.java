package strings;

public class Main {

	public static void main(String[] args) {
		String message = "      The weather is very nice today.     ";

		System.out.println(message);
		System.out.println("Number of element : " + message.length());
		System.out.println("5th element : " + message.charAt(4));
		System.out.println(message.concat("Its beautiful!")); // metne ekleme yapar
		System.out.println(message.startsWith("t"));
		System.out.println(message.endsWith("."));

		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);

		System.out.println(message.indexOf("we")); // hangi indexte olduğunu gösterir

		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);

		System.out.println(message.substring(2, 5)); // 2 den başla 5e kadar al

		for (String word : message.split(" ")) {
			System.out.println(word);
			/*
			 * output:The weather is very nice today.
			 */
		}

		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim()); // baştaki ve sondaki boşlukları siler.

	}

}
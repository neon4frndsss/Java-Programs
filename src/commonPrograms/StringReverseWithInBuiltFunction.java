package commonPrograms;

import java.util.Scanner;

public class StringReverseWithInBuiltFunction {

	public static void main(String[] args) {
		String str = "Automation";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2 = str2.reverse(); // used string builder to reverse
		System.out.println(str2);

		stringReversalUsingSplit();
	}

	public static void stringReversalUsingSplit() {
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your String");
		str = in.nextLine();
		String[] token = str.split(""); // used split method to print in reverse order
		for (int i = token.length - 1; i >= 0; i--) {
			System.out.print(token[i] + "");
		}
		in.close();

	}

	public static void stringReverseUsingChar() {

		String reverse = "Hello";
		String reversed = null;
		for (int i = reverse.length(); i >= 0; i--) {

			reversed += reverse.charAt(i);
			System.out.println(reversed);

		}
	}

}

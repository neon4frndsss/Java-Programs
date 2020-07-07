package commonPrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, c = 1;
		System.out.println("Enter length of series: ");
		Scanner input = new Scanner(System.in);
		
		
		int length = input.nextInt();
		if (length == 0) {
			System.out.println("Series cannot be printed with " + length + " length.");
			;
		}

		else {
			System.out.println("Series with lenght " + length + " is: ");
			for (int i = 0; i < length; i++) {
				System.out.print(a + " ");
				a = b;
				b = c;
				c = a + b;
				

			}
		}
		input.close();
	}

}

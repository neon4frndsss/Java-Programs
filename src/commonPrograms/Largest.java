package commonPrograms;

public class Largest {

	public static void main(String[] args) {

		String num = "86492387077532061";

		int[] number = new int[num.length()];
		String large = "";

		for (int i = 0; i < num.length(); i++) {
			number[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
		}

		for (int i = 0; i < num.length(); i++)

		{
			for (int j = 0; j < num.length() - i - 1; j++) {
				if (number[j] < number[j + 1]) {
					int temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;

				}

			}
		}
		for (int i = 0; i < num.length(); i++) {
			large += Integer.toString(number[i]);

		}
		System.out.print(large);
	}

}

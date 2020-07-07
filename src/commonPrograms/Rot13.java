package commonPrograms;

import java.util.Scanner;

public class Rot13 {

	public static void main(String[] args) {
				
			System.out.println("Enter String: ");
			Scanner input = new Scanner(System.in);
			String input_val=input.nextLine();
			input.close();
			for(int i=0;i<input_val.length();i++)
			{
				char c = input_val.charAt(i);
				if (c>='a' && c<='m')
				{
					c+=13;
				}
				else if (c>='A' && c<='M')
				{
					c+=13;
				}
				else if (c>='N' && c<='Z')
				{
					c-=13;
				}
				else if (c>='n' && c<='z')
				{
					c-=13;
				}
				System.out.print(c);
			}
			
	}

}

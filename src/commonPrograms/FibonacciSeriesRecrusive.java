package commonPrograms;

import java.util.Scanner;

public class FibonacciSeriesRecrusive {

		public static int fibonacci (int length)
	{
		if (length==0)
		{
			return 0;
		}
	
		else if (length ==1 || length ==2){return 1;}
		return fibonacci (length-1) + fibonacci (length -2);
		
			
	}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter length of series: ");
			Scanner input = new Scanner(System.in);
			int length = input.nextInt();
					
			for(int i=0;i<length;i++)
				System.out.print(fibonacci(i)+" ");
			input.close();
		}
		
		

}

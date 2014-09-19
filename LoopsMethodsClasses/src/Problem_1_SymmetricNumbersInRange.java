import java.util.Scanner;


public class Problem_1_SymmetricNumbersInRange 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		
		for (int i = start; i <= end; i++) 
		{
			if (i < 10) 
			{
				System.out.print(i + " ");
			}
			if (i>=10 && i < 100) 
			{
				if (i % 10 == i / 10)
				{
					System.out.print(i + " ");
				}
			} else if (i > 100 && i < 999) 
			{
				if (i % 10 == i / 100) 
				{
					System.out.print(i + " ");
				}
			}

		}
	}
}

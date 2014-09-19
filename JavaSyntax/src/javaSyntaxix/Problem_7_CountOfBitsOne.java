package javaSyntaxix;

import java.util.Scanner;

public class Problem_7_CountOfBitsOne 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		String bin = Integer.toBinaryString(n);
		
		for(int i = 0; i < 32; i++)
		{
			if((n&1) == 1)
			{
				sum++;
			}
			n=n>>1;
		}
		System.out.printf("%s - %s",bin,sum);
	}
}

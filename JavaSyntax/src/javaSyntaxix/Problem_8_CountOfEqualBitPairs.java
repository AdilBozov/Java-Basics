package javaSyntaxix;

import java.util.Scanner;

public class Problem_8_CountOfEqualBitPairs 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int bit =0;
		int sum =0;
		int rezult =0;
		
		while(n > 0)
		{
			if((n & 1) == 1 && bit == 0)
			{
				sum=0;
				bit=1;
			}
			
			if ((n & 1)== 0 && bit == 1)
			{
				sum = 0;
				bit = 0;
			}
			
			if((n & 1) == 1)
			{
				bit=1;
			}
			else
			{
				bit = 0;
			}
			
			if((n & 1) == 1  && bit == 1)
			{
				sum++;
				if(sum == 2)
				{
					rezult++;
					sum = 1;
				}
			}
			
			if ((n & 1) == 0 && bit ==0)
			{
				sum++;
				if(sum == 2)
				{
					rezult++;
					sum = 1;
				}
			}
			n = n >> 1;
		}
		System.out.println(rezult);
	}
}

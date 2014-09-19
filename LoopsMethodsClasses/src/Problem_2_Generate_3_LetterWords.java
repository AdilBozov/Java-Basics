import java.util.Scanner;


public class Problem_2_Generate_3_LetterWords 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		char[] masChar = in.next().toCharArray();
		
		if (masChar.length == 1) 
		{
			System.out.printf("%s%s%s", masChar[0], masChar[0],masChar[0] );
		} else if(masChar.length == 2)
		{
			for (int i = 0; i < masChar.length; i++)
			{
				for (int j = 0; j < masChar.length; j++) 
				{
					for (int k = 0; k < masChar.length; k++) 
					{
						System.out.printf("%s%s%s ", masChar[i], masChar[j], masChar[k]);
					}
				}
			}
		}else if(masChar.length == 3)
		{
			for (int i = 0; i < masChar.length; i++) 
			{
				for (int j = 0; j < masChar.length; j++) 
				{
					for (int k = 0; k < masChar.length; k++) 
					{
						System.out.printf("%s%s%s ", masChar[i], masChar[j], masChar[k]);
					}
				}
			}
		}
	}
}

import java.util.Random;
import java.util.Scanner;


public class Problem_6_RandomHandsOf5Cards 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);		int n = in.nextInt();
		String[] cards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] faces = {"♣","♦","♥","♠"};
		String[] allCards = new String[52];
		int caunt = 0;
		Random random = new Random(51);
		int randomNum = 0;
		
		for (int i = 0; i < cards.length; i++) 
		{
			for (int j = 0; j < faces.length; j++)
			{
				allCards[caunt] = cards[i] + faces[j];
				caunt++;
				
			}
		}
		
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				randomNum = random.nextInt(51);
				System.out.print(" " + allCards[randomNum]);
			}
			System.out.println();
		}
	}
}
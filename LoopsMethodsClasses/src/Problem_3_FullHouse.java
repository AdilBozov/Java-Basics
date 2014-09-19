
public class Problem_3_FullHouse 
{
	public static void main(String[] args)
	{
		String[] cards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] faces = {"♣","♦","♥","♠"};
		String[] allCards = new String[52];
		int caunt = 0;
		int fullHousesCaunt = 0;
		
		for (int i = 0; i < cards.length; i++) 
		{
			for (int j = 0; j < faces.length; j++)
			{
				allCards[caunt] = cards[i] + faces[j];
				caunt++;
				
			}
		}
		
		for (int card1 = 0; card1 < allCards.length; card1++)
		{
			for (int card2 = 0; card2 < allCards.length; card2++) 
			{
				if (card2 == card1 || card2 < card1)
				{
					continue;
				}
				for (int card3 = 0; card3 < allCards.length; card3++) 
				{
					if (card3 == card1 || card3 == card2 || card3 < card2 || card3 < card1)
					{
						continue;
					}
					for (int card4 = 0; card4 < allCards.length; card4++) 
					{
						if (card4 == card1 || card4 == card2 || card4 == card3 )
						{
							continue;
						}
						for (int card5 = 0; card5 < allCards.length; card5++)
						{
							if (card5 == card1 || card5 == card2 || card5 == card3 || card5 == card4 || card5 < card4)
							{
								continue;
							}
							if (allCards[card1].charAt(0) == allCards[card2].charAt(0) && allCards[card2].charAt(0) == allCards[card3].charAt(0)) 
							{
								if (allCards[card4].charAt(0) == allCards[card5].charAt(0)) 
								{
									System.out.printf("%s%s%s%s%s ", allCards[card1], allCards[card2], allCards[card3], allCards[card4], allCards[card5]);
									fullHousesCaunt++;
								}
							}
						}
					}
				}
			}
		}
		System.out.print(fullHousesCaunt);
		
	}
}

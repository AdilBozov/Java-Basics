import java.util.Scanner;
import java.util.Arrays;;

public class SortArrayOfStrings
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Counting words");
		int n = scan.nextInt();
		String[] wordsStr = new String[n];
		
		for(int i=0; i<n; i++)
		{
			wordsStr[i] = scan.next();
		}
		Arrays.sort(wordsStr);
		
		for(int i=0; i<n; i++)
		{
			System.out.println(wordsStr[i]);
		}
	}
}

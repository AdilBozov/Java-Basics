package javaSyntaxix;

import java.util.Locale;
import java.util.Scanner;

public class Problem_6_FormattingNumbers 
{
	public static void main (String[] args)
	{
		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		String hex = Integer.toHexString(a).toUpperCase();
		String bin = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		
		System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",hex,bin,b,c);
	}
}

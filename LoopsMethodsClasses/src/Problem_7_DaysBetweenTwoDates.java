import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.print.attribute.DateTimeSyntax;



public class Problem_7_DaysBetweenTwoDates 
{
	public static void main(String[] args) throws ParseException
	{
		Scanner in = new Scanner(System.in);
		String dateF = in.next();
		String dateS = in.next();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date first = dateFormat.parse(dateF);
		Date secunt = dateFormat.parse(dateS);
		
		long date = secunt.getTime() - first.getTime();
		System.out.println((double)date/(86400.0 * 1000.0));
	}
}

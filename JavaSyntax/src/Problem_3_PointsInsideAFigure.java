import java.util.Locale;
import java.util.Scanner;


public class Problem_3_PointsInsideAFigure 
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.ROOT);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter values ​​for x and y:");
		double y = input.nextDouble();
		double x = input.nextDouble();
		
		if((y>=12.5 && 22.5>=y && 8.5>=x && 6<=x)||(8.5<=x && 13.5>=x && 12.5<=y && 17.5>=y)||(8.5<=x && 13.5>=x && 20<=y && 22.5>=y))
		{
			System.out.println("Inside");
		}
		else
		{
			System.out.println("Outside");
		}
	}
}

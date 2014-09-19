import java.util.Scanner;


public class Problem_5_AngleUnitConverterDegreesRadians 
{
	public static double degreesToRadians (double deg)
	{
		double degrees = deg * 0.0174532925;
		return degrees;
	}
	
	public static double radiansToDegrees (double rad)
	{
		double radians = rad / 0.0174532925;
		return radians;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int i = 0;
		String[] mass = new String[n];
		while(i<n) 
		{
			mass[i] = in.nextLine();
			i++;
		}
		
		for (int j = 0; j < mass.length; j++) 
		{
			String[] arraySplit = mass[j].split(" ");
			double value = Double.parseDouble(arraySplit[0]);
			if(arraySplit[1].equals("deg"))
			{
				System.out.printf("%.6f %n" ,degreesToRadians(value));
			}
			else
			{
				System.out.printf("%.6f %n",radiansToDegrees(value));
			}
		}
	}
}

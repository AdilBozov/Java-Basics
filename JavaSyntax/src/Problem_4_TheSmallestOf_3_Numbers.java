import java.util.Arrays;
import java.util.Scanner;


public class Problem_4_TheSmallestOf_3_Numbers 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double[] min = new double[3];
		
		for(int i=0; i<3; i++)
		{
			min[i] = input.nextDouble();
		}
		Arrays.sort(min);
		System.out.println(min[0]);
	}
}

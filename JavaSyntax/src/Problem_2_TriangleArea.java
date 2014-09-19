import java.util.Scanner;


public class Problem_2_TriangleArea 
{
	public static void main (String[] args)
	{
		Scanner  input = new Scanner(System.in);
		System.out.print("Enter values ​​for point Ax and Ay:");
		int ax = input.nextInt();
		int ay = input.nextInt();
		System.out.print("Enter values ​​for point Bx and By:");
		int bx = input.nextInt();
		int by = input.nextInt();
		System.out.print("Enter values ​​for point Cx and Cy:");
		int cx = input.nextInt();
		int cy = input.nextInt();
		int area = (int)Math.abs((ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2);
		System.out.println(area);	
	}
}

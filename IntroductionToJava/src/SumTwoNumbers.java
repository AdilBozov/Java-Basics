import java.util.Scanner;;

public class SumTwoNumbers 
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integers on seperate lines:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int sum = number1 + number2;
		System.out.println(sum);
	}

}
import java.io.BufferedReader;
import java.io.FileReader;


public class Problem_8_SumNumbersFromATextFile 
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
			String line = null;
			int sum = 0;
			while((line = reader.readLine()) != null)
			{
				sum = sum + Integer.parseInt(line);
			}
			System.out.println(sum);
		}
		catch(Exception ex)
		{
			 System.out.println("(Missing file)");
		}
	}
}

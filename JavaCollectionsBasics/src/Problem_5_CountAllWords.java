import java.util.Scanner;


public class Problem_5_CountAllWords {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String words = in.nextLine();
		String[] wordsSplit = words.split("\\W+");
		System.out.println(wordsSplit.length);
	}

}

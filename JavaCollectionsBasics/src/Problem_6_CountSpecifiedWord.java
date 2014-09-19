import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Problem_6_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String text = in.nextLine().toUpperCase();
		String searchText = in.nextLine().toUpperCase();
		String[] textSplits = text.split("\\W+");
		
		Map<String, Integer> words = new HashMap<>();
		
		for (String textSplit : textSplits) {
			Integer caunt = words.get(textSplit);
			if (caunt == null) {
				caunt = 0;
			}
			words.put(textSplit, caunt +1);
		}
		
		if (words.containsKey(searchText)) {
			System.out.println(words.get(searchText));
		} else {
			System.out.println("0");

		}
	}

}

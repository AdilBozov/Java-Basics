import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

 
public class Problem_3_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String texts = in.nextLine();
		String[] textSplits = texts.split(" ");
		int[] index = new int[textSplits.length];
		int n = 0;
		
		if (textSplits.length == 1) {
			System.out.println(textSplits[0]);
		}
		
		Map<String, Integer> wordsCount = new TreeMap<String, Integer>();
		for (String textSplit : textSplits) {
			Integer count = wordsCount.get(textSplit);
			
			if (count == null) {
				count = 0;
			}
			wordsCount.put(textSplit, count+1);
		}
		//System.out.println(wordsCount.get("hi"));
		//int sizeWordsCount = wordsCount.size();
		
		for (int i = 0; i < textSplits.length; i++) {
			index[i] = wordsCount.get(textSplits[i]);
		}
		
		for (int i = 0; i < index.length-1; i++) {
			if (index[i] >= index[i+1]) {
				n = i;
			}
		}
		//hi yes yes yes byeSystem.out.println(n);
		for (int i = 0; i < n; i++) {
			System.out.print(textSplits[n] + " ");
		}
	}

}

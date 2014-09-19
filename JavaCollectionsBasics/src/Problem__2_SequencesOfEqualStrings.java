import java.util.ArrayList;
import java.util.Scanner;


public class Problem__2_SequencesOfEqualStrings {
	
	public static void printList(ArrayList<String> printSum){
		for (String string : printSum) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		System.out.println(text);
		String[] textSplit = text.split(" ");
		
		ArrayList<String> sum  = new ArrayList<>();
		sum.add(textSplit[0]);
		
		if (textSplit.length == 1) {
			System.out.println(textSplit[0]);
			
		} else {
			for (int i = 0; i < textSplit.length-1; i++) {
				if (textSplit[i].equals(textSplit[i+1])) {
					sum.add(textSplit[i+1]);
					if (i == textSplit.length - 2) {
						printList(sum);	
				} 
				}else {
					printList(sum);
					sum.clear();
					sum.add(textSplit[i+1]);
					if (i == textSplit.length - 2) {
						printList(sum);	
					}
				  }
				}
			}
		}
	}

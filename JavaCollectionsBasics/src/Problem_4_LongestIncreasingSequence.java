import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.InputVerifier;


public class Problem_4_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] inputSplit = input.split(" ");
		Integer[] num = new Integer[inputSplit.length];
		int caunt = 1;
		int indexI = 0;
		int sumCaunt =0;
		ArrayList<Integer> sample = new ArrayList<>();
		for (int i = 0; i < inputSplit.length; i++) {
			num[i] = Integer.parseInt(inputSplit[i]) ;
			
		}
		
		System.out.print(num[0] + " ");		
		for (int i = 1; i < num.length; i++) {
			if (num[i-1] < num[i]) {
				System.out.print(num[i] + " ");
				caunt ++;
				indexI = i;
				
			} else {
				System.out.println();
				
				if (caunt > sumCaunt) {
				 sample.clear();
				 sumCaunt = caunt;
				 for (int j = i - caunt; j <= caunt; j++) {
					sample.add(num[j]);
				}
			}
				caunt = 1;
				
				System.out.print(num[i] + " ");
		}
		
	}
		if (caunt > sumCaunt) {
			 sample.clear();
			 sumCaunt = caunt;
			 for (int j = (indexI + 1) - caunt; j <= indexI; j++) {
				sample.add(num[j]);
			}
		}
		System.out.println();
		System.out.print("Longest: " );
		for (Integer samples : sample) {
			System.out.print(samples + " ");
		}
}
}

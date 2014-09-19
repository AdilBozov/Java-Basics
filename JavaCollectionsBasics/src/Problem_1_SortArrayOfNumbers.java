import java.util.Arrays;
import java.util.Scanner;


public class Problem_1_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] mas = new int[n];
		in.nextLine();
		
		for (int i = 0; i < n; i++) {
			mas[i] = in.nextInt();
		}
		Arrays.sort(mas);
		
	for (int i : mas) {
		System.out.println(i);
	}
	}

}

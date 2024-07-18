package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class N2822_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;

		Integer[] scores = new Integer[8];
		
		for (int i = 0; i < 8; i++) {
			scores[i] = sc.nextInt();
		}
		
		Integer[] scores2 = new Integer[8];
		for (int i = 0; i < 8; i++) {
			scores2[i] = scores[i];
		}
		
		Arrays.sort(scores2, Collections.reverseOrder());

		Integer[] index = new Integer[5];
		for (int i = 0; i < 5; i++) {
			index[i] = Arrays.asList(scores).indexOf(scores2[i]);
			total += scores[Arrays.asList(scores).indexOf(scores2[i])];
		}
		Arrays.sort(index);

		System.out.println(total);
		
		for (int i : index) {
			System.out.print((i + 1) + " ");
		}

	}

}

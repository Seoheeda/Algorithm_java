package baekjoon;
import java.util.Scanner;
import java.util.Arrays;

public class N2309_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] dwarfs = new int[9];
		int all = 0;
		
		for (int i = 0; i < 9; i++) {
			int dwarf = sc.nextInt();
			dwarfs[i] = dwarf;
			all += dwarf;
		}
		
		int left = all - 100;
		int fake1 = 0;
		int fake2 = 0;
		Arrays.sort(dwarfs);
		
		for (int j = 0; j < 9; j++) {
			for (int k = j + 1; k < 9; k++) {
				if (dwarfs[j] + dwarfs[k] == left) {
					fake1 = j;
					fake2 = k;
				}
			}
		}
		
		for (int n = 0; n < 9; n++) {
			if ((n != fake1) && (n != fake2)) {
				System.out.println(dwarfs[n]);
			}
		}
		
		sc.close();
	}

}

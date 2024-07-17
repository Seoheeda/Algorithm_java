package baekjoon;
import java.util.Scanner;

public class N1924_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int total = 0;
		
		for (int i = 1; i < month; i++) {
			total += days[i];
		}
		
		total += day;
		
		int div = total % 7;
		
		String ans = "MON";
		
		switch(div) {
		case 1:
			ans = "MON";
			break;
		case 2:
			ans = "TUE";
			break;
		case 3:
			ans = "WED";
			break;
		case 4:
			ans = "THU";
			break;
		case 5:
			ans = "FRI";
			break;
		case 6:
			ans = "SAT";
			break;
		case 0:
			ans = "SUN";
			break;
		default:
			break;
			
		}
		
		System.out.println(ans);

	}

}

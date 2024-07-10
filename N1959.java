'''
a, b = map(int, input().split())

a_list = list(map(int, input().split()))
b_list = list(map(int, input().split()))

if a > b:
    a, b = b, a
    a_list, b_list = b_list, a_list

max_num = 0

for i in range(0, b - a + 1): # 0 1 2  # 0 1
    cnt = 0
    for j in range(0, a): # 0 1 2   # 0 1 2 3 4 5
        mul = a_list[j] * b_list[j + i]
        cnt += mul
    max_num = max(max_num, cnt)

print(max_num)
'''

import java.util.Scanner;

public class ArrayApp {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.nextLine();

		int[] aList = new int[a];
		int[] bList = new int[b];

		for (int i = 0; i < a; i++) {
            aList[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            bList[i] = sc.nextInt();
        }

		if (a > b) {
            int temp = a;
            a = b;
            b = temp;

            int[] tempList = aList;
            aList = bList;
            bList = tempList;
        }

		int maxNum = 0;

        for (int i = 0; i <= b - a; i++) {
            int cnt = 0;
            for (int j = 0; j < a; j++) {
                int mul = aList[j] * bList[j + i];
                cnt += mul;
            }
            maxNum = Math.max(maxNum, cnt);
        }

        System.out.printf("#%d %d%n", test_case, maxNum);
		}
        sc.close();
	}
}
    

    

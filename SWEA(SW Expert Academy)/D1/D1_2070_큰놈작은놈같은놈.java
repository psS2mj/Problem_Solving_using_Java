package com.swea.d1;

import java.util.Scanner;

public class D1_2070_큰놈작은놈같은놈 {

	public static void main(String[] args) {
		// 큰 놈, 작은 놈, 같은 놈
		Scanner sc = new Scanner(System.in);
		int T, num1 = 0, num2 = 0;
		T = sc.nextInt(); // 테스트 케이스의 개수
		for (int test_case = 1; test_case <= T; test_case++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 > num2)
				System.out.println("#" + test_case + " >");
			else if (num1 == num2)
				System.out.println("#" + test_case + " =");
			else
				System.out.println("#" + test_case + " <");
		}
	}

}

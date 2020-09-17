package com.swea.d1;

import java.util.Scanner;

public class D1_2068_최대수구하기 {

	public static void main(String[] args) {
		// 최대수 구하기
		Scanner sc = new Scanner(System.in);
		int T, num = 0;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int max = 0;
			for (int i = 0; i < 10; i++) {
				num = sc.nextInt();
				// if (num > max)
				// max = num;
				max = (int) Math.max(num, max);
			}
			System.out.println("#" + test_case + " " + max);
		}
	}

}

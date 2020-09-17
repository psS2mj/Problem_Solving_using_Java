package com.swea.d2;

import java.util.Scanner;

public class D2_1986_지그재그숫자 {
	public static void main(String[] args) {
		// 지그재그 숫자
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		int sum;
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			sum = 0;
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 1) { // 홀수
					sum += i;
				} else { // 짝수
					sum -= i;
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}

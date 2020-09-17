package com.swea.d1;

import java.util.Scanner;

public class D1_2058_자릿수더하기 {

	public static void main(String[] args) {
		// 자릿수 더하기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력으로 주어지는 자연수 N
		int rem = 0, sum = 0; // rem: 나머지, sum: 자릿수의 총합
//		String str = N + "";
//		String str = String.valueOf(N);
		String str = Integer.toString(N);
		int len = str.length();
		for (int i = 0; i < len; i++) {
			rem = N % 10;
			N /= 10;
			sum += rem;
		}
		System.out.println(sum);
	}

}

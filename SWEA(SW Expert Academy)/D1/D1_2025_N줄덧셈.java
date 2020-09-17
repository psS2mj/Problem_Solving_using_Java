package com.swea.d1;

import java.util.Scanner;

public class D1_2025_N줄덧셈 {

	public static void main(String[] args) {
		// N줄덧셈
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt(); // 1부터 range까지 모두 더하기
		int sum = (range * (range + 1)) / 2; // 총합
		System.out.println(sum);
	}

}

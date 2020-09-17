package com.swea.d1;

import java.util.Scanner;

public class D1_2071_평균값구하기 {

	public static void main(String[] args) {
		// 평균값 구하기
		Scanner sc = new Scanner(System.in);
		int T, avg = 0;
		double num = 0;
		T = sc.nextInt(); // 테스트 케이스의 개수
		for (int test_case = 1; test_case <= T; test_case++) {
			double sum = 0;
			for (int i = 0; i < 10; i++) {
				num = sc.nextDouble();
				sum += num;
			}
			avg = (int) Math.round(sum / 10);
			System.out.println("#" + test_case + " " + avg);
			// System.out.println(sum / 10);
		}
	}

}

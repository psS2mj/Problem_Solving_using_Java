package com.swea.d2;

import java.util.Scanner;

public class D2_1948_날짜계산기 {

	static int[] day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // index: 0~11
	static int month1, month2, day1, day2, diff = 0, sum;

	public static void main(String[] args) {
//		int month1, month2, day1, day2, diff = 0, sum;
		// 날짜 계산기
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		for (int tc = 1; tc <= T; tc++) {
			sum = 0;
			month1 = sc.nextInt();
			day1 = sc.nextInt();
			month2 = sc.nextInt();
			day2 = sc.nextInt();
			diff = month2 - month1;

			if (month1 == month2) {
				sum = day2 - day1 + 1;
			} else {
				sum = day[month1 - 1] - day1 + 1 + day2;
				for (int i = 0; i < diff - 1; i++) {
					sum += day[month1 + i];
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}

}

package com.swea.d2;

import java.util.Scanner;

public class D2_1288_새로운불면증치료법 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		int N, sum, first, len, rem, count;
		int num[]; // 0~9를 저장할 배열
		for (int tc = 1; tc <= T; tc++) {
			count = 0;
			num = new int[10];
			N = sc.nextInt(); // N의 배수
			first = N;
			sum = N;
			String str;
			while (num[0] == 0 || num[1] == 0 || num[2] == 0 || num[3] == 0 || num[4] == 0 || num[5] == 0 || num[6] == 0
					|| num[7] == 0 || num[8] == 0 || num[9] == 0) { // 배열의 모든 원소가 0이 아닐 때까지 (0~9 숫자가 최소한 하나씩은 나온 것)
				count++;
				str = N + "";
				len = str.length();
				for (int i = 0; i < len; i++) {
					rem = N % 10;
					num[rem]++;
					N /= 10;
				}
				sum += first;
				N = sum;
			}
			System.out.println("#" + tc + " " + first * count);
		}
	}
}
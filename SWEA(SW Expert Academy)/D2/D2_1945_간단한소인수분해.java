package com.swea.d2;

import java.util.Scanner;

public class D2_1945_간단한소인수분해 {

	public static void main(String[] args) {
		// 간단한 소인수분해
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		int N;
		int[] primeFactor; // 소인수들을 넣을 배열
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); // 소인수분해 할 자연수 N
			primeFactor = new int[5]; // 소인수: 2, 3, 5, 7, 11 (length: 5)
			// while (N != 1) {
			// if (N % 2 == 0) {
			// primeFactor[0]++;
			// N /= 2;
			// } else if (N % 3 == 0) {
			// primeFactor[1]++;
			// N /= 3;
			// } else if (N % 5 == 0) {
			// primeFactor[2]++;
			// N /= 5;
			// } else if (N % 7 == 0) {
			// primeFactor[3]++;
			// N /= 7;
			// } else if (N % 11 == 0) {
			// primeFactor[4]++;
			// N /= 11;
			// }
			// }
			while (N % 2 == 0) {
				primeFactor[0]++;
				N /= 2;
			}
			while (N % 3 == 0) {
				primeFactor[1]++;
				N /= 3;
			}
			while (N % 5 == 0) {
				primeFactor[2]++;
				N /= 5;
			}
			while (N % 7 == 0) {
				primeFactor[3]++;
				N /= 7;
			}
			while (N % 11 == 0) {
				primeFactor[4]++;
				N /= 11;
			}
			System.out.print("#" + tc + " ");
			for (int num : primeFactor) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}

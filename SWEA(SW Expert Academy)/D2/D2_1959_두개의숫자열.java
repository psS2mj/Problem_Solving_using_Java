package com.swea.d2;

import java.util.Scanner;

public class D2_1959_두개의숫자열 {

	public static void main(String[] args) {
		// 두 개의 숫자열
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		int N, M, dif, A_len, B_len, sum = 0, max; // N,M: 배열의 크기, dif: 두 배열 길이의 차
		int[] A, B;
		for (int tc = 1; tc <= T; tc++) {
//			sum = 0;
			max = 0;
			// 배열 생성
			N = sc.nextInt();
			M = sc.nextInt();
			A = new int[N];
			A_len = A.length;
			B = new int[M];
			B_len = B.length;
			// 배열에 값 채워넣기
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}
			for (int i = 0; i < B.length; i++) {
				B[i] = sc.nextInt();
			}
//			dif = Math.abs(A_len - B_len) + 1;
			if (A_len > B_len) { // A배열이 더 길 때
				dif = A_len - B_len + 1;
				for (int i = 0; i < dif; i++) {
					for (int j = 0; j < B_len; j++) {
						sum += B[j] * A[i + j];
					}
					max = Math.max(sum, max);
					sum = 0;
				}
			} else { // B배열이 더 길 때
				dif = B_len - A_len + 1;
				for (int i = 0; i < dif; i++) {
					for (int j = 0; j < A_len; j++) {
						sum += A[j] * B[i + j];
					}
					max = Math.max(sum, max);
					sum = 0;
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}

}

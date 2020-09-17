package com.swea.d2;

import java.util.Scanner;

public class D2_1284_수도요금경쟁 {

	public static void main(String[] args) {
		// 수도 요금 경쟁
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		int P, Q, R, S, W, A_fee, B_fee;
//		int[] water = new int[5];
		for (int tc = 1; tc <= T; tc++) {
//			for (int i = 0; i < 5; i++) {
//				water[i] = sc.nextInt(); // P, Q, R, S, W를 원소로 가지는 배열
//			}
//			A_fee = water[0] * water[4];
//			if (water[2] >= water[4]) {
//				B_fee = water[1];
//			} else {
//				B_fee = water[1] + (water[4] - water[2]) * water[3];
//			}
//			if (A_fee > B_fee)
//				System.out.println("#" + tc + " " + B_fee);
//			else
//				System.out.println("#" + tc + " " + A_fee);
			P = sc.nextInt();
			Q = sc.nextInt();
			R = sc.nextInt();
			S = sc.nextInt();
			W = sc.nextInt();
			A_fee = P * W;
			if (W <= R)
				B_fee = Q;
			else
				B_fee = Q + (W - R) * S;
			if (A_fee > B_fee)
				System.out.println("#" + tc + " " + B_fee);
			else
				System.out.println("#" + tc + " " + A_fee);
		}
	}

}

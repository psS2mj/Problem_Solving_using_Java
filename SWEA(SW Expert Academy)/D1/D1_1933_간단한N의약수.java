package com.swea.d1;

import java.util.Scanner;

public class D1_1933_간단한N의약수 {

	public static void main(String[] args) {
		// 간단한 N 의 약수
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.print("1 ");
		for (int factor = 2; factor <= N; factor++) {
			if (N % factor == 0)
				System.out.print(factor + " ");
		}
	}

}

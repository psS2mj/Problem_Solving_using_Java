package com.swea.d1;

import java.util.Scanner;

public class D1_1545_거꾸로출력해보아요 {

	public static void main(String[] args) {
		// 거꾸로 출력해 보아요
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N != -1) {
			System.out.print(N + " ");
			N--;
		}
	}

}

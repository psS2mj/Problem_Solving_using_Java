package com.swea.d1;

import java.util.Scanner;

public class D1_2019_더블더블 {

	public static void main(String[] args) {
		// 더블더블
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			System.out.print((int) Math.pow(2, i) + " ");
		}
	}

}

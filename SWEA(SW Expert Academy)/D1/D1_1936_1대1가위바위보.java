package com.swea.d1;

import java.util.Scanner;

public class D1_1936_1대1가위바위보 {

	static int A, B;
	static boolean lose_A = false;

	public static void main(String[] args) {
		// 1대1 가위바위보 (1: 가위, 2: 바위, 3:보) 1<2, 1>3, 2<3
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		switch (A) {
		case 1: // 가위
			lose_A = true;
			if (B == 3)
				System.out.println("A");
			break;
		case 2: // 바위
			if (B == 1)
				System.out.println("A");
			break;
		case 3: // 보
			if (B == 2)
				System.out.println("A");
			break;
		}
		if (lose_A == true)
			System.out.println("B");
	}

}

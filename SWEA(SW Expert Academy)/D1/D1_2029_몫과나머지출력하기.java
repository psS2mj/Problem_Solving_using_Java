package com.swea.d1;

import java.util.Scanner;

public class D1_2029_몫과나머지출력하기 {

	public static void main(String[] args) {
		// 몫과 나머지 출력하기
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		int a, b;
		for (int tc = 1; tc <= T; tc++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("#" + tc + " " + a / b + " " + a % b);
		}
	}

}

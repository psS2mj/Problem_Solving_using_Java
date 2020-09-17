package com.swea.d2;

import java.util.Scanner;

public class D2_2007_패턴마디의길이 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		for (int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			int pattern = 0;
			for (int i = 1; i < 10; i++) {
				String sub = s.substring(0, i);
				String subNext = s.substring(i, i + i);
				if (sub.equals(subNext)) {
					pattern = i;
					break;
				}
			}
			System.out.println("#" + tc + " " + pattern);
		}
	}

}

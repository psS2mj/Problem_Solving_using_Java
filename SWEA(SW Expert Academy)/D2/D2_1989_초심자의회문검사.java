package com.swea.d2;

import java.util.Scanner;

public class D2_1989_초심자의회문검사 {
	public static void main(String[] args) {
		// 초심자의 회문 검사
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		int len, check = 0;
		char[] word;
		for (int tc = 1; tc <= T; tc++) {
			check = 0;
			word = sc.next().toCharArray();
			len = word.length;
			System.out.print("#" + tc + " ");
			for (int i = 0; i < len / 2; i++) {
				if (word[i] != word[(len - 1) - i]) {
					System.out.println("0");
					check++;
					break;
				}
			}
			if (check == 0) {
				System.out.println("1");
			}
		}
	}
}
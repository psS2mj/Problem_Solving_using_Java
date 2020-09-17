package com.swea.d1;

import java.util.Scanner;

public class D1_2043_서랍의비밀번호 {

	public static void main(String[] args) {
		// 서랍의 비밀번호
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt(); // P: 비밀번호
		int K = sc.nextInt(); // K: 여기서부터 1씩 증가
		System.out.println(P - K + 1);
	}

}

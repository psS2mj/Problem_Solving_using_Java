package com.swea.d1;

import java.util.Arrays;
import java.util.Scanner;

public class D1_2063_중간값찾기 {

	public static void main(String[] args) {
		// 중간값 찾기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력되는 홀수 N
		int mid[] = new int[N];
		for (int i = 0; i < N; i++) {
			mid[i] = sc.nextInt();
		}
		Arrays.sort(mid); // asc
		System.out.println(mid[N / 2]);
	}

}

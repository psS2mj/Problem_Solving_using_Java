package com.swea.d1;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;
//import java.util.StringTokenizer;

public class D1_2072_홀수만더하기 {

	// public static void main(String[] args) throws IOException {
	// // 홀수만 더하기
	// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	// Scanner sc = new Scanner(System.in);
	// int T, num, sum = 0;
	// T = sc.nextInt(); // 테스트 케이스의 개수
	// for (int test_case = 1; test_case <= T; test_case++) {
	// String numString = in.readLine();
	// StringTokenizer st = new StringTokenizer(numString);
	// while (st.hasMoreTokens()) {
	// num = Integer.parseInt(st.nextToken());
	// if (num % 2 != 0) {
	// sum += num;
	// }
	// }
	// System.out.println("#" + test_case + " " + sum);
	// sum = 0;
	// }
	// }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, num = 0, sum = 0;
		T = sc.nextInt(); // 테스트 케이스의 개수
		for (int test_case = 1; test_case <= T; test_case++) {
			for (int i = 0; i < 10; i++) {
				num = sc.nextInt();
				if (num % 2 != 0) {
					sum += num;
				}
			}
			System.out.println("#" + test_case + " " + sum);
			sum = 0;
		}
	}

}

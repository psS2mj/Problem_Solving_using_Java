package com.swea.d1;

import java.util.Scanner;

public class D1_1938_아주간단한계산기 {

	public static void main(String[] args) {
		// 아주 간단한 계산기
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print((num1 + num2) + "\n" + (num1 - num2) + "\n" +
		(num1 * num2) + "\n" + (num1 / num2));
	}

}

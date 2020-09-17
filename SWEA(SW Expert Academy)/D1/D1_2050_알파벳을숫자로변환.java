package com.swea.d1;

import java.util.Scanner;

public class D1_2050_알파벳을숫자로변환 {

	public static void main(String[] args) {
		// 알파벳을 숫자로 변환
		Scanner sc = new Scanner(System.in);
		char[] alphabet = sc.next().toCharArray();
		for (int trans : alphabet) {
			System.out.print(trans - 64 + " ");
		}
	}

}

package com.swea.d2;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Scanner;

public class D2_1928_Base64Decoder {

	public static void main(String[] args) {
		// Base64 Decoder
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수
		String str;
		Decoder decoder = Base64.getDecoder();
		for (int tc = 1; tc <= T; tc++) {
			str = sc.next();
			byte[] binary = Base64.getDecoder().decode(str);
			System.out.println("#" + tc + " " + new String(binary));
		}
	}

}

package com.swea.d1;

import java.util.Arrays;
import java.util.Scanner;

public class D1_2047_신문헤드라인 {

	public static void main(String[] args) {
		// 신문 헤드라인
		Scanner sc = new Scanner(System.in);
//		String headline = sc.next();
//		System.out.println(headline.toUpperCase());
//		char[] headline = sc.next().toCharArray();
//		System.out.println(headline);
//		for (int i = 0; i < headline.length(); i++) {
			//char temp = (char) (headline.charAt(i)-32);
//			System.out.print((char) (headline.charAt(i)-32));
			//System.out.print(temp);
//		}
//		System.out.println(headline.substring(4,6));
//		char s = headline.charAt(0);
//		System.out.println(s);
		
		char test = 'a';
		System.out.println((char)(test-32));
		
//		int N = sc.nextInt();
		int arr[];
		arr = new int[3];
		
		int arr1[] = {3,2,1};
		Arrays.sort(arr1);
		for(int i: arr1){
			System.out.print(i + " ");
		}
		
//		int arr2[] = new int[N];
	}

}

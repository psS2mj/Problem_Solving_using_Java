package com.swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1204_최빈수구하기 {

	static int T, N, tmp, max, mode; // mode: 최빈수
	static int[] score; // 0~100점 사이

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			score = new int[101];
			max = Integer.MIN_VALUE;
			mode = 0;
			N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				tmp = Integer.parseInt(st.nextToken());
				score[tmp]++;
			}
			// 최빈수 구하기
			for (int i = 0; i < score.length; i++) {
				if (score[i] >= max) {
					max = score[i];
					mode = i;
				}
			}
			System.out.println("#" + tc + " " + mode);
		}
	}

}

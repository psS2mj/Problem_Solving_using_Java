package com.swea.d2;

import java.util.Scanner;

public class D2_1954_달팽이숫자 {

	static int T, size;
	static int[][] snail;
	// 오, 아, 왼, 위
	static int[] dy = { 0, 1, 0, -1 };
	static int[] dx = { 1, 0, -1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int d = 0, x = 0, y = 0;
			// num=1;
			size = sc.nextInt();
			snail = new int[size][size];
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					// snail[y][x] = num++;
					snail[y][x] = i * size + j + 1;

					if (y + dy[d] < 0 || y + dy[d] >= size || x + dx[d] < 0 || x + dx[d] >= size
							|| snail[y + dy[d]][x + dx[d]] != 0) {
						d++;
						if (d == 4)
							d = 0;
					}
					// if(!(y+dy[d]>=0 && y+dy[d]<size && x+dx[d]>=0 &&
					// x+dx[d]<size && snail[y+dy[d]][x+dx[d]]==0)){
					// d++;
					// if(d==4) d=0;
					// }

					// x, y 값 업데이트
					y += dy[d];
					x += dx[d];
				}
			}

			System.out.println("#" + tc);
			// 배열 출력
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.print(snail[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}

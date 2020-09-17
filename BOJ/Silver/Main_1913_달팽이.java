/* @date: 2020/04/15
 * @author: psS2mj
 * @brief: BOJ_1913_달팽이 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1913_달팽이 {

	static int N, num, x = 0, y = 0, d = 0, Ans1, Ans2;
	static int[][] snail;
	// 아래 오 위 왼
	static int[] dy = { 1, 0, -1, 0 };
	static int[] dx = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		snail = new int[N][N];
		int len = N;
		N *= N;
		num = Integer.parseInt(br.readLine());
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				snail[y][x] = N--;
				if (y + dy[d] < 0 || x + dx[d] < 0 || y + dy[d] >= len || x + dx[d] >= len
						|| snail[y + dy[d]][x + dx[d]] != 0) {
					d++;
					if (d == 4) d = 0;
				}
				y += dy[d];
				x += dx[d];
			}
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(snail[i][j] + " ");
				if(snail[i][j] == num) {
					Ans1 = i+1;
					Ans2 = j+1;
				}
			}
			System.out.println();
		}
		System.out.println(Ans1 + " " + Ans2);
	}

}

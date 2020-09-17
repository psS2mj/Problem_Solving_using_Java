import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/05/07
 * @author: psS2mj
 * @brief: SWEA_1206_View (D3) */

public class Solution_D3_1206_View {
	static int width, height, Ans;
	static int[][] map;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			Ans = 0;
			width = Integer.parseInt(br.readLine());
			map = new int[255][width]; // 빌딩의 높이는 1~255
			// 0: 빌딩, 1: 빈 칸
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < width; i++) {
				height = Integer.parseInt(st.nextToken());
				for (int j = 0; j < 255 - height; j++) {
					map[j][i] = 1;
				}
			}

			for (int i = 0; i < 255; i++) {
				for (int j = 2; j < width - 2; j++) {
					if (map[i][j] == 0) {
						if (checkView(i, j)) {
							Ans++;
						}
					}
				}
			}

			System.out.println("#" + tc + " " + Ans);
		}
	} // main

	static int[] dx = { -2, -1, 1, 2 };
	private static boolean checkView(int y, int x) {
		int cnt = 0;
		for (int d = 0; d < 4; d++) {
			int nx = x + dx[d];
			if (map[y][nx] == 1) {
				cnt++;
			}
		}
		if (cnt == 4) {
			return true;
		} else {
			return false;
		}
	}
} // class

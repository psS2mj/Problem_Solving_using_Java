import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/05/09
 * @author: psS2mj
 * @brief: SWEA_1210_Ladder1 (D4) */

public class Solution_1210_Ladder1 {
	static int T, Ans;
	static boolean road;
	static int[][] map;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			T = Integer.parseInt(br.readLine());
			map = new int[100][100];
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			// 도착점 찾기
			for (int i = 0; i < 100; i++) {
				if (map[99][i] == 2) {
					Ans = searchStartPoint(99, i);
					break;
				}
			}
			System.out.println("#" + T + " " + Ans);
		}
	} // main

	static int[] dx = { -1, 1 };
	private static int searchStartPoint(int y, int x) {
		// 출발점을 찾을 때까지 반복 (계속 위로 올라갈 예정)
		while (true) {
//			System.out.println("y: " + y + " x: " + x);
			if (y == 0) {break;} // 만약 출발점을 찾았다면 끝내기.
			road = false;
			// 올라가기 전에 좌, 우를 먼저 살핀다
			for (int d = 0; d < 2; d++) {
				int nx = x + dx[d];
				if (nx < 0 || nx >= 100) {continue;}
				if (map[y][nx] == 1) { // 만약 좌 or 우에 길이 있다면
					road = true;
					x = nx; // 옆으로 한 칸 이동하고,
					// 그 때의 방향으로 계속 이동 (0이나 벽이 나올 때까지)
					while (true) {
						nx = x + dx[d]; // 여기서 방향(d값)은 고정되어 있음
						if (nx < 0 || nx >= 100 || map[y][nx] == 0) {break;}
						else {x = nx;}
					}
				}
				if (road) {break;}
			}
			y--;
		}
		return x;
	}
} // class

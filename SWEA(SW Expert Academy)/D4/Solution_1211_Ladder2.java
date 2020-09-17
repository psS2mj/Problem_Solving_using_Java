import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* @date: 2020/05/10
 * @author: psS2mj
 * @brief: SWEA_1211_Ladder2 (D4) */

public class Solution_1211_Ladder2 {
	static int T, cnt, min, min_idx;
	static boolean road;
	static int[][] map;
	static List<int[]> list = new ArrayList<int[]>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			T = Integer.parseInt(br.readLine());
			map = new int[100][100];
			list.clear();
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			// 출발점 찾기 (첫 번째 행만 검사)
			for (int i = 0; i < 100; i++) {
				if (map[0][i] == 1) {
					searchEndPoint(0, i);
					list.add(new int[] {i,cnt});
				}
			}
			// 이동거리가 가장 짧은 출발점의 x좌표 찾기
			min = Integer.MAX_VALUE;
			for (int i = 0; i < list.size(); i++) {
				int curr[] = list.get(i);
				if(min >= curr[1]) {
					min = curr[1];
					min_idx = curr[0];
				}
			}
			System.out.println("#" + T + " " + min_idx);
		}
	} // main

	static int[] dx = { -1, 1 }; // 좌, 우로 이동
	private static int searchEndPoint(int y, int x) {
		cnt = 0; // 이동거리 카운트
		while (true) {
			if (y == 99) {break;}
			road = false;
			for (int d = 0; d < 2; d++) {
				int nx = x + dx[d];
				if (nx < 0 || nx >= 100) {continue;}
				if (map[y][nx] == 1) {
					road = true;
					x = nx;
					cnt++;
					while (true) {
						nx = x + dx[d];
						if (nx < 0 || nx >= 100 || map[y][nx] == 0) {break;}
						else {x = nx; cnt++;}
					}
				}
				if(road) {break;}
			}
			y++;
			cnt++;
		}
		return cnt;
	}
} // class

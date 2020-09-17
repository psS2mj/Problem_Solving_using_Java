import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/05/08
 * @author: psS2mj
 * @brief: SWEA_1208_Flatten (D3) */

public class Solution_1208_Flatten {
	static int dump, max, min, max_idx, min_idx, diff;
	static int[] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			dump = Integer.parseInt(br.readLine());
			map = new int[100]; // 상자의 높이만 저장한다
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 100; i++) {
				map[i] = Integer.parseInt(st.nextToken());
			}
			// 덤프 수행 시작
			for (int i = 0; i <= dump; i++) {
				// 평탄화 작업
				if (i != 0) {
					map[max_idx]--;
					map[min_idx]++;
				}
				max = 0;
				min = 101;
				for (int j = 0; j < 100; j++) {
					// 최고점 찾기
					if (max < map[j]) {
						max = map[j];
						max_idx = j;
					}
					// 최저점 찾기
					if (min > map[j]) {
						min = map[j];
						min_idx = j;
					}
				}
				diff = max - min; // 최고점과 최저점의 높이차이
				if (diff == 0 || diff == 1) { // 만약 평탄화 작업 완료시
					break; // 끝내기.
				}
			}
			System.out.println("#" + tc + " " + diff);
		}
	} // main
} // class

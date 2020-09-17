import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* @date: 2020/05/14
 * @author: psS2mj
 * @brief: BOJ_2468_안전 영역 */

public class Main_2468_안전영역 {
	static int N, h_min = 101, h_max = 0, Ans = 1; // Ans: 아무 지역도 물에 잠기지 않을 수도 있다.
	static Integer[] safe_zone; // bfs 결과(안전영역의 개수)를 저장할 배열
	static int[][] map, visited;
	static Queue<int[]> que = new LinkedList<int[]>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				map[i][j] = tmp;
				h_min = (h_min > tmp) ? tmp : h_min; // 최소 높이
				h_max = (h_max < tmp) ? tmp : h_max; // 최대 높이
			}
		}
		safe_zone = new Integer[h_max - h_min];
		int idx = 0;
		for (int i = h_min; i < h_max; i++) {
			visited = new int[N][N];
			int cnt = 0;
			// bfs
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (map[j][k] > i && visited[j][k]==0) {
						bfs(j,k,i,++cnt);
					}
				}
			}
			safe_zone[idx++] = cnt;
		}
		if(safe_zone.length==0) {System.out.println(Ans);}
		else {
			Arrays.sort(safe_zone, Collections.reverseOrder());
			System.out.println(safe_zone[0]);
		}
	} // main

	// 상하좌우
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	private static void bfs(int y, int x, int h, int cnt) {
		que.clear();
		visited[y][x] = cnt;
		que.add(new int[] {y,x});
		while(!que.isEmpty()) {
			int[] curr = que.poll();
			int cy = curr[0];
			int cx = curr[1];
			for (int d = 0; d < 4; d++) {
				int ny = cy + dy[d];
				int nx = cx + dx[d];
				if(!check(ny,nx)) {continue;}
				if(map[ny][nx] > h && visited[ny][nx]==0) {
					visited[ny][nx] = cnt;
					que.add(new int[] {ny,nx});
				}
			}
		}
	}
	private static boolean check(int ny, int nx) {
		if(ny<0 || ny>=N || nx<0 || nx>=N) {return false;}
		return true;
	}
} // class

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* @date: 2020/04/18
 * @author: psS2mj
 * @brief: BOJ_1743_음식물 피하기 */

public class Main_1743_음식물피하기 {
	static int N, M, K, ky, kx, cnt, max = Integer.MIN_VALUE;
	static int[][] food, visited;
	static Queue<int[]> que = new LinkedList<int[]>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		food = new int[N][M];
		visited = new int[N][M];
		for (int i = 0; i < K; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			ky = Integer.parseInt(st2.nextToken());
			kx = Integer.parseInt(st2.nextToken());
			food[ky-1][kx-1] = 1;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(food[i][j] == 1 && visited[i][j] == 0) {
					bfs(i,j);
					max = (Math.max(max, cnt)==max) ? max : cnt;
				}
			}
		}
		System.out.println(max);
	} // main
	// 상 하 좌 우
	static int[] dy = {-1, 1, 0, 0};
	static int[] dx = {0, 0, -1, 1};
	private static void bfs(int y, int x) {
		cnt = 1;
		que.clear();
		que.add(new int[] {y,x});
		visited[y][x] = 1;
		while(!que.isEmpty()) {
			int[] curr = que.poll();
			int cy = curr[0];
			int cx = curr[1];
			for (int d = 0; d < 4; d++) {
				int ny = cy + dy[d];
				int nx = cx + dx[d];
				if(!check(ny,nx)) {continue;}
				if(food[ny][nx] == 1 && visited[ny][nx] == 0) {
					visited[ny][nx] = 1;
					cnt++;
					que.add(new int[] {ny,nx});
				}
			}
		}
	}
	private static boolean check(int ny, int nx) {
		if(ny<0 || ny>=N || nx<0 || nx>=M) {return false;}
		return true;
	}
} // class

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* @date: 2020/05/26
 * @author: psS2mj
 * @brief: BOJ_2583_영역 구하기 */

public class Main_2583_영역구하기 {
	static int M, N, K, x1, y1, x2, y2;
	static int[][] map, visited;
	static LinkedList<Integer> list = new LinkedList<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new int[M][N];
		visited = new int[M][N];
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			for (int j = y1; j < y2; j++) {
				for (int k = x1; k < x2; k++) {
					map[j][k]++;
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j]==0 && visited[i][j]==0) {
					list.add(bfs(i,j,++cnt));
				}
			}
		}
		System.out.println(cnt);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	} // main
	
	// 상하좌우
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	static Queue<int[]> que = new LinkedList<int[]>();
	private static int bfs(int y, int x, int cnt) {
		int area = 0;
		que.clear();
		que.add(new int[] {y,x});
		visited[y][x] = cnt;
		area++;
		while(!que.isEmpty()) {
			int[] curr = que.poll();
			int cy = curr[0];
			int cx = curr[1];
			for (int d = 0; d < 4; d++) {
				int ny = cy + dy[d];
				int nx = cx + dx[d];
				if(!check(ny,nx)) {continue;}
				if(map[ny][nx]==0 && visited[ny][nx]==0) {
					visited[ny][nx] = cnt;
					que.add(new int[] {ny,nx});
					area++;
				}
			}
		}
		return area;
	}

	private static boolean check(int ny, int nx) {
		if(ny<0 || ny>=M || nx<0 || nx>=N) {return false;}
		return true;
	}
} // class

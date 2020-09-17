import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* @date: 2020/04/19
 * @author: psS2mj
 * @brief: BOJ_4963_섬의 개수 */

public class Main_4963_섬의개수 {
	static int w = 1, h = 1, cnt;
	static int[][] map, visited;
	static Queue<int[]> que = new LinkedList<int[]>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			if(w == 0 && h == 0) {break;}
			map = new int[h][w];
			visited = new int[h][w];
			for (int i = 0; i < h; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st2.nextToken());
				}
			}
			// 1: 땅, 0: 바다
			cnt = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if(map[i][j] == 1 && visited[i][j] == 0) {
						bfs(i,j,++cnt);
					}
				}
			}
			System.out.println(cnt);
		}
	} // main
	// 위부터 시계 방향으로
	static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
	private static void bfs(int y, int x, int cnt) {
		que.clear();
		que.add(new int[] {y,x});
		visited[y][x] = cnt;
		while(!que.isEmpty()) {
			int[] curr = que.poll();
			int cy = curr[0];
			int cx = curr[1];
			for (int d = 0; d < 8; d++) {
				int ny = cy + dy[d];
				int nx = cx + dx[d];
				if(!check(ny,nx)) {continue;}
				if(map[ny][nx] == 1 && visited[ny][nx] == 0) {
					visited[ny][nx] = cnt;
					que.add(new int[] {ny,nx});
				}
			}
		}
	}
	private static boolean check(int ny, int nx) {
		if(ny<0 || ny>=h || nx<0 || nx>=w) {return false;}
		return true;
	}
} // class

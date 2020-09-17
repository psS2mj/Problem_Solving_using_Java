import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* @date: 2020/04/20
 * @author: psS2mj
 * @brief: BOJ_17129_윌리암슨수액빨이딱따구리가 정보섬에 올라온 이유 */

public class Main_17129_윌리암슨수액빨이딱따구리가정보섬에올라온이유 {
	static int n, m, min = Integer.MAX_VALUE;
	static int[][] map, visited;
	static Queue<int[]> que = new LinkedList<int[]>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		visited = new int[n][m];
		for(int[] v : visited) {
			Arrays.fill(v, -1);
		}
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j] == 2) {
					bfs(i,j);
				}
			}
		}
		// 음식까지의 최단거리 구하기
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j] >= 3) {
					if(visited[i][j] != -1) {
						min = (Math.min(min, visited[i][j])==min) ? min : visited[i][j]; 
					} else {
						cnt++;
					}
				}
			}
		}
		if(cnt==3) {
			System.out.println("NIE");
		} else {
			System.out.println("TAK\n" + min);
		}
	} // main
	// 상하좌우
	static int dy[] = {-1, 1, 0, 0};
	static int dx[] = {0, 0, -1, 1};
	private static void bfs(int y, int x) {
		que.clear();
		que.add(new int[] {y,x});
		visited[y][x] = 0;
		while(!que.isEmpty()) {
			int[] curr = que.poll();
			int cy = curr[0];
			int cx = curr[1];
			for (int d = 0; d < 4; d++) {
				int ny = cy + dy[d];
				int nx = cx + dx[d];
				if(!check(ny,nx)) {continue;}
				if(map[ny][nx] != 1 && visited[ny][nx] == -1) {
					visited[ny][nx] = visited[cy][cx] + 1;
					que.add(new int[] {ny,nx});
				}
			}
		}
	}
	private static boolean check(int ny, int nx) {
		if(ny<0 || ny>=n || nx<0 || nx>=m) {return false;}
		return true;
	}
} // class

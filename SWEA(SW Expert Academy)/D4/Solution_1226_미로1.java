import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/* @date: 2020/05/13
 * @author: psS2mj
 * @brief: SWEA_1226_미로1 (D4) */

public class Solution_1226_미로1 {
	static int T, sy, sx, ey, ex;
	static int[][] maze, visited;
	static Queue<int[]> que  = new LinkedList<int[]>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			T = Integer.parseInt(br.readLine());
			maze = new int[16][16];
			visited = new int[16][16];
			for (int i = 0; i < 16; i++) {
				String str = br.readLine();
				for (int j = 0; j < 16; j++) {
					maze[i][j] = str.charAt(j) - '0';
					if(maze[i][j] == 2) {
						sy = i;
						sx = j;
					} else if(maze[i][j] == 3) {
						ey = i;
						ex = j;
					}
				}
			}
			bfs(sy,sx);
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(T).append(" ");
			if(visited[ey][ex]==1) {
				sb.append(1);
			} else {
				sb.append(0);
			}
			System.out.println(sb);
		}
	} // main
	// 상하좌우
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	private static void bfs(int y, int x) {
		que.clear();
		visited[y][x]++;
		que.add(new int[] {y,x});
		while(!que.isEmpty()) {
			int curr[] = que.poll();
			int cy = curr[0];
			int cx = curr[1];
			for (int d = 0; d < 4; d++) {
				int ny = cy + dy[d];
				int nx = cx + dx[d];
				if(!check(ny,nx)) {continue;}
				if(visited[ny][nx]==0 && (maze[ny][nx]==0)||(maze[ny][nx]==3)) {
					visited[ny][nx]++;
					que.add(new int[] {ny,nx});
				}
			}
		}
	}
	private static boolean check(int ny, int nx) {
		if(ny<0 || ny>=16 || nx<0 || nx>=16) {return false;}
		return true;
	}
} // class

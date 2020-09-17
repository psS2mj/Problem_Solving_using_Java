/* @date: 2020/03/27
 * @author: psS2mj
 * @brief: BOJ_2178_미로탐색 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2178_미로탐색 {

	static int N, M;
	static int[][] maze, visited;
	static Queue<int[]> que = new LinkedList<int[]>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		maze = new int[N][M];
		visited = new int[N][M];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				maze[i][j] = str.charAt(j) - '0';
			}
		}
		bfs(0,0);
		System.out.println(visited[N-1][M-1]);
	}

	
	// 상하좌우
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	
	private static void bfs(int y, int x) {
		que.clear();
		que.offer(new int[] {y,x});
		visited[y][x] = 1;
		while(!que.isEmpty()) {
			int[] curr = que.poll();
			int cy = curr[0];
			int cx = curr[1];
			for (int d = 0; d < 4; d++) {
				int ny = cy + dy[d];
				int nx = cx + dx[d];
				if(!check(ny,nx)) {continue;}
				if(maze[ny][nx]==1 && visited[ny][nx]==0) {
					visited[ny][nx] = visited[cy][cx] + 1;
					que.offer(new int[] {ny,nx});
				}
			}
		}
	}

	private static boolean check(int ny, int nx) {
		if(ny<0 || nx<0 || ny>=N || nx>=M) {return false;}
		return true;
	}
}

/* @date: 2020/03/27
 * @author: psS2mj
 * @brief: BOJ_1926_그림 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1926_그림 {

	static int n, m, count;
	static int[][] paint, visited;
	static Queue<int[]> que = new LinkedList<int[]>();
	static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 세로 크기
		m = Integer.parseInt(st.nextToken()); // 가로 크기
		paint = new int[n][m];
		visited = new int[n][m];
		for (int i = 0; i < n; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				paint[i][j] = Integer.parseInt(st2.nextToken());
			}
		}
		int cnt = 0; // 그림의 개수
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(paint[i][j]==1 && visited[i][j]==0) {
					bfs(i,j);
					cnt++;
					max = (max>count)?max:count;
				}
			}
		}
		
		System.out.println(cnt);
		max = (cnt==0)?0:max;
		System.out.println(max);
	}

	// 상하좌우
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	
	private static void bfs(int y, int x) {
		count = 1; // 그림의 넓이를 구하기 위한 변수
		que.clear();
		que.offer(new int[] {y,x});
		visited[y][x] = count;
		while(!que.isEmpty()) {
			int[] curr = que.poll();
			int cy = curr[0];
			int cx = curr[1];
			for (int d = 0; d < 4; d++) {
				int ny = cy + dy[d];
				int nx = cx + dx[d];
				if(!check(ny,nx)) {continue;}
				if(paint[ny][nx]==1 && visited[ny][nx]==0) {
					visited[ny][nx]=++count;
					que.offer(new int[] {ny,nx});
				}
			}
		}
	}

	private static boolean check(int ny, int nx) {
		if(ny<0 || nx<0 || ny>=n || nx>=m) {return false;}
		return true;
	}
}

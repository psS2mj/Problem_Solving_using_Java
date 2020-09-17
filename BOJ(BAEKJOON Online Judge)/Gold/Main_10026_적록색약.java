import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/* @date: 2020/04/19
 * @author: psS2mj
 * @brief: BOJ_10026_적록색약 */

public class Main_10026_적록색약 {
	static char check;
	static int N, Ans1, Ans2;
	static char[][] print;
	static int[][] visited;
	static Queue<int[]> que = new LinkedList<int[]>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		print = new char[N][N];
		visited = new int[N][N];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				print[i][j] = str.charAt(j);
			}
		}
		// 적록색약이 아닌 사람
		Ans1 = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(visited[i][j] == 0) {
					check = print[i][j];
					bfs(i,j,++Ans1,check);
				}
			}
		}
		// 적록색약인 사람
		// visited 배열 재활용하기 위해 다시 0으로 초기화
		for(int[] v : visited) {
			Arrays.fill(v, 0);
		}
		// R을 다 G로 바꿔준다.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(print[i][j] == 'R') {print[i][j] = 'G';}
			}
		}
		Ans2 = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(visited[i][j] == 0) {
					check = print[i][j];
					bfs(i,j,++Ans2,check);
				}
			}
		}
		System.out.println(Ans1 + " " + Ans2);
	} // main
	// 상하좌우
	static int[] dy = {-1, 1, 0, 0};
	static int[] dx = {0, 0, -1, 1};
	private static void bfs(int y, int x, int cnt, char check) {
		que.clear();
		que.add(new int[] {y,x});
		visited[y][x] = cnt;
		while(!que.isEmpty()) {
			int[] curr = que.poll();
			int cy = curr[0];
			int cx = curr[1];
			for (int d = 0; d < 4; d++) {
				int ny = cy + dy[d];
				int nx = cx + dx[d];
				if(!check(ny,nx)) {continue;}
				if(print[ny][nx] == check && visited[ny][nx] == 0) {
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

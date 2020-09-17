/* @date: 2020/03/27
 * @author: psS2mj
 * @brief: BOJ_2667_단지번호붙이기 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Main_2667_단지번호붙이기 {

	static int N, tmp;
	static int[][] map, visited;
	static Queue<int[]> que = new LinkedList<int[]>();
	static Queue<Integer> count = new LinkedList<Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		count.clear();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visited = new int[N][N];
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = input.charAt(j) - '0';
			}
		}
		int cnt=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j]!=0 && visited[i][j]==0) {
					bfs(i,j,++cnt);
					count.offer(tmp);
				}
			}
		}
		
		System.out.println(cnt); // 군집의 개수 출력
		int[] crowd = new int[cnt]; // 군집의 개수를 크기로 갖는 배열 선언
		for (int i = 0; i < cnt; i++) {
			crowd[i] = count.poll();
		}
		Arrays.sort(crowd); // 오름차순
		for(int num : crowd) {
			System.out.println(num);
		}
	}
	
	// 상하좌우
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	
	private static void bfs(int y, int x, int cnt) {
		tmp = 1;
		que.clear();
		que.offer(new int[] {y,x});
		visited[y][x] = cnt;
		while(!que.isEmpty()) {
			int[] curr = que.poll();
			int cy = curr[0];
			int cx = curr[1];
			for (int d = 0; d < 4; d++) {
				int ny = cy + dy[d];
				int nx = cx + dx[d];
				if(!check(ny,nx)) {continue;}
				if(map[ny][nx]==1 && visited[ny][nx]==0) {
					visited[ny][nx] = cnt;
					tmp++;
					que.offer(new int[] {ny,nx});
				}
			}
		}
	}

	// 배열 범위를 벗어나는지 체크
	private static boolean check(int ny, int nx) {
		if(ny<0 || ny>=N || nx<0 || nx>=N) {return false;}
		return true;
	}

}

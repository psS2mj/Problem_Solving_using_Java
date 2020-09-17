import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* @date: 2020/03/30
 * @author: psS2mj
 * @brief: BOJ_7576_토마토 */

public class Main_7576_토마토 {

	static int N, M, firstCheck=0, dayCnt=-1;
	static int[][] tomato;
	static int[][] visited;
	static Queue<int[]> que = new LinkedList<int[]>();
	static Queue<int[]> tq = new LinkedList<int[]>(); 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken()); // 가로
		N = Integer.parseInt(st.nextToken()); // 세로
		tomato = new int[N][M];
		visited = new int[N][M];
		for (int i = 0; i < N; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				tomato[i][j] = Integer.parseInt(st2.nextToken());
				if(tomato[i][j]==0) {firstCheck++;}
			}
		}
		// 만약 저장될 때부터 모든 토마토가 익어있는 상태라면 종료 (익지 않은 토마토가 하나도 없을 때)
		if(firstCheck==0) {
			System.out.println("0");
			return;
		}
		// 그 외
		bfs();
		// 만약 토마토가 모두 익지는 못하는 상황이라면 종료 (bfs 후 토마토 배열에 익지 않은 토마토가 있을 때)
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(tomato[i][j]==0) {
					System.out.println("-1");
					return;
				}
			}
		}
		
		System.out.println(dayCnt);
	}

	// 상하좌우
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	
	private static void bfs() {
		// 맨 처음부터 익어있는 토마토들의 좌표를 큐에 넣는다.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(tomato[i][j]==1) {
					visited[i][j] = 1; // 뺄 수도 있긴 하지만 방문표시라는 목적에 부합하게 1로 초기화
					tq.offer(new int[] {i,j});
				}
			}
		}
		// 그 다음날부터는 이곳에서 반복적으로 처리
		while(!tq.isEmpty()) {
			int size = tq.size();
			for (int i = 0; i < size; i++) {
				que.offer(tq.poll());
			}
			while(!que.isEmpty()) {
				int[] curr = que.poll();
				int cy = curr[0];
				int cx = curr[1];
				for (int d = 0; d < 4; d++) {
					int ny = cy + dy[d];
					int nx = cx + dx[d];
					if(!check(ny,nx)) {continue;}
					if(tomato[ny][nx]==0 && visited[ny][nx]==0) {
						visited[ny][nx] = visited[cy][cx] + 1;
						tomato[ny][nx] = 1;
						tq.offer(new int[] {ny,nx});
					}
				}
			}
			dayCnt++;
		}
	}

	private static boolean check(int ny, int nx) {
		if(ny<0 || nx<0 || ny>=N || nx>=M) {return false;}
		return true;
	}
}

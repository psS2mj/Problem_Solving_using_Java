import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* @date: 2020/05/15
 * @author: psS2mj
 * @brief: BOJ_2623_음악프로그램 */

public class Main_2623_음악프로그램 {
	static int N, M, num, V1, V2;
	static int[] indegree, Ans;
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<>(); // 인접리스트
	static Queue<Integer> que = new LinkedList<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 가수
		M = Integer.parseInt(st.nextToken()); // 보조 PD (입력되는 줄의 수)
		indegree = new int[N+1]; // 진입차수
		Ans = new int[N]; // 결과 저장
		for (int i = 0; i <= N; i++) {
			adj.add(new ArrayList<Integer>());
		}
		// 위상정렬 로직 수행
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken()); // 입력되는 vertex의 개수
			V1 = Integer.parseInt(st.nextToken());
			for (int j = 1; j < num; j++) {
				V2 = Integer.parseInt(st.nextToken());
				adj.get(V1).add(V2);
				indegree[V2]++;
				V1 = V2;
			}
		}
		for (int i = 1; i <= N; i++) {
			if(indegree[i]==0) {que.add(i);}
		}
		for (int i = 0; i < N; i++) {
			if(que.isEmpty()) { // 남일이가 순서를 정하는 것이 불가능할 경우
				System.out.println(0);
				return; // 끝내기.
			}
			int curr = que.poll();
			Ans[i] = curr;
			for(int node : adj.get(curr)) {
				indegree[node]--;
				if(indegree[node]==0) {que.add(node);}
			}
		}
		// 결과 출력
		for(int i: Ans) {
			System.out.println(i);
		}
	} // main
} // class

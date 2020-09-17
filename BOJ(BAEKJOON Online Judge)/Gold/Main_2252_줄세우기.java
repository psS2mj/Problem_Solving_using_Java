import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* @date: 2020/05/14
 * @author: psS2mj
 * @brief: BOJ_2252_줄세우기 */

public class Main_2252_줄세우기 {
	static int N, M, V;
	static ArrayList<ArrayList<Integer>> adj;
	static int[] indegree;
	static Queue<Integer> que = new LinkedList<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 학생 수
		M = Integer.parseInt(st.nextToken()); // 비교횟수
		adj = new ArrayList<>(); // 인접리스트
		for (int i = 0; i <= N; i++) {
			adj.add(new ArrayList<Integer>());
		}
		indegree = new int[N + 1]; // 진입차수 저장할 배열
		// 인접리스트에 그래프의 정보 저장
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			adj.get(Integer.parseInt(st.nextToken())).add(V = Integer.parseInt(st.nextToken()));
			indegree[V]++;
		}
		// 위상정렬 로직 수행
		// 1. 진입차수가 0인 모든 vertex 찾기
		for (int i = 1; i <= N; i++) {
			if (indegree[i] == 0) {que.add(i);}
		}
		while(!que.isEmpty()) {
			int curr = que.poll();
			System.out.print(curr + " "); // 3. 결과 출력
			// 2. 연결된 모든 vertex와의 edge 제거
			for(int node : adj.get(curr)) {
				indegree[node]--;
				if(indegree[node] == 0) {que.add(node);}
			}
		}
	} // main
} // class

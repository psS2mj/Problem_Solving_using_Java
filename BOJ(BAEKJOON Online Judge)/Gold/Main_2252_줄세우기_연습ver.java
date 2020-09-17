import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* @date: 2020/05/13
 * @author: psS2mj
 * @brief: BOJ_2252_줄세우기 */

public class Main_2252_줄세우기_연습ver {
	static int N, M, V;
	static ArrayList<Integer>[] adj; // 그래프 정보를 저장할 인접리스트
	static int[] indegree; // 각 정점의 진입차수를 저장할 배열
	static Queue<Integer> que = new LinkedList<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 학생 수
		M = Integer.parseInt(st.nextToken()); // 비교횟수
		adj = new ArrayList[N+1];
		for (int i = 1; i <= N; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		indegree = new int[N+1];
		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			adj[Integer.parseInt(st.nextToken())].add(V = Integer.parseInt(st.nextToken())); // V1 -> V2
			indegree[V]++;
		}
		for (int i = 1; i <= N; i++) {
			if(indegree[i]==0) {que.add(i);}
		}
		while(!que.isEmpty()) {
			int curr = que.poll();
			System.out.print(curr + " ");
			for (int i = 0; i < adj[curr].size(); i++) {
				int node = adj[curr].get(i);
				indegree[node]--;
				if(indegree[node]==0) {que.add(node);}
			}
		}
	} // main
} // class

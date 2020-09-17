import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/05/28
 * @author: psS2mj
 * @brief: BOJ_2740_행렬 곱셈 */

public class Main_2740_행렬곱셈 {
	static int N, M, K;
	static int[][] first, second, result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 첫 번째 행렬
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		first = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				first[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 두 번째 행렬
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		second = new int[M][K];
		result = new int[N][K]; // 결과 행렬 사이즈는 N*K
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < K; j++) {
				second[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 행렬의 곱셈 연산 (i행의 성분 * j열의 성분을 곱한 것들의 합)
		for (int i = 0; i < N; i++) { // 3
			for (int j = 0; j < K; j++) { // 3
				for (int k = 0; k < M; k++) { // 2
					result[i][j] += first[i][k] * second[k][j];
				}
			}
		}
		// 결과 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	} // main
} // class

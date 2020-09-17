import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/05/25
 * @author: psS2mj
 * @brief: BOJ_1546_평균 */

public class Main_1546_평균 {
	static int N, M = -1;
	static int[] score;
	static double sum = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		score = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			score[i] = tmp;
			M = (M < tmp) ? tmp : M; // 입력된 점수 중 최댓값 구하기
		}
		// 새로운 점수의 총합 계산
		for (int i = 0; i < N; i++) {
			sum += (double) score[i] / M * 100;
		}
		// 새로운 평균 출력
		System.out.println(sum / N);
	} // main
} // class

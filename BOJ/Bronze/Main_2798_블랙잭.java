import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/05/25
 * @author: psS2mj
 * @brief: BOJ_2798_블랙잭 */

public class Main_2798_블랙잭 {
	static int N, M, max = Integer.MIN_VALUE;
	static int[] cards, result;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 카드의 개수
		M = Integer.parseInt(st.nextToken()); // 3장을 골랐을 때 합 (기준)
		cards = new int[N];
		result = new int[3]; // 3장씩 뽑기
		// 카드 입력
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		// 조합
		combi(0, 0);
		System.out.println(max);
	} // main

	private static void combi(int cnt, int cur) {
		if (cnt == 3) {
			int sum = 0;
			for (int i : result) {
				sum += i;
			}
			if (sum <= M) { // 합이 M을 넘지 않으면서
				max = (max < sum) ? sum : max; // M과 더 가까운 숫자를 max로 업데이트
			}
			return;
		}
		for (int i = cur; i < N; i++) {
			result[cnt] = cards[i];
			combi(cnt + 1, i + 1);
		}
	}
} // class

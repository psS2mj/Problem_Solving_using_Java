import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2021/05/02
 * @author: psS2mj
 * @brief: BOJ_11047_동전 0 */

public class BOJ_11047_동전0 {

	static int N, K, cnt = 0, idx = 0;
	static int[] coins;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		coins = new int[N];

		for (int i = N - 1; i >= 0; i--) {
			coins[i] = Integer.parseInt(br.readLine());
		}

		while (K > 0) {
			int cost = coins[idx];
			if (K >= cost) {
				int div = K / cost;
				cnt += div;
				K -= cost * div;
			}
			idx++;
		}

		System.out.println(cnt);

	} // main

}
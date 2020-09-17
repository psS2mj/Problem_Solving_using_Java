import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3_9229_한빈이와SpotMart {

	static int T, N, M, sum, max, cnt;
	static int[] snack;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
		for (int tc = 1; tc <= T; tc++) {
			max = Integer.MIN_VALUE;
			sum = 0;
			cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken()); // 과자 봉지의 개수
			M = Integer.parseInt(st.nextToken()); // 최대 무게
			snack = new int[N];

			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				snack[i] = Integer.parseInt(st2.nextToken());
			}

			int len = snack.length;
			for (int i = 0; i < len; i++) {
				for (int j = i + 1; j < len; j++) {
					sum = snack[i] + snack[j];
					if ((sum <= M) && (sum > max)) {
						max = sum;
						cnt++;
					}
				}
			}
			if (cnt == 0) {
				max = -1;
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}

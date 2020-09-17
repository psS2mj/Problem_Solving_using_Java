import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/* @date: 2020/04/29
 * @author: psS2mj
 * @brief: SWEA_4050_재관이의 대량 할인 (D4) */

public class Solution_4050_재관이의대량할인 {
	static int T, N, total;
	static Integer[] clothes;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			total = 0;
			N = Integer.parseInt(br.readLine()); // 옷의 개수
			clothes = new Integer[N+1];
			clothes[0] = 100001;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; i++) {
				clothes[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(clothes,Collections.reverseOrder()); // 역순으로 정렬
			for (int i = 1; i < clothes.length; i++) {
				if(i%3==0) {continue;} // index가 3의 배수일 때를 제외하고
				total += clothes[i]; // 나머지는 전부 다 지불해야 할 금액에 더해준다.
			}
			// 지불해야 할 최소 금액 출력
			System.out.println("#" + tc + " " + total);
		}
	} // main
} // class

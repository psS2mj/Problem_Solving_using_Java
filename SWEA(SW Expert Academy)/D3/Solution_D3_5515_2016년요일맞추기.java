import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/04/06
 * @author: psS2mj
 * @brief: SWEA_5515_2016년 요일 맞추기 (D3) */

public class Solution_D3_5515_2016년요일맞추기 {

	static int T, m, d, diff, Ans;
	static int[] days = {0,31,29,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			diff = 0;
			Ans = 4;
			StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			// 경과일 계산
			if(m==1) {diff=d-1;}
			else {
				for (int i = 2; i < m; i++) {
					diff += days[i];
				}
				diff = diff + 30 + d ; 
			}
			// 요일 계산
			int temp = diff%7;
			if(temp<=2) {
				Ans += temp;
			} else {
				Ans = Ans + temp - 7;
			}
			System.out.println("#" + tc + " " + Ans);
		}
	}

}

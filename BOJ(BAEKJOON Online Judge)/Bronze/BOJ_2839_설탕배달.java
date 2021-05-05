import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2021/05/05
 * @author: psS2mj
 * @brief: BOJ_2839_설탕 배달 */

public class BOJ_2839_설탕배달 {

	static int N, div, cnt = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		div = N % 5;
		
		switch (div) {
		case 0:
			cnt += N / 5;
			break;
		case 1:
			if (N < 6) {
				cnt = -1;
			} else {
				cnt += 2;
				N -= 6;
				cnt += N / 5;
			}
			break;
		case 2:
			if (N < 12) {
				cnt = -1;
			} else {
				cnt += 4;
				N -= 12;
				cnt += N / 5;
			}
			break;
		case 3:
			cnt += N / 5;
			N -= 5 * cnt;
			cnt += N / 3;
			break;
		case 4:
			if (N < 9) {
				cnt = -1;
			} else {
				cnt += 3;
				N -= 9;
				cnt += N / 5;
			}
			break;
		}

		System.out.println(cnt);

	} // main

}

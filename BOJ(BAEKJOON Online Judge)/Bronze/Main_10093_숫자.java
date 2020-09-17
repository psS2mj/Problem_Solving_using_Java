import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/05/24
 * @author: psS2mj
 * @brief: BOJ_10093_숫자 */

public class Main_10093_숫자 {
	static long A, B, start, end;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Long.parseLong(st.nextToken());
		B = Long.parseLong(st.nextToken());
		// 두 수 사이에 있는 수의 개수
		if (A == B) {
			System.out.println(0);
		} else {
			System.out.println(Math.abs(A - B) - 1);
		}
		// 두 수 사이에 있는 수를 오름차순으로 출력
		if (A > B) {
			start = B;
			end = A;
		} else {
			start = A;
			end = B;
		}
		for (long i = start + 1; i < end; i++) {
			System.out.print(i + " ");
		}
	} // main
} // class

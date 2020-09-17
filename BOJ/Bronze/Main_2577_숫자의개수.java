import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2020/04/22
 * @author: psS2mj
 * @brief: BOJ_2577_숫자의 개수 */

public class Main_2577_숫자의개수 {
	static int A, B, C, result, len;
	static int[] cnt = new int[10];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		A = Integer.parseInt(br.readLine());
		B = Integer.parseInt(br.readLine());
		C = Integer.parseInt(br.readLine());
		result = A * B * C;
		String str = result + "";
		for (int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i)-'0']++;
		}
		for (int n : cnt) {
			System.out.println(n);
		}
	} // main
} // class

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2020/05/06
 * @author: psS2mj
 * @brief: BOJ_11720_숫자의 합 */

public class Main_11720_숫자의합 {
	static int N, sum = 0;
	static String nums;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		nums = br.readLine();
		for (int i = 0; i < N; i++) {
			sum += nums.charAt(i) - '0';
		}
		System.out.println(sum);
	} // main
} // class

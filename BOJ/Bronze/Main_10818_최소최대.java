import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/05/08
 * @author: psS2mj
 * @brief: BOJ_10818_최소, 최대 */

public class Main_10818_최소최대 {
	static int N, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	static int[] nums;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		nums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		for (int n : nums) {
			min = (min > n) ? n : min;
			max = (max < n) ? n : max;
		}
		System.out.println(min + " " + max);
	} // main
} // class

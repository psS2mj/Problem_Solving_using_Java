import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/05/25
 * @author: psS2mj
 * @brief: BOJ_10807_개수 세기 */

public class Main_10807_개수세기 {
	static int N, v, cnt = 0;
	static int[] nums;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		nums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		v = Integer.parseInt(br.readLine());
		for(int n : nums) {
			if(n==v) {cnt++;}
		}
		System.out.println(cnt);
	} // main
} // class

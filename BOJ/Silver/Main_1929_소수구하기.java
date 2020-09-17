import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* @date: 2020/05/26
 * @author: psS2mj
 * @brief: BOJ_1929_소수 구하기 */

public class Main_1929_소수구하기 {
	static int M, N;
	static boolean[] nums;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		nums = new boolean[N + 1];
		Arrays.fill(nums, true);
		// 1은 소수가 아니므로 제거하고 시작. (0번 인덱스는 안 쓰는 칸이라서 제거)
		nums[0] = nums[1] = false;
		// M이상 N이하의 소수가 하나 이상 있는 입력만 주어지므로 N=1인 경우는 있을 수 없다.
		for (int i = 2; i < M; i++) {
			nums[i] = false;
		}
		// 에라토스테네스의 체
		for (int i = 2; i * i <= N; i++) {
			for (int j = i * i; j <= N; j += i) {
				nums[j] = false;
			}
		}
		// 결과 출력
		for (int i = 2; i < N + 1; i++) {
			if (nums[i] == true) {
				System.out.println(i);
			}
		}
	} // main
} // class

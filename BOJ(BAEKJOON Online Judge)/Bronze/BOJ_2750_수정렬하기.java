import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* @date: 2021/05/05
 * @author: psS2mj
 * @brief: BOJ_2750_수 정렬하기 */

public class BOJ_2750_수정렬하기 {

	static int N;
	static int[] nums;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		nums = new int[N];

		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(nums);

		for (int j = 0; j < N; j++) {
			System.out.println(nums[j]);
		}

	} // main

}

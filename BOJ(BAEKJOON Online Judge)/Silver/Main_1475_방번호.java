import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2020/05/25
 * @author: psS2mj
 * @brief: BOJ_1475_방 번호 */

public class Main_1475_방번호 {
	static String N;
	static int max = -1;
	static int[] nums = new int[10]; // 0부터 9까지 저장
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = br.readLine();
		int len = N.length();
		for (int i = 0; i < len; i++) {
			nums[N.charAt(i) - '0']++;
		}
		// 일단, 최소한 6, 9를 제외한 나머지 중 최대값만큼은 필요하다.
		for (int i = 0; i < 10; i++) {
			if (i == 6 || i == 9) {continue;}
			max = (max < nums[i]) ? nums[i] : max;
		}
		int sum = nums[6] + nums[9]; // 6과 9의 개수 더하기
		if (sum % 2 == 0) {
			sum /= 2;
		} else {
			sum /= 2;
			sum++;
		}
		max = (max < sum) ? sum : max;
		System.out.println(max);
	} // main
} // class

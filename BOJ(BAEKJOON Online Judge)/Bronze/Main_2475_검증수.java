import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* @date: 2020/06/08
 * @author: psS2mj
 * @brief: BOJ_2475_검증수 */

public class Main_2475_검증수 {
	static int num, sum = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 5; i++) {
			num = Integer.parseInt(st.nextToken());
			sum += (int) Math.pow(num, 2);
		}
		System.out.println(sum%10);
	}
}

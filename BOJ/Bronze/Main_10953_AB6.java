import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2020/04/22
 * @author: psS2mj
 * @brief: BOJ_10953_A+B-6 */

public class Main_10953_AB6 {
	static int T;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			String[] s = br.readLine().split(",");
			System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
		}
	}
}

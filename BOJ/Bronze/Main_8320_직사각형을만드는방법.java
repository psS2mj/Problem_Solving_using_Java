import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2020/05/26
 * @author: psS2mj
 * @brief: BOJ_8320_직사각형을 만드는 방법 */

public class Main_8320_직사각형을만드는방법 {
	static int n, Ans = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int num = (int) Math.sqrt(n);
		for (int i = 1; i <= num; i++) {
			Ans += n/i - (i-1);
		}
		System.out.println(Ans);
	} // main
} // class

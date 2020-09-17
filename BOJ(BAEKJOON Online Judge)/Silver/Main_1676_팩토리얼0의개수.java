import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @date: 2020/05/27
 * @author: psS2mj
 * @brief: BOJ_1676_팩토리얼 0의 개수 */

public class Main_1676_팩토리얼0의개수 {
	static int N, cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		// 0! = 1
		// 0이 생기는 경우: 2x5, 10 ==> 5의 개수만 세준다.
		for (int i = 1; i <= N; i++) {
			if(i%5==0) cnt++;
			if(i%25==0) cnt++;
			if(i%125==0) cnt++;
		}
		System.out.println(cnt);
	} // main
} // class
